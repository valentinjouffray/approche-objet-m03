package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static final int CAPACITE_MAX = 100;
    public static final int NB_CLIENTS_PAR_INSCRIPTION = 12;
    public static final double PRIX_PAR_PLACE = 2.0;

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Comédie risquée", CAPACITE_MAX);
        while (theatre.inscrire(NB_CLIENTS_PAR_INSCRIPTION, PRIX_PAR_PLACE)) {
            System.out.printf("Il y a %d clients inscrits.%n", theatre.getNbClients());
            System.out.printf("La recette est de %.2f€.%n", theatre.getRecette());
        }
        System.out.println("--------------------------------");
        System.out.println("Il n'y a plus de places disponibles.");
        System.out.printf("Il y a %d clients inscrits.%n", theatre.getNbClients());
        System.out.printf("La recette est de %.2f€.%n", theatre.getRecette());
    }
}
