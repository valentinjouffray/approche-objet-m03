package fr.diginamic.testenumeration;

import java.util.Arrays;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison[] saisons = Saison.values();
        for (Saison saison : saisons) {
            System.out.println(saison);
        }

        String nom = "Ete";
        System.out.printf("Saison avec nom %s : %s%n", nom, Saison.valueOf(nom.toUpperCase()));

        String libelle = "Hiver";
        Saison saison = getSaisonFromLibelle(libelle);
        System.out.printf("Saison avec le libellé %s récupéré avec succès : %b%n", libelle, saison.getNom().equals(libelle));
    }

    private static Saison getSaisonFromLibelle(String libelle) {
        Saison[] saisons = Saison.values();
        for (Saison saison : saisons) {
            if (saison.getNom().equals(libelle)) {
                return saison;
            }
        }
        return Arrays.stream(saisons).filter(saison -> saison.getNom().equals(libelle)).findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
