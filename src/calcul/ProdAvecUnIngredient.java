package calcul;

import typeObjet.Objets_1_ingrédient;
import typeProduction.ItemsDeProduction;

import java.util.Scanner;

public class ProdAvecUnIngredient extends ProdDeBase {



    public void productionUnIngredient(Objets_1_ingrédient objets, ItemsDeProduction itemsDeProduction){
        Scanner sc = new Scanner(System.in);

        //Faire une fonction qui analyse les entrées de l'user afin d'éviter le "." et mettre un "," à la place
        nbItemCraft = objets.getNbItemCraft();
        nbRessourceForCraft = objets.getNbRessourceForCraft();
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
        nbMachineInput = convSpeed / nbRessourceForCraft * timeToCraft;
        nbMachineOutput = timeToCraft * convSpeed * (1 / (productivityBonus / 100));

        // Calcul du besoin en infrastructures de la ligne de prod
        elctricConsumption(nbMachineOutput,energyConsumptionMachine);

        System.out.println("Il faudra " + df.format(nbMachineInput) + " machines pour avoir une saturation sur les convoyeurs en entrée de ligne de production" +
                "\nIl faudra " + df.format(nbMachineOutput) + " machines pour avoir une saturation sur les convoyeurs en sortie de chaîne de production." +
                "\nIl faudra en conséquence " + df.format(nbMachineOutput / nbMachineInput) + " ligne(s) de production !" +
                "\nLa ligne de production aura une pollution de " + pollutionMachine * nbMachineInput + " par minute." +
                "\nLa ligne de production consommera " + global + " watts." +
                "\nIl faudra en conséquent " + ef.format(nbSolarPannel+1) + " panneaux solaires et " + ef.format(nbAccumulators+1) + " accumulateurs pour maintenir une prod de jour comme de nuit.");
    }

}
