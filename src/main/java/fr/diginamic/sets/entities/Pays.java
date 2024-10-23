package fr.diginamic.sets.entities;

import java.util.Objects;

public class Pays {
    private String nom;
    private int nbHabitants;
    private double PIBParHabitant;

    public Pays(String nom, int nbHabitants, double PIBParHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.PIBParHabitant = PIBParHabitant;
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

    public double getPIBParHabitant() {
        return PIBParHabitant;
    }

    public void setPIBParHabitant(double PIBParHabitant) {
        this.PIBParHabitant = PIBParHabitant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pays pays)) return false;
        return Objects.equals(nom, pays.nom);
    }

    @Override
    public String toString() {
        return "Pays{" + "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", PIBParHabitant=" + PIBParHabitant +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }
}
