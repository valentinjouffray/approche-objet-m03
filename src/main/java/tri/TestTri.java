package tri;

import listes.Ville;
import tri.comparators.ComparatorHabitant;
import tri.comparators.ComparatorNom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TestTri {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800)); // 256489413241
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Carcassonne", 47801)); // 256489413241

       villes.stream().mapToInt(v->v.getPop()).average(); // Filter Map Reduce ==> Traitement des Données.

    }
}
