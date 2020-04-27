package calcul;

import typeObjet.Objets_1_ingrédient;
import typeProduction.ItemsDeProduction;

public class ProdAvecUnIngredient extends ProdClasseMere {



    public void productionUnIngredient(Objets_1_ingrédient objets, ItemsDeProduction itemsDeProduction){

        nbItemCraft = objets.getNbItemCraft();
        nbRessourceForCraft = objets.getNbRessourceForCraft();
        timeToCraft = objets.getTimeToCraft();


        //Demande des caractéristiques de la machine
        speedCraftingMachine = itemsDeProduction.getVitesseProduction();
        pollutionMachine = itemsDeProduction.getPollution();
        energyConsumptionMachine = itemsDeProduction.getConsommationElectrique();

        // Demande le nombre de modules et leurs niveaux
        module();
        // Demande le niveau des convoyeurs
        convoyeur();

        // Calcul de l'impact des trois modules
        speedModuleImpact(speedModuleLevel, nbSpeedModule);
        productivityModuleImpact(productivityModuleLevel, nbProductivityModule);
        efficiencyModuleImpact(efficiencyModuleLevel, nbEfficiencyModule);

        // Calcul de la vitesse de la machine de production en fonction des modules installés
        speedCraftingMachine *= speedModif / 100;
        // Calcul du temps de craft d'un item
        timeToCraft /= speedCraftingMachine;
        // Calcul de la pollution engendrée par la machine en fonction des modules installés
        pollutionMachine *= pollutionMultiplier / 100;

        // Calcul de la consommation énergétique par machine en fonction des modules installés
        if ((energyConsumption / 100) >= minEnergyConsumptionMachine) {
            energyConsumptionMachine *= energyConsumption / 100;
        } else if ((energyConsumption / 100) < minEnergyConsumptionMachine) {
            energyConsumptionMachine *= minEnergyConsumptionMachine;
        }

        // Ajout d'un facteur de 100% car deux ingrédients sont crafts par cycle
        if (nbItemCraft == 2) {
            productivityBonus -= 100;
            productivityBonus *= 2;
            productivityBonus += 200;
        }

        // Calcul du nombre de machine nécssaire pour l'entrée et la sortie des matériaux
        nbMachineInput = convSpeed / nbRessourceForCraft * timeToCraft;
        nbMachineOutput = timeToCraft * convSpeed * (1 / (productivityBonus / 100));

        // Calcul du besoin en infrastructures de la ligne de prod
        elctricConsumption(nbMachineOutput,energyConsumptionMachine);
        System.out.println("Il faudra " + df.format(nbMachineInput) + " machines pour consommer toutes les ressources disponibles sur un convoyeur saturé." +
                "\nIl faudra " + df.format(nbMachineOutput) + " machines pour avoir une saturation sur les convoyeurs en sortie de chaîne de production." +
                "\nIl faudra en conséquence " + df.format(nbMachineOutput / nbMachineInput) + " ligne(s) de production pour obtenir une saturation en sortie." +
                "\nLa ligne de production aura une pollution de " + ef.format(pollutionMachine * nbMachineInput) + " par minute." +
                "\nLa ligne de production consommera " + ef.format(global) + " watts." +
                "\nIl faudra en conséquence " + ef.format(nbSolarPannel+1) + " panneaux solaires et " + ef.format(nbAccumulators+1) + " accumulateurs pour maintenir une prod de jour comme de nuit.");
    }
}