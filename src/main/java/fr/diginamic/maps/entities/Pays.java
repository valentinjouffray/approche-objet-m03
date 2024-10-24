package fr.diginamic.maps.entities;

import java.util.Objects;

public class Pays {
    private String nom;
    private int nbHabitants;
    private String continent;

    public Pays(String nom, int nbHabitants, String continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pays pays)) return false;
        return Objects.equals(nom, pays.nom) && Objects.equals(continent, pays.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, continent);
    }

    @Override
    public String toString() {
        return "Pays{" + "nom='" + nom + '\'' + ", nbHabitants=" + nbHabitants + ", continent='" + continent + '\'' + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
