package fr.diginamic.annotations;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Pays {
    @ToString(uppercase = true)
    private String nom;
    @ToString()
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
        Class<?> paysClass = this.getClass();
        Field[] fields = paysClass.getDeclaredFields();
        return Arrays.stream(fields).filter(field -> field.isAnnotationPresent(ToString.class)).map(field -> {
            try {
                return field.getName() + "=" + field.get(this);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.joining(", "));
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }
}
