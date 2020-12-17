package me.choi.codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        MaxProductOfThree mpo = new MaxProductOfThree();
        int[] a = {-3, 1, 2, -2, 5, 6};
        mpo.solution(a);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int length = A.length - 1;

        int result = 0;
        int firstNum = A[0] * A[1];
        int secondNum = A[length - 1] * A[length - 2];
        int thirdNum = A[length];

        if (thirdNum < 0) {
            result = Math.min(firstNum, secondNum) * thirdNum;
        }
        else {
            result = Math.max(firstNum, secondNum) * thirdNum;
        }


        return result;
    }
}

