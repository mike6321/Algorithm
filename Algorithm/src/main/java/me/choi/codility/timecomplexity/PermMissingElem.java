package me.choi.codility.timecomplexity;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:20 오후
 */
public class PermMissingElem {
    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        int[] A = {2, 3, 1, 5};
        int solution = permMissingElem.solution(A);
        System.out.println(solution);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return i + 1;
            }
         }

        return A.length + 1;
    }
}
