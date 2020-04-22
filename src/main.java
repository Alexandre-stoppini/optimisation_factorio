import calcul.ProdDeBase;
import menu.Again;
import menu.ListeChoix;

public class main {
    public static void main(String[] args) {
        boolean c = false;
        // Première étape création de l'objet prodDeBase et exécution de la méthode
        do {
            ProdDeBase prodDeBase = new ProdDeBase();

            prodDeBase.production();

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
