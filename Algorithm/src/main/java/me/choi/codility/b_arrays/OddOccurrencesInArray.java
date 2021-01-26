package me.choi.codility.b_arrays;

import java.util.HashMap;
import java.util.Map;

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

        for (int i = 0; i < A.length; i++) {
            map.computeIfPresent(A[i], (key, value) -> ++value);
            map.putIfAbsent(A[i], 1);
        }

//        map.entrySet().forEach(integerIntegerEntry -> {
//            System.out.println(integerIntegerEntry.getKey() + " : " + integerIntegerEntry.getValue());
//        });

        int result = 0;
        for (Integer i : map.keySet()) {
            int value = map.get(i);

            if (value % 2 == 1) {
//                System.out.println(value);
                result = i;
                break;
            }
        }

        return result;
    }

}
