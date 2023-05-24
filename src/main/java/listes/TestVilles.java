package listes;

import java.util.*;
import java.util.function.Consumer;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Collection représente le concept de Collection : ArrayList implémente Collection
        // Cela a pour effet qu'ArrayList a une liste de méthode imposée par Collection

        Collections.sort(villes, new VillePopComparator(false)); // la méthode sort appelle votre méthode compareTo

        for (Ville v: villes) {
            System.out.println(v);
        }
        System.out.println("-----------------------------");

        Ville ville = Collections.min(villes, new VilleNomComparator());
        System.out.println(ville);

        System.out.println("-----------------------------");
        for (Ville v: villes) {
            System.out.println(v);
        }

    }
}
