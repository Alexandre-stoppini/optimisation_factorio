package calcul;

import typeObjet.Objets;
import typeProduction.ItemsDeProduction;

import java.util.Scanner;

public class ProdDeBase {


    // Nombre de modules
    private int nbSpeedModule;
    private int nbProductivityModule;
    private int nbEfficiencyModule;

    // Etablissement des différentes caractéristiques des trois modules
    private double speedModif = 100; // Modification de la vitesse en pourcent
    private double energyConsumption = 100; // Consommation energétique du module en pourcent
    private double productivityBonus = 100; // Bonus de production d'un item en pourcent
    private double pollutionMultiplier = 100; // Taux de pollution de l'objet en pourcent

    // Niveaux des modules
    private int speedModuleLevel; // niveau du module de vitesse
    private int productivityModuleLevel;
    private int efficiencyModuleLevel;

    private int nbRessouceForCraft; // nombre de ressoucres nécesaire au craft de un objet
    private double nbMachineInput; // nombre de machine nécessaire pour avoir une saturation entrante
    private double nbMachineOutput; // nombre de machine nécessaire pour avoir une saturation sortante
    private int convSpeed; // vitesse du convoyeur
    private double timeToCraft; // vitesse de craft de base de l'item désiré
    private double speedCraftingMachine; // coefficient de vitesse de la machine de production
    private double pollutionMachine; // pollution de base de la machine
    private double energyConsumptionMachine; // consommation énerétique de base de la machine
    private double minEnergyConsumptionMachine = 0.20; // niveau minimal d'énergie consommée par une machine (20% de sa valeur de base)
    private int nbItemCraft;

    // Définition de l'arrondi à 2 chiffres après la virgule
    java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");


    public void production(Objets objets, ItemsDeProduction itemsDeProduction) {
        Scanner sc = new Scanner(System.in);

        //Faire une fonction qui analyse les entrées de l'user afin d'éviter le "." et mettre un "," à la place
        nbItemCraft = objets.getNbItemCraft();
        nbRessouceForCraft = objets.getNbRessourceForCraft();
        timeToCraft = objets.getTimeToCraft();


        //Demande des caractéristiques de la machine
        speedCraftingMachine = itemsDeProduction.getVitesseProduction();
        pollutionMachine = itemsDeProduction.getPollution();
        energyConsumptionMachine = itemsDeProduction.getConsommationElectrique();

        // Demande le nombre de modules et leurs niveaux
        System.out.println("Nombre de module de vitesse :");
        nbSpeedModule = sc.nextInt();
        if (nbSpeedModule != 0) {
            System.out.println("Niveau des modules de vitesse :");
            speedModuleLevel = sc.nextInt();
        }
        System.out.println("Nombre de module de productivité :");
        nbProductivityModule = sc.nextInt();
        if (nbProductivityModule != 0) {
            System.out.println("Niveau des modules de productivité :");
            productivityModuleLevel = sc.nextInt();
        }
        System.out.println("Nombre de module d'efficacité :");
        nbEfficiencyModule = sc.nextInt();
        if (nbEfficiencyModule != 0) {
            System.out.println("Niveau des modules d'efficacité :");
            efficiencyModuleLevel = sc.nextInt();
        }

        System.out.println("Niveau des convoyeurs :");
        convSpeed = sc.nextInt();
        if (convSpeed == 1) {
            convSpeed = 15;
        } else if (convSpeed == 2) {
            convSpeed = 30;
        } else if (convSpeed == 3) {
            convSpeed = 45;
        }

        // Calcul de l'impact des trois modules
        speedModuleImpact(speedModuleLevel, nbSpeedModule);
        productivityModuleImpact(productivityModuleLevel, nbProductivityModule);
        efficiencyModuleImpact(efficiencyModuleLevel, nbEfficiencyModule);

        // Calcul de la vitesse de la machine de production en fonction des modules installés
        speedCraftingMachine *= speedModif / 100;

        // Calcul de la pollution engendrée par la machine en fonction des modules installés
        pollutionMachine *= pollutionMultiplier / 100;

        // Calcul de la consommation énergétique par machine en fonction des modules installés


        if ((energyConsumption / 100) >= minEnergyConsumptionMachine) {
            energyConsumptionMachine *= energyConsumption / 100;
        } else if ((energyConsumption / 100) < minEnergyConsumptionMachine) {
            energyConsumptionMachine *= minEnergyConsumptionMachine;
        }

        // Calcul du temps de craft d'un item
        timeToCraft /= speedCraftingMachine;

        // Calcul du nombre de machine nécssaire pour l'entrée et la sortie des matériaux
        nbMachineInput = convSpeed / nbRessouceForCraft * timeToCraft;
        nbMachineOutput = timeToCraft * convSpeed * (1 / (productivityBonus / 100));

        System.out.println("Il faudra " + df.format(nbMachineInput) + " machines pour avoir une saturation sur les convoyeurs en entrée de ligne de production" +
                "\nIl faudra " + df.format(nbMachineOutput) + " machines pour avoir une saturation sur les convoyeurs en sortie de chaîne de production." +
                "\nIl faudra en conséquence " + df.format(nbMachineOutput / nbMachineInput) + " ligne(s) de production !" +
                "\nUne machine pollura de  " + pollutionMachine + " untité(s) par seconde." +
                "\nUne machine consommera " + energyConsumptionMachine + " watts.");
    }


    void speedModuleImpact(int speedModuleLevel, int nbSpeedModule) {
        for (int i = 0; i < nbSpeedModule; i++) {
            if (speedModuleLevel == 1) {
                speedModif += 20;
                energyConsumption += 50;
            } else if (speedModuleLevel == 2) {
                speedModif += 30;
                energyConsumption += 60;
            } else if (speedModuleLevel == 3) {
                speedModif += 50;
                energyConsumption += 70;
            }
        }
    }

    void productivityModuleImpact(int productivityModuleLevel, int nbProductivityModule) {
        for (int i = 0; i < nbProductivityModule; i++) {
            if (productivityModuleLevel == 1) {
                productivityBonus += 4;
                energyConsumption += 40;
                speedModif -= 15;
                pollutionMultiplier += 5;
            } else if (productivityModuleLevel == 2) {
                productivityBonus += 6;
                energyConsumption += 60;
                speedModif -= 15;
                pollutionMultiplier += 7;
            } else if (productivityModuleLevel == 3) {
                productivityBonus += 10;
                energyConsumption += 80;
                speedModif -= 15;
                pollutionMultiplier += 10;
            }
        }
    }

    void efficiencyModuleImpact(int efficiencyModuleLevel, int nbEfficiencyModule) {
        for (int i = 0; i < nbEfficiencyModule; i++) {
            if (efficiencyModuleLevel == 1) {
                energyConsumption -= 30;
            } else if (efficiencyModuleLevel == 2) {
                energyConsumption -= 40;
            } else if (efficiencyModuleLevel == 3) {
                energyConsumption -= 50;
            }
        }
    }
}