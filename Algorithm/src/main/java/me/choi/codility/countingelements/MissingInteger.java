package me.choi.codility.countingelements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:10 오후
 */
public class MissingInteger {
    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
//        int[] A = {1, 3, 6, 4, 1, 2};
//        int[] A = {1, 2, 3};
        int[] A = {-1, -3};
        int solution = missingInteger.solution(A);
        System.out.println(solution);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        int cnt = 1;
        for (Integer i : set) {
            if (i != cnt) {
                return cnt;
            }
            if (i == set.size()) {
                return cnt + 1;
            }
            cnt++;
        }

        return 1;
    }
}
