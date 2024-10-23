package fr.diginamic.listes;

import java.util.List;
import java.util.stream.Stream;

public class CreationListe {
    public static void main(String[] args) {
        List<Integer> integers = List.of(Stream.iterate(1, i -> i + 1).limit(100).toArray(Integer[]::new));
        System.out.printf("Size: %d\n", integers.size());
    }
}
