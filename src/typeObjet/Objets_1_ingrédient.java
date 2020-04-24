package typeObjet;

public enum Objets_1_ingrédient {
    plaque_fer(3.2, 1, 1),
    plaque_cuivre(3.2, 1, 1),
    plaque_acier(16.0, 5, 1),
    cable_cuivre(0.5, 1, 2),
    barre_fer(0.5, 1, 2),
    baril_vide(1.0, 1, 1),
    brique_pierre(3.2, 2, 1),
    engrenage(0.5, 2, 1),
    coffre_bois(0.5, 2, 1),
    coffre_fer(0.5, 8, 1),
    coffre_acier(0.5, 8, 1),
    ;


    private double timeToCraft;
    private int nbRessourceForCraft;
    private int nbItemCraft;

    Objets_1_ingrédient(Double timeToCraft, int nbRessourceForCraft, int nbItemCraft) {
        this.timeToCraft = timeToCraft;
        this.nbRessourceForCraft = nbRessourceForCraft;
        this.nbItemCraft = nbItemCraft;
    }

    public double getTimeToCraft() {
        return timeToCraft;
    }

    public int getNbRessourceForCraft() {
        return nbRessourceForCraft;
    }

    public int getNbItemCraft() {
        return nbItemCraft;
    }
}
