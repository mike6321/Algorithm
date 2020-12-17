package me.choi.codility;

import java.util.HashMap;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:07 오후
 */
public class Rotation {
    public static void main(String[] args) {
        Rotation rotation = new Rotation();
        //int[] A = {3, 8, 9, 7, 6};
        int[] A = {0, 0, 0};
        rotation.solution(A, 1);
    }
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] sol = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int nextIndex = (i + K) % A.length;
            sol[nextIndex] = A[i];
        }

        for (int i = 0; i < sol.length; i++) {
            System.out.println(sol[i]);
        }

        return sol;
    }
}
