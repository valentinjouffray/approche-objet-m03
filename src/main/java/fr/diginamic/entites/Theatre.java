package fr.diginamic.entites;

public class Theatre {
    String nom;
    int capaciteMax;
    private int nbClients;
    private double recette;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.nbClients = 0;
        this.recette = 0;
    }

    public int getNbClients() {
        return nbClients;
    }

    public double getRecette() {
        return recette;
    }

    public boolean inscrire(int nbClients, double prixParPlace) {
        if (this.nbClients + nbClients > this.capaciteMax) {
            System.out.printf("Il y a %d places disponibles, vous ne pouvez pas inscrire %d clients.%n", this.capaciteMax - this.nbClients, nbClients);
            return false;
        }
        this.nbClients += nbClients;
        this.recette += nbClients * prixParPlace;
        return true;
    }
}
