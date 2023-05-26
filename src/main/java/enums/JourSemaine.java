package enums;

public enum JourSemaine {

    LUNDI("Lundi"),
    MARDI("Mardi"),
    MERCREDI("Mercredi"),
    JEUDI("Jeudi"),
    VENDREDI("Vendredi"),
    SAMEDI("Samedi"),
    DIMANCHE("Dimanche");

    private String nom;

    private JourSemaine(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
