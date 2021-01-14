package me.choi.codility.arrays;

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

        for (int i = 0; i < A.length; i++) {
            int cycle = 0;
            if (i + K >= length) {
                cycle = (i + K) % length;
            } else {
                cycle = i + K;
            }
            result[cycle] = A[i];
        }

//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
        return result;
    }
}
