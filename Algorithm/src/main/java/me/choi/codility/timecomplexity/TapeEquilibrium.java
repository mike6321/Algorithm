package me.choi.codility.timecomplexity;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:38 오후
 */
public class TapeEquilibrium {
    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int[] A = {3, 1, 2, 4, 3};
        int solution = tapeEquilibrium.solution(A);
        System.out.println(solution);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        int leftSum = 0;
        int rightSum = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            leftSum += A[i - 1];
            rightSum = totalSum - leftSum;
            minValue = Integer.min(minValue, Math.abs(leftSum - rightSum));
        }

        return minValue;
    }
}
