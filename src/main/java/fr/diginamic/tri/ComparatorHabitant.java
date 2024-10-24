package fr.diginamic.tri;

import fr.diginamic.listes.entities.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    public ComparatorHabitant() {
    }

    @Override
    public int compare(Ville ville1, Ville ville2) {
        // Tri ordre décroissant (donc on inverse l'ordre)
        return Integer.compare(ville2.getNbHabitants(), ville1.getNbHabitants());
    }
}
