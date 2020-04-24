package typeObjet;

import java.util.Scanner;

public class ChoixObjet_2_Ingredients {
    private static Scanner sc = new Scanner(System.in);
    public static void ChoixTypeObjet2() {
        System.out.println("Quel objet souhaitez-vous crafter ?" +
                "\n1/ reservoir" +
                "\n2/ convoyeur_jaune" +
                "\n3/ convoyeur_rouge" +
                "\n4/ convoyeur_jaune_souterrain" +
                "\n5/ convoyeur_rouge_souterrain" +
                "\n6/ bras_robotise_filtrant" +
                "\n7/ bras_robotise_filtrant_haute_capacite" +
                "\n8/ petit_poteau_electrique" +
                "\n9/ tuyau_souterrain" +
                "\n10/ signal_rail" +
                "\n11/ signal_rail_chaine" +
                "\n12/ robot_logistique" +
                "\n13/ robot_combat" +
                "\n14/ fil_rouge" +
                "\n15/ fil_vert" +
                "\n16/ calculateur" +
                "\n17/ comparateur" +
                "\n18/ emetteur_de_constante" +
                "\n19/ pack_reparation" +
                "\n20/ accumulateur" +
                "\n21/ conduite_de_chaleur" +
                "\n22/ machine_assemblage_3" +
                "\n23/ module_vitesse_1" +
                "\n24/ module_efficacite_1" +
                "\n25/ module_productivite_1" +
                "\n26/ barre_plastique" +
                "\n27/ souffre" +
                "\n28/ circuit_electronique" +
                "\n29/ controle_fusée" +
                "\n30/ rocket_fuel" +
                "\n31/ combustible_nucleaire" +
                "\n32/ science_pack_rouge" +
                "\n33/ science_pack_vert");
    }

    public static Objets_2_Ingredients typeObjet(){
        while (true){
            String choixObj = sc.next();
            if (choixObj.contains("1")){
                return Objets_2_Ingredients.reservoir;
            } else if (choixObj.contains("2")){
                return Objets_2_Ingredients.convoyeur_jaune;
            }else if (choixObj.contains("3")){
                return Objets_2_Ingredients.convoyeur_rouge;
            }else if (choixObj.contains("4")){
                return Objets_2_Ingredients.convoyeur_jaune_souterrain;
            }else if (choixObj.contains("5")){
                return Objets_2_Ingredients.convoyeur_rouge_souterrain;
            }else if (choixObj.contains("6")){
                return Objets_2_Ingredients.bras_robotise_filtrant;
            }else if (choixObj.contains("7")){
                return Objets_2_Ingredients.bras_robotise_filtrant_haute_capacite;
            }else if (choixObj.contains("8")){
                return Objets_2_Ingredients.petit_poteau_electrique;
            }else if (choixObj.contains("9")){
                return Objets_2_Ingredients.tuyau_souterrain;
            }else if (choixObj.contains("10")){
                return Objets_2_Ingredients.signal_rail;
            }else if (choixObj.contains("11")){
                return Objets_2_Ingredients.signal_rail_chaine;
            }else if (choixObj.contains("12")){
                return Objets_2_Ingredients.robot_logistique;
            }else if (choixObj.contains("13")){
                return Objets_2_Ingredients.robot_combat;
            }else if (choixObj.contains("14")){
                return Objets_2_Ingredients.fil_rouge;
            }else if (choixObj.contains("15")){
                return Objets_2_Ingredients.fil_vert;
            }else if (choixObj.contains("16")){
                return Objets_2_Ingredients.calculateur;
            }else if (choixObj.contains("17")){
                return Objets_2_Ingredients.comparateur;
            }else if (choixObj.contains("18")){
                return Objets_2_Ingredients.emetteur_de_constante;
            }else if (choixObj.contains("19")){
                return Objets_2_Ingredients.pack_reparation;
            }else if (choixObj.contains("20")){
                return Objets_2_Ingredients.accumulateur;
            }else if (choixObj.contains("21")){
                return Objets_2_Ingredients.conduite_de_chaleur;
            }else if (choixObj.contains("22")){
                return Objets_2_Ingredients.machine_assemblage_3;
            }else if (choixObj.contains("23")){
                return Objets_2_Ingredients.module_vitesse_1;
            }else if (choixObj.contains("24")){
                return Objets_2_Ingredients.module_efficacite_1;
            }else if (choixObj.contains("25")){
                return Objets_2_Ingredients.module_productivite_1;
            }else if (choixObj.contains("26")){
                return Objets_2_Ingredients.barre_plastique;
            }else if (choixObj.contains("27")){
                return Objets_2_Ingredients.souffre;
            }else if (choixObj.contains("28")){
                return Objets_2_Ingredients.circuit_electronique;
            }else if (choixObj.contains("29")){
                return Objets_2_Ingredients.controle_fusée;
            }else if (choixObj.contains("30")){
                return Objets_2_Ingredients.rocket_fuel;
            }else if (choixObj.contains("31")) {
                return Objets_2_Ingredients.combustible_nucleaire;
            }else if (choixObj.contains("32")) {
                return Objets_2_Ingredients.science_pack_rouge;
            }else if (choixObj.contains("33")) {
                return Objets_2_Ingredients.science_pack_vert;
            }
        }
    }
}
