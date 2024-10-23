package fr.diginamic.listes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestListeString {
    public static void main(String[] args) {
        List<String> villeList = List.of("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
        System.out.printf("Ville avec le plus grand nombre de lettres : %s%n", villeList.stream().max(Comparator.comparingInt(String::length)).orElse(""));
        villeList = villeList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(villeList.stream().reduce((acc, val) -> acc + ", " + val).orElse(""));
        villeList = villeList.stream().filter((ville) -> ville.charAt(0) != 'N').collect(Collectors.toList());
        System.out.println(villeList.stream().reduce((acc, val) -> acc + ", " + val).orElse(""));
    }
}