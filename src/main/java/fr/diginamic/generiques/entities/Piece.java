package fr.diginamic.generiques.entities;

import java.util.List;

public class Piece<T extends Equipement> {
    private String nom;
    private List<T> equipements;

    public Piece(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<T> getEquipements() {
        return equipements;
    }

    public boolean addEquipement(T equipement) {
        if (equipement == null) {
            throw new IllegalArgumentException("Equipement cannot be null");
        }
        return equipements.add(equipement);
    }
}
