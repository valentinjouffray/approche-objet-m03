package fr.diginamic.listes;

import java.util.List;
import java.util.Objects;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(-1, 5, 7, 3, -2, 4, 8, 5);
        System.out.println(integerList.stream().map(String::valueOf).reduce((acc, value) -> acc + " " + value).orElse(""));
        System.out.printf("Size: %d%n", integerList.size());
        System.out.printf("Max: %d%n", integerList.stream().max(Integer::compareTo).orElse(0));
        List<Integer> integerListWithoutMin = List.copyOf(integerList.stream().min(Integer::compareTo).map(min -> integerList.stream().filter(value -> !Objects.equals(value, min)).toList()).orElse(List.of()));
        System.out.println(integerListWithoutMin.stream().map(String::valueOf).reduce((acc, value) -> acc + " " + value).orElse(""));
        List<Integer> integerListWithoutNegatives = List.copyOf(integerListWithoutMin.stream().map(Math::abs).toList());
        System.out.println(integerListWithoutNegatives.stream().map(String::valueOf).reduce((acc, val) -> acc + " " + val).orElse(""));
    }
}
