package fr.diginamic.sets;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class TestSetString {
    public static void main(String[] args) {
        Set<String> stringSet = Set.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
        String maxCharacterCountry = getMaxCharacterCountry(stringSet);
        System.out.printf("Pays avec le plus de caractères : %s\n", maxCharacterCountry);
        stringSet = stringSet.stream().filter(s -> !s.equals(maxCharacterCountry)).collect(Collectors.toSet());
        System.out.printf("Set sans le pays avec le plus de caractères : %s\n", getSetString(stringSet));
    }

    private static String getSetString(Collection<String> collection) {
        return collection.stream().reduce("", (acc, str) -> acc + (!acc.isEmpty() ? ", " : "") + str);
    }

    private static String getMaxCharacterCountry(Collection<String> collection) {
        return collection.stream().max(Comparator.comparingInt(String::length)).orElseThrow(() -> new IllegalArgumentException("Set is empty"));
    }
}
