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

        int[] result = new int[N];

        int max = 0;
        int resultMax = 0;
        for (int i = 0; i < A.length; i++) {
            if (1 <= A[i] && N >= A[i]) {
                if (resultMax >= result[A[i] - 1]) {
                    result[A[i] - 1] = resultMax + 1;
                } else {
                    result[A[i] - 1] = result[A[i] - 1] + 1;
                }
                max = Integer.max(max, result[A[i] - 1]);
            } else if (A[i] == N + 1) {
                resultMax = max;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] < resultMax) {
                result[i] = resultMax;
            }
        }

        return result;
    }
}
