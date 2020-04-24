package typeProduction;

import java.util.Scanner;

public class ChoixProduction {
    private static Scanner sc = new Scanner(System.in);

    public static void choixMachineCraft() {
        System.out.println("Quelle machine de craft souhaitez-vous utiliser ? (taper un digit pour sélectionner)" +
                "\n1/ Four électrique" +
                "\n2/ Machine d'assemblage de niveau 1" +
                "\n3/ Machine d'assemblage de niveau 2" +
                "\n4/ Machine d'assemblage de niveau 3");
    }

    public static ItemsDeProduction machineCraft() {
        while (true) {
            String choixMachine = sc.next();
            if (choixMachine.contains("1")) {
                return ItemsDeProduction.four_electrique;
            } else if (choixMachine.contains("2")) {
                return ItemsDeProduction.machine_assemblage_1;
            } else if (choixMachine.contains("3")) {
                return ItemsDeProduction.machine_assemblage_2;
            } else if (choixMachine.contains("4")) {
                return ItemsDeProduction.machine_assemblage_3;
            }
        }
    }
}
