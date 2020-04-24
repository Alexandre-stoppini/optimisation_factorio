package menu;

import calcul.ProdAvecUnIngredient;
import typeObjet.ChoixObjet_1_Ingredient;
import typeObjet.Objets_1_ingrédient;
import typeProduction.ChoixProduction;
import typeProduction.ItemsDeProduction;

import java.util.Scanner;

public class ChoixNbIngredient {
    static Scanner sc = new Scanner(System.in);

    private static int choix;

    public static int askNbIngredient() {
        System.out.println("De combien d'ingrédients différents sera composé l'item à crafter ?");
        choix = sc.nextInt();
        return choix;
    }

    public static void nbIngredient() {
        if (choix == 1) {
            // Première étape, demander à l'utilisateur l'objet à craft
            ChoixObjet_1_Ingredient.choixTypeObjet();
            Objets_1_ingrédient objets = ChoixObjet_1_Ingredient.typeObjet();
            System.out.println("Vous avez choisi " + objets);

            // Deuxième étape, demander à l'utilisateur la machine servant à craft
            ChoixProduction.choixMachineCraft();
            ItemsDeProduction itemsDeProduction = ChoixProduction.machineCraft();
            System.out.println(objets + " sera craft dans " + itemsDeProduction);

            // Troisième étape création de l'objet prodDeBase et exécution de la méthode
            ProdAvecUnIngredient prodAvecUnIngredient = new ProdAvecUnIngredient();
            prodAvecUnIngredient.productionUnIngredient(objets, itemsDeProduction);
        } else if (choix == 2){

            ChoixProduction.choixMachineCraft();
            ItemsDeProduction itemsDeProduction = ChoixProduction.machineCraft();
            System.out.println(" sera craft dans " + itemsDeProduction);

        }else  if (choix == 3){

            ChoixProduction.choixMachineCraft();
            ItemsDeProduction itemsDeProduction = ChoixProduction.machineCraft();
            System.out.println(" sera craft dans " + itemsDeProduction);

        }else if (choix == 4){

            ChoixProduction.choixMachineCraft();
            ItemsDeProduction itemsDeProduction = ChoixProduction.machineCraft();
            System.out.println(" sera craft dans " + itemsDeProduction);

        } else if (choix == 5){

            ChoixProduction.choixMachineCraft();
            ItemsDeProduction itemsDeProduction = ChoixProduction.machineCraft();
            System.out.println(" sera craft dans " + itemsDeProduction);

        }else if (choix == 6){

            ChoixProduction.choixMachineCraft();
            ItemsDeProduction itemsDeProduction = ChoixProduction.machineCraft();
            System.out.println(" sera craft dans " + itemsDeProduction);

        }
    }
}
