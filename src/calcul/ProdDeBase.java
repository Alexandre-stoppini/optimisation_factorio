package calcul;

public class ProdDeBase {


    // Nombre de modules
    protected int nbSpeedModule;
    protected int nbProductivityModule;
    protected int nbEfficiencyModule;

    // Etablissement des différentes caractéristiques des trois modules
    protected double speedModif = 100; // Modification de la vitesse en pourcent
    protected double energyConsumption = 100; // Consommation energétique du module en pourcent
    protected double productivityBonus = 100; // Bonus de production d'un item en pourcent
    protected double pollutionMultiplier = 100; // Taux de pollution de l'objet en pourcent

    // Niveaux des modules
    protected int speedModuleLevel;
    protected int productivityModuleLevel;
    protected int efficiencyModuleLevel;

    protected int nbIngredientDifferent; // nombre d'ingrédient(s) différent nécessaire(s) à la fabrication d'un item
    protected int nbRessourceForCraft; // nombre de ressources nécesaire au craft de un objet
    protected double nbMachineInput; // nombre de machine nécessaire pour avoir une saturation entrante
    protected double nbMachineOutput; // nombre de machine nécessaire pour avoir une saturation sortante
    protected int convSpeed; // vitesse du convoyeur
    protected double timeToCraft; // vitesse de craft de base de l'item désiré
    protected double speedCraftingMachine; // coefficient de vitesse de la machine de production
    protected double pollutionMachine; // pollution de base de la machine
    protected double energyConsumptionMachine; // consommation énerétique de base de la machine
    protected double minEnergyConsumptionMachine = 0.20; // niveau minimal d'énergie consommée par une machine (20% de sa valeur de base)
    protected int nbItemCraft; // nombre d'item craft à la sortie d'une machine
    protected double nbSolarPannel; // nombre de panneaux solaires nécessaire au bon fonctionnement de la ligne de prod
    protected double nbAccumulators; // nombre d'accumulateurs nécessaire au craft d'un objet
    protected double global; // consommation global de la ligne de prod

    protected java.text.DecimalFormat df =new java.text.DecimalFormat("0.##"); // défini le nombre de chiffres après le zéro afin d'arrondir un nombre complexe
    protected java.text.DecimalFormat ef= new java.text.DecimalFormat(("0"));


    protected void speedModuleImpact(int speedModuleLevel, int nbSpeedModule) {
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

    protected void productivityModuleImpact(int productivityModuleLevel, int nbProductivityModule) {
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

    protected void efficiencyModuleImpact(int efficiencyModuleLevel, int nbEfficiencyModule) {
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
    protected void elctricConsumption(double nbMachineOutput, double energyConsumptionMachine){
        global = nbMachineOutput * energyConsumptionMachine;
        nbSolarPannel = global /  42;
        nbAccumulators = nbSolarPannel*0.84;
    }
}