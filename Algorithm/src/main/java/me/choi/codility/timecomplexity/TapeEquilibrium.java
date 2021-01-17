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
        // (1 ~ A.length - 1)
        int result = Integer.MAX_VALUE;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < A.length; i++) {
            leftSum += A[i];
        }

        for (int p = 1; p < A.length; p++) {
            leftSum += leftSum;

        }


//        for (int p = 1; p <= A.length - 1; p++) {
//            int fisrtSum = 0;
//            int secondSum = 0;
//            for (int i = 0; i < A.length; i++) {
//                if (i >= 0 && i <= p-1) {
//                    fisrtSum += A[i];
//                }
//                if (i >= p && i <= A.length - 1) {
//                    secondSum += A[i];
//                }
//            }
//            result = Integer.min(result, Math.abs(fisrtSum - secondSum));
//        }
        return result;
    }
}
