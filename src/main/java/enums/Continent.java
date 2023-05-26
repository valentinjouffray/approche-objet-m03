package enums;

public enum Continent {

    EUROPE("Europe"),
    AFRIQUE("Afrique"),
    ASIE("Asie"),
    OCEANIE("Océanie"),
    AMERIQUE("Amériques"),
    INDETERMINE("Indéterminé");

    private String nom;

    private Continent(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
