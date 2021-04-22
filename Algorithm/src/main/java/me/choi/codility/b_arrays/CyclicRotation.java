package me.choi.codility.b_arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:41 오전
 */
public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        CyclicRotation cyclicRotation = new CyclicRotation();
        cyclicRotation.solution(A, K);
    }
    public int[] solution(int[] A, int K) {

        // write your code in Java SE 8
        int[] result = new int[A.length];
        int length = A.length;

        IntStream.range(0, A.length)
                .forEach(i -> {
                    calculate(A, K, result, length, i);
                });

//        for (int i = 0; i < A.length; i++) {
//            int cycle = 0;
//            if (i + K >= length) {
//                cycle = (i + K) % length;
//            } else {
//                cycle = i + K;
//            }
//            result[cycle] = A[i];
//        }

        Arrays.stream(result)
                .forEach(System.out::println);

        return result;
    }

    private void calculate(int[] A, int K, int[] result, int length, int i) {
        int cycle = 0;
        if (i + K >= length) {
            cycle = (i + K) % length;
        } else {
            cycle = i + K;
        }

        result[cycle] = A[i];
    }
}
