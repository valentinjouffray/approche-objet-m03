package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS(1, "Printemps"), ETE(2, "Ete"), AUTOMNE(3, "Automne"), HIVER(4, "Hiver");

    private int numero;
    private String nom;

    Saison(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
