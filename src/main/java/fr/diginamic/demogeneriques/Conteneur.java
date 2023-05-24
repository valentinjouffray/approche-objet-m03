package fr.diginamic.demogeneriques;

import fr.diginamic.biologie.Carnivore;

public class Conteneur<T extends Carnivore, U> {

    private T identifiant;
    private U libelle;

    public Conteneur(T identifiant, U libelle) {
        this.identifiant = identifiant;
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Conteneur{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                '}';
    }

    public T getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(T identifiant) {
        this.identifiant = identifiant;
    }

    public U getLibelle() {
        return libelle;
    }

    public void setLibelle(U libelle) {
        this.libelle = libelle;
    }
}
