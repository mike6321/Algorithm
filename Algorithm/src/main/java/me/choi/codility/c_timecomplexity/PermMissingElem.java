package me.choi.codility.c_timecomplexity;

import java.util.Arrays;
import java.util.stream.IntStream;

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
        return IntStream.range(0, A.length)
                .filter(i -> i + 1 != A[i])
                .map(i -> i + 1)
                .findFirst()
                .orElse(A.length + 1)
                ;

//        int result = 0;
//        for (int i = 0; i < A.length; i++) {
//            if (i + 1 != A[i]) {
//                return i + 1;
//            }
//         }
//
//        return A.length + 1;
    }
}
