package fr.diginamic.listes.entities;

import java.text.Collator;
import java.util.Locale;
import java.util.Objects;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHabitants;
    private Continent continent;

    public Ville(String nom, int nbHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Ville{" + "nom='" + nom + '\'' + ", nbHabitants=" + nbHabitants + ", continent=" + continent.getNom() + '}';
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

    @Override
    public int compareTo(Ville ville) {
        // Paramétrage de la langue avec Collator
        Collator collator = Collator.getInstance(Locale.FRANCE);
        // Définition de la sensibilité
        collator.setStrength(Collator.PRIMARY);
        return collator.compare(this.nom, ville.nom);
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
