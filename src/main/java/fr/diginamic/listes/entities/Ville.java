package fr.diginamic.listes.entities;

import java.util.Objects;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
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

    @Override
    public String toString() {
        return "Ville{" + "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ville ville)) return false;

        if (getNbHabitants() != ville.getNbHabitants()) return false;
        return getNom() != null ? getNom().equals(ville.getNom()) : ville.getNom() == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHabitants);
    }
}
