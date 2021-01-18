package me.choi.codility.countingelements;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:01 오후
 */
public class MaxCounters {
    public static void main(String[] args) {
        MaxCounters maxCounters = new MaxCounters();
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] solution = maxCounters.solution(N, A);
        for (int i : solution) {
            System.out.println(i);
        }
    }
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];
        int maxValue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                result[A[i] - 1] = result[A[i] - 1] + 1;
                maxValue = Integer.max(maxValue, result[A[i] - 1]);
            }
            if (A[i] == N + 1) {
                for (int j = 0; j < result.length; j++) {
                    result[j] = maxValue;
                }
            }
        }
        return result;
    }
}
