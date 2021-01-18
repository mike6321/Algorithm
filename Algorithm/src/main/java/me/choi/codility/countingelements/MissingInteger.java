package me.choi.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : HashSet은 중복을 허용하지 않고 자동정
 * Time : 7:10 오후
 */
public class MissingInteger {
    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        int[] A = {1, 3, 6, 4, 1, 2};
//        int[] A = {1, 2, 3};
//        int[] A = {-1, -3};
        int solution = missingInteger.solution(A);
        System.out.println(solution);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
