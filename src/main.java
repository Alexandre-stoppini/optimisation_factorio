import typeObjet.ChoixObjet;
import typeObjet.Objets;
import calcul.ProdDeBase;
import menu.Again;
import menu.ListeChoix;

public class main {
    public static void main(String[] args) {
        boolean c = false;

        do {
            // Première étape, demander à l'utilisateur l'objet à craft
            ChoixObjet.choixTypeObjet();
            Objets objets = ChoixObjet.typeObjet();
            System.out.println("Vous avez choisi "+objets);

            // Deuxième étape création de l'objet prodDeBase et exécution de la méthode
            ProdDeBase prodDeBase = new ProdDeBase();
            prodDeBase.production(objets);

            // Demander à l'utilisateur s'il veut recommencer
            Again.askEncore();
            ListeChoix listeChoix = Again.encore();
            switch (listeChoix) {
                case O:
                    c = true;
                    break;
                case N:
                    c = false;
                    break;
            }
        } while (c == true);
    }
}
