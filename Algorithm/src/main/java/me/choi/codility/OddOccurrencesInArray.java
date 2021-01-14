package me.choi.codility;

import java.util.HashMap;
import java.util.Iterator;
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
        //int[] A = {9, 3, 9, 3, 9, 7, 9};
        int[] A = {9, 3, 9, 3, 9, 3, 11};
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int solution = oddOccurrencesInArray.solution(A);
        System.out.println(solution);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> next = entries.next();
            if (next.getValue() == 1) {
                return next.getKey();
            }
        }


        return 0;
    }

}
