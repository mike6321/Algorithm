package me.choi.codility.b_arrays;

import com.sun.xml.internal.rngom.digested.DValuePattern;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:01 오전
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        //int[] A = {9, 3, 9, 3, 9, 3, 11};
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int solution = oddOccurrencesInArray.solution(A);
        System.out.println(solution);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();

//        for (int i = 0; i < A.length; i++) {
//            map.computeIfPresent(A[i], (key, value) -> ++value);
//            map.putIfAbsent(A[i], 1);
//        }
        IntStream.range(0, A.length)
                .forEach(i -> {
                    map.computeIfPresent(A[i], (key, value) -> ++value);
                    map.putIfAbsent(A[i], 1);
                });

        // TODO: case01. entrySet 2021/04/22 2:03 오후
        map.entrySet().stream()
                .filter(key -> (map.get(key.getKey()) % 2) == 1)
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                });

        // TODO: case02. entrySet 2021/04/22 2:03 오후
        map.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(key -> map.get(key) % 2 == 1)
                .forEach(System.out::println);

        // TODO: case03. keySet 2021/04/22 2:04 오후
        map.keySet().stream()
                .filter(value -> map.get(value) % 2 == 1)
                .forEach(System.out::println);

        // TODO: case04. keySet 2021/04/22 2:04 오후
        return map.keySet().stream()
                  .filter(value -> map.get(value) % 2 == 1)
                  .findFirst()
                  .get();


//        int result = 0;
//        for (Integer i : map.keySet()) {
//            int value = map.get(i);
//
//            System.out.println(value);
//            if (value % 2 == 1) {
//                result = i;
//                break;
//            }
//        }
//
//        return result;
    }

}
