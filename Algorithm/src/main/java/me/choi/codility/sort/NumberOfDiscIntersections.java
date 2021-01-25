package me.choi.codility.sort;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 4:13 오후
 */
public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        int[] A = {1, 5, 2, 1, 4, 0};
        numberOfDiscIntersections.solution(A);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8

        int length = A.length;
        long[] lower = new long[length];
        long[] upper = new long[length];
        for (int i = 0; i < length; i++) {
            lower[i] = i - A[i];
            upper[i] = i + A[i];
        }
        Arrays.sort(lower);
        Arrays.sort(upper);

        int intersaction = 0;
        int j = 0;
        for (int i = 0; i < length; i++) {
            while (j < length && upper[i] >= lower[j]) {
                intersaction += j;
                intersaction -= i;
                j++;
            }
        }

        return intersaction;
    }
}
