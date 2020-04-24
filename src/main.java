import typeObjet.ChoixObjet;
import typeObjet.Objets_1_ingrédient;
import calcul.ProdDeBase;
import menu.Again;
import menu.ListeChoix;
import typeObjet.Objets_1_ingrédient;
import typeProduction.ChoixProduction;
import typeProduction.ItemsDeProduction;

public class main {
    public static void main(String[] args) {
        boolean c = false;

        do {
            // Première étape, demander à l'utilisateur l'objet à craft
            ChoixObjet.choixTypeObjet();
            Objets_1_ingrédient objets = ChoixObjet.typeObjet();
            System.out.println("Vous avez choisi " + objets);

            // Première étape, demander à l'utilisateur la machine servant à craft
            ChoixProduction.choixMachineCraft();
            ItemsDeProduction itemsDeProduction = ChoixProduction.machineCraft();
            System.out.println(objets + " sera craft dans " + itemsDeProduction);

            // Troisième étape création de l'objet prodDeBase et exécution de la méthode
            ProdDeBase prodDeBase = new ProdDeBase();
            prodDeBase.production(objets, itemsDeProduction);

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
