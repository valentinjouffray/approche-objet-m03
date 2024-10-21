package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Salon salon = new Salon(20, 0);
        Cuisine cuisine = new Cuisine(15, 0);
        SalleDeBain salleDeBain = new SalleDeBain(10, 1);
        Toilette toilette = new Toilette(5, 1);

        Maison maison = new Maison();
        maison.ajouterPiece(salon);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(toilette);

        System.out.printf("Superficie totale de la maison: %.2f%n", maison.getSuperficieTotale());
        System.out.printf("Superficie totale de la maison à l'étage 0: %.2f%n", maison.getSuperficieEtage(0));
        System.out.printf("Superficie totale de la maison à l'étage 1: %.2f%n", maison.getSuperficieEtage(1));

        // Test avec des pièces null
        try {
            maison.ajouterPiece(null);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("Piece cannot be null")) {
                System.out.println("L'erreur est correctement rapportée");
            } else {
                System.out.println("ERREUR: L'erreur n'est pas correctement rapportée");
            }
        }

        // Test avec des pièces impossibles
        try {
            maison.ajouterPiece(new Salon(-20, 0));
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("La superficie ne peut pas être négative")) {
                System.out.println("L'erreur est correctement rapportée");
            } else {
                System.out.println("ERREUR: L'erreur n'est pas correctement rapportée");
            }
        }

        // Test avec des étages impossibles
        try {
            maison.ajouterPiece(new Salon(20, -2));
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("L'étage ne peut pas être en dessous de -1, l'entièreté du sous-sol compte comme -1")) {
                System.out.println("L'erreur est correctement rapportée");
            } else {
                System.out.println("ERREUR: L'erreur n'est pas correctement rapportée");
            }
        }

        System.out.printf("Superficie totale des salles de bain: %.2f%n", maison.getSuperficieTypePiece("SalleDeBain")); // 10
        maison.ajouterPiece(new SalleDeBain(10, 0));
        System.out.printf("Superficie totale des salles de bain: %.2f%n", maison.getSuperficieTypePiece("SalleDeBain")); // 20
    }
}
