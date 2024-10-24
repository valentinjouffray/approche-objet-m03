package fr.diginamic.listes;

import fr.diginamic.listes.entities.Continent;
import fr.diginamic.listes.entities.Ville;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> villeList = List.of(new Ville("Nice", 343_000, Continent.EUROPE), new Ville("Carcassonne", 47_800, Continent.EUROPE), new Ville("Narbonne", 53_400, Continent.EUROPE), new Ville("Lyon", 484_000, Continent.EUROPE), new Ville("Foix", 9_700, Continent.EUROPE), new Ville("Pau", 77_200, Continent.EUROPE), new Ville("Marseille", 850_700, Continent.EUROPE), new Ville("Tarbes", 40_600, Continent.EUROPE));

        Ville villeMaxHabitants = villeList.stream().max(Comparator.comparingInt(Ville::getNbHabitants)).orElse(null);
        System.out.printf("Ville avec max habitants : %s%n", villeMaxHabitants.getNom());
        System.out.println(villeMaxHabitants.getNom());
        System.out.println(villeList.stream().map(Ville::getNom).reduce((acc, val) -> acc + ", " + val).orElse(""));
        Ville villeMoinsHabitannts = villeList.stream().min(Comparator.comparingInt(Ville::getNbHabitants)).orElse(null);
        villeList = villeList.stream().filter((ville) -> !ville.equals(villeMoinsHabitannts)).toList();
        System.out.printf("Villes sans celle avec le moins d'habitants : %s%n", villeList.stream().map(Ville::getNom).reduce((acc, val) -> acc + ", " + val).orElse(""));
        villeList = villeList.stream().map(ville -> {
            if (ville.getNbHabitants() > 100_000) {
                return new Ville(ville.getNom().toUpperCase(), ville.getNbHabitants(), ville.getContinent());
            }
            return ville;
        }).collect(Collectors.toList());
        String villeListString = villeList.stream().map(ville -> String.format("%s %d", ville.getNom(), ville.getNbHabitants())).reduce((acc, val) -> acc + ", " + val).orElse("");
        System.out.printf("Ville avec plus de 100_000 habitants en majuscules : %s%n", villeListString);
        //TP 14 tri
        villeList = villeList.stream().sorted().toList();
        System.out.println("Liste de villes triées dans l'ordre alphabétique :");
        villeList.forEach(ville -> System.out.printf("%s%n", ville.getNom()));
    }
}
