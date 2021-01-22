package me.choi.codility.sort;

import java.util.HashSet;
import java.util.Set;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 6:02 오후
 */
public class Distinct {
    public static void main(String[] args) {
        int[] A = {2, 1, 1, 2, 3, 1};
        Distinct distinct = new Distinct();
        int solution = distinct.solution(A);

        System.out.println(solution);
    }


    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

//        System.out.println(set.size());


        return set.size();
    }
}
