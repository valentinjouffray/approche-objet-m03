package fr.diginamic.generiques;

import fr.diginamic.generiques.entities.EquipementCuisine;
import fr.diginamic.generiques.entities.Piece;

public class EquipementMain {
    public static void main(String[] args) {
        Piece<EquipementCuisine> cuisine = new Piece<>("Cuisine");
        cuisine.addEquipement(new EquipementCuisine("Frigo"));
        cuisine.addEquipement(new EquipementCuisine("Four"));

        // Test échouant
        // cuisine.addEquipement(new EquipementSalleDeBain("Baignoire"));
    }
}
