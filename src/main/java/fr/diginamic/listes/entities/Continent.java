package fr.diginamic.listes.entities;

public enum Continent {
    EUROPE("Europe"), ASIE("Asie"), AFRIQUE("Afrique"), AMERIQUE("Amérique"), OCEANIE("Océanie");

    private String nom;

    Continent(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
