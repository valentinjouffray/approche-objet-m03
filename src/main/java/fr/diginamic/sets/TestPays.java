package fr.diginamic.sets;

import fr.diginamic.sets.entities.Pays;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class TestPays {
    public static void main(String[] args) {
        Set<Pays> paysSet = Set.of(new Pays("France", 67_064_000, 41_463.0), new Pays("USA", 331_883_986, 65_298.0), new Pays("Allemagne", 83_149_300, 50_206.0), new Pays("UK", 66_573_504, 41_030.0), new Pays("Italie", 60_317_116, 35_708.0), new Pays("Japon", 126_010_000, 41_300.0), new Pays("Chine", 1_386_000_000, 9_711.0), new Pays("Russie", 144_500_000, 11_900.0), new Pays("Inde", 1_339_000_000, 2_170.0));

        Pays pibParHabitantMax = getPibParHabitantMax(paysSet);
        System.out.printf("Pays avec le PIB par habitant le plus élevé : %s\n", pibParHabitantMax.getNom());
        Pays pibTotalMax = getPibTotalMax(paysSet);
        System.out.printf("Pays avec le PIB total le plus élevé : %s\n", pibTotalMax.getNom());
        Pays paysPibTotalMin = getPibTotalMin(paysSet);
        paysSet = paysSet.stream().map(pays -> pays.equals(paysPibTotalMin) ? new Pays(paysPibTotalMin.getNom().toUpperCase(), paysPibTotalMin.getNbHabitants(), paysPibTotalMin.getPIBParHabitant()) : pays).collect(Collectors.toSet());
        System.out.printf("Pays avec le PIB total le plus faible en majuscules : %s\n", paysSet.stream().map(Pays::getNom).reduce((acc, val) -> acc + ", " + val).orElse(""));
        Pays paysPibTotalMinMaj = getPibTotalMin(paysSet);
        paysSet = paysSet.stream().filter(pays -> !pays.equals(paysPibTotalMinMaj)).collect(Collectors.toSet());
        System.out.printf("Pays sans celui avec le PIB total le plus faible : %s\n", paysSet.stream().map(Pays::getNom).reduce((acc, val) -> acc + ", " + val).orElse(""));
        //System.out.println(getSetString(paysSet));
        paysSet.stream().map(Pays::toString).forEach(System.out::println);
    }

    private static String getSetString(Collection<Pays> collection) {
        return collection.stream().map(Pays::toString).reduce((acc, val) -> acc + ", " + val).orElse("");
    }

    private static Pays getPibTotalMin(Collection<Pays> collection) {
        return collection.stream().min(Comparator.comparingDouble(pays -> pays.getNbHabitants() * pays.getPIBParHabitant())).orElseThrow(() -> new IllegalArgumentException("Collection is empty"));
    }

    private static Pays getPibTotalMax(Collection<Pays> collection) {
        return collection.stream().max(Comparator.comparingDouble(pays -> pays.getNbHabitants() * pays.getPIBParHabitant())).orElseThrow(() -> new IllegalArgumentException("Collection is empty"));
    }

    private static Pays getPibParHabitantMax(Collection<Pays> collection) {
        return collection.stream().max(Comparator.comparingDouble(Pays::getPIBParHabitant)).orElseThrow(() -> new IllegalArgumentException("Collection is empty"));
    }
}
