package fr.diginamic.fichier.entities;

import java.util.Objects;

public class Ville {
    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int population;

    public Ville(String nom, String codeDepartement, String nomRegion, int population) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ville ville)) return false;
        return codeDepartement == ville.codeDepartement && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, codeDepartement);
    }

    @Override
    public String toString() {
        return "Ville{" + "nom='" + nom + '\'' +
                ", codeDepartement=" + codeDepartement +
                ", nomRegion='" + nomRegion + '\'' +
                ", population=" + population +
                '}';
    }
}
