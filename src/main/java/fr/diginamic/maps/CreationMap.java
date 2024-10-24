package fr.diginamic.maps;

import java.util.Map;

public class CreationMap {
    public static void main(String[] args) {
        Map<String, Double> mapSalaires = Map.of("Paul", 1750.0, "Hicham", 1825.0, "Yu", 2250.0, "Ingrid", 2015.0);
        System.out.printf("Taille de la map: %d\n", mapSalaires.size());

    }
}
