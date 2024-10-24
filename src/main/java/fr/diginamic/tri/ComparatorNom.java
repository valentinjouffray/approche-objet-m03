package fr.diginamic.tri;


import fr.diginamic.fichier.entities.Ville;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ComparatorNom implements Comparator<Ville> {

    private final Collator collator;

    public ComparatorNom() {
        collator = Collator.getInstance(Locale.FRANCE);
        collator.setStrength(Collator.PRIMARY);
    }

    @Override
    public int compare(Ville ville1, Ville ville2) {
        return collator.compare(ville1.getNom(), ville2.getNom());
    }
}
