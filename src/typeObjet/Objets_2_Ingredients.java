package typeObjet;

public enum Objets_2_Ingredients {
    reservoir(3.0, 20, 5, 1),
    convoyeur_jaune(0.5, 1, 1, 2),
    convoyeur_rouge(0.5, 5, 1, 1),
    convoyeur_jaune_souterrain(1.0, 10, 5, 2),
    convoyeur_rouge_souterrain(2.0, 40, 2, 2),
    bras_robotise_filtrant(0.5, 4, 1, 1),
    bras_robotise_filtrant_haute_capacite(0.5, 5, 1, 1),
    petit_poteau_electrique(0.5, 2, 1, 2),
    tuyau_souterrain(0.5, 5, 10, 2),
    signal_rail(0.5, 1, 5, 1),
    signal_rail_chaine(0.5, 1, 5, 1),
    robot_logistique(0.5, 2, 1, 1),
    robot_combat(0.5, 2, 1, 1),
    fil_rouge(0.5, 1, 1, 1),
    fil_vert(0.5, 1, 1, 1),
    calculateur(0.5, 5, 5, 1),
    comparateur(0.5, 5, 5, 1),
    emetteur_de_constante(0.5, 5, 2, 1),
    pack_reparation(0.5, 2, 2, 1),
    accumulateur(10.0, 5, 2, 1),
    conduite_de_chaleur(1.0, 20, 10, 1),
    machine_assemblage_3(0.5, 2, 4, 1),
    module_vitesse_1(15.0, 5, 5, 1),
    module_efficacite_1(15.0, 5, 5, 1),
    module_productivite_1(15.0, 5, 5, 1),
    barre_plastique(1.0, 1, 20, 2),
    souffre(1.0, 30, 30, 2),
    circuit_electronique(0.5, 3, 1, 1),
    controle_fusée(30.0, 1, 1, 1),
    rocket_fuel(30.0, 10, 10, 1),
    combustible_nucleaire(90.0, 1, 1, 1),
    science_pack_rouge(5.0, 1, 1, 1),
    science_pack_vert(6.0, 1, 1, 1),
    ;

    private double timeToCraft;
    private int nbRessourceForCraft_1;
    private int nbRessourceForCraft_2;
    private int nbItemCraft;

    Objets_2_Ingredients(Double timeToCraft, int nbRessourceForCraft_1, int nbRessourceForCraft_2, int nbItemCraft) {
        this.timeToCraft = timeToCraft;
        this.nbRessourceForCraft_1 = nbRessourceForCraft_1;
        this.nbRessourceForCraft_2 = nbRessourceForCraft_2;
        this.nbItemCraft = nbItemCraft;
    }

    public double getTimeToCraft() {
        return timeToCraft;
    }

    public int getNbRessourceForCraft_1() {
        return nbRessourceForCraft_1;
    }

    public int getNbRessourceForCraft_2() {
        return nbRessourceForCraft_2;
    }

    public int getNbItemCraft() {
        return nbItemCraft;
    }
}
