package typeProduction;

public enum ItemsDeProduction {
    four_electrique(2, 180, 1),
    machine_assemblage_1(0.5,75,4),
    machine_assemblage_2(0.75,150,3),
    machine_assemblage_3(1.25,375,2),
    ;

    private double vitesseProduction;
    private double consommationElectrique;
    private double pollution;

    ItemsDeProduction(double vitesseProduction, double consommationElectrique, double pollution) {
        this.vitesseProduction = vitesseProduction;
        this.consommationElectrique = consommationElectrique;
        this.pollution = pollution;
    }

    public double getVitesseProduction() {
        return vitesseProduction;
    }

    public double getConsommationElectrique() {
        return consommationElectrique;
    }

    public double getPollution() {
        return pollution;
    }
}
