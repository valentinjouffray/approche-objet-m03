package fr.diginamic.maps;

import fr.diginamic.maps.entities.Pays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        Pays pays1 = new Pays("France", 65, "Europe");
        Pays pays2 = new Pays("Allemagne", 80, "Europe");
        Pays pays3 = new Pays("Belgique", 10, "Europe");
        Pays pays4 = new Pays("Russie", 150, "Asie");
        Pays pays5 = new Pays("Chine", 1_400, "Asie");
        Pays pays6 = new Pays("Indonésie", 220, "Océanie");
        Pays pays7 = new Pays("Australie", 20, "Océanie");

        List<Pays> paysList = List.of(pays1, pays2, pays3, pays4, pays5, pays6, pays7);

        Map<String, Integer> nbPaysParContinent = new HashMap<>();
        for (Pays pays : paysList) {
            String continent = pays.getContinent();
            if (nbPaysParContinent.containsKey(continent)) {
                nbPaysParContinent.put(continent, nbPaysParContinent.get(continent) + 1);
            } else {
                nbPaysParContinent.put(continent, 1);
            }
        }
        nbPaysParContinent.forEach((continent, nbPays) -> System.out.printf("Continent: %s, Nombre de pays: %d%n", continent, nbPays));
    }
}
