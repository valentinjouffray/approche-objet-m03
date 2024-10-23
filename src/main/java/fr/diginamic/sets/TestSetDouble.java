package fr.diginamic.sets;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TestSetDouble {
    public static void main(String[] args) {
        Set<Double> doubleSet = Set.of(1.5d, 8.25d, -7.32d, 13.3d, -12.45d, 48.5d, 0.01d);
        String setString = getSetString(doubleSet);
        System.out.println(setString);
        Double max = getMax(doubleSet).orElseThrow(() -> new IllegalArgumentException("Set is empty"));
        System.out.printf("Max: %5.2f\n", max);
        Double min = getMin(doubleSet).orElseThrow(() -> new IllegalArgumentException("Set is empty"));
        doubleSet = doubleSet.stream().filter(d -> !d.equals(min)).collect(Collectors.toSet());
        System.out.printf("Set sans min : %s\n", getSetString(doubleSet));
    }

    private static Optional<Double> getMin(Collection<Double> collection) {
        return collection.stream().min(Double::compareTo);
    }

    private static Optional<Double> getMax(Collection<Double> collection) {
        return collection.stream().max(Double::compareTo);
    }

    private static String getSetString(Set<Double> doubleSet) {
        return doubleSet.stream().map(String::valueOf).reduce("", (acc, str) -> acc + str + " ");
    }
}