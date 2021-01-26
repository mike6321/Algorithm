package me.choi.codility.e_prefixsums;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:41 오후
 */
public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        minAvgTwoSlice.solution(A);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        int length = A.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int startIndex = i;
                int lastIndex = j;


            }
        }

        return 0;
    }
}
