package typeObjet;

import java.util.Scanner;

public class ChoixObjet_1_Ingredient {
    private static Scanner sc = new Scanner(System.in);

    public static void choixTypeObjet() {
        System.out.println("Quel objet souhaitez-vous crafter ?" +
                "\n1/ plaque_fer" +
                "\n2/ plaque_cuivre" +
                "\n3/ plaque_acier" +
                "\n4/ cable_cuivre" +
                "\n5/ barre_fer" +
                "\n6/ baril_vide" +
                "\n7/ engrenage" +
                "\n8/ brique_pierre" +
                "\n9/ coffre_bois" +
                "\n10/ coffre_fer" +
                "\n11/ coffre_acier");
    }

    public static Objets_1_ingrédient typeObjet() {
        while (true) {
            String choixObj = sc.next();
            if (choixObj.contains("plaque_fer") || choixObj.contains("1")) {
                return Objets_1_ingrédient.plaque_fer;
            } else if (choixObj.contains("plaque_cuivre") || choixObj.contains("2")) {
                return Objets_1_ingrédient.plaque_cuivre;
            } else if (choixObj.contains("plaque_acier") || choixObj.contains("3")) {
                return Objets_1_ingrédient.plaque_acier;
            } else if (choixObj.contains("cable_cuivre") || choixObj.contains("4")) {
                return Objets_1_ingrédient.cable_cuivre;
            } else if (choixObj.contains("barre_fer") || choixObj.contains("5")) {
                return Objets_1_ingrédient.barre_fer;
            } else if (choixObj.contains("baril_vide") || choixObj.contains("6")) {
                return Objets_1_ingrédient.baril_vide;
            } else if (choixObj.contains("engrenage") || choixObj.contains("7")) {
                return Objets_1_ingrédient.engrenage;
            } else if (choixObj.contains("brique_pierre") || choixObj.contains("8")) {
                return Objets_1_ingrédient.brique_pierre;
            } else if (choixObj.contains("coffre_bois") || choixObj.contains("9")) {
                return Objets_1_ingrédient.coffre_bois;
            } else if (choixObj.contains("coffre_fer") || choixObj.contains("10")) {
                return Objets_1_ingrédient.coffre_fer;
            } else if (choixObj.contains("coffre_acier") || choixObj.contains("11")) {
                return Objets_1_ingrédient.coffre_acier;
            }
        }
    }

}
