package fr.diginamic.testenumeration;

import fr.diginamic.listes.entities.Continent;
import fr.diginamic.listes.entities.Ville;

import java.util.List;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        Ville newYork = new Ville("New York", 8_622_698, Continent.AMERIQUE);
        Ville paris = new Ville("Paris", 2_148_271, Continent.EUROPE);
        Ville pekin = new Ville("Pékin", 21_516_000, Continent.ASIE);
        Ville moscou = new Ville("Moscou", 11_920_000, Continent.EUROPE);
        Ville berlin = new Ville("Berlin", 3_520_031, Continent.EUROPE);
        Ville sydney = new Ville("Sydney", 4_627_345, Continent.OCEANIE);
        Ville saoPaulo = new Ville("São Paulo", 12_038_175, Continent.AMERIQUE);
        Ville dakar = new Ville("Dakar", 1_146_053, Continent.AFRIQUE);

        List<Ville> villeList = List.of(newYork, paris, pekin, moscou, berlin, sydney, saoPaulo, dakar);
        villeList.forEach(System.out::println);
    }
}
