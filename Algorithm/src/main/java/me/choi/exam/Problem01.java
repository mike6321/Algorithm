package me.choi.exam;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:02 오후
 */
public class Problem01 {

    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int number : numbers) {
            counts.put(number, counts.getOrDefault(number, 0) + 1);
        }

        return counts.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}
