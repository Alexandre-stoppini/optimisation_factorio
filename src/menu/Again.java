package menu;


import java.util.Scanner;

public class Again {

    private static Scanner sc = new Scanner(System.in);

    public static void askEncore(){
        System.out.println("Voulez-vous faire un autre test ?");
    }

    public static ListeChoix encore(){
        while (true){
            String choix = sc.next();
            if (choix.length()>1 || choix.matches("^[on]")){
                System.out.println("Saisie incorrect, veuillez saisir 'O' ou 'N' .");
            } else if (choix.contains("o") || choix.contains("O")){
                System.out.println("Nouveau test lancé.");
                return ListeChoix.O;
            } else if (choix.contains("n")|| choix.contains("N")){
                System.out.println("Au revoir");
                return ListeChoix.N;
            }
        }
    }

}
