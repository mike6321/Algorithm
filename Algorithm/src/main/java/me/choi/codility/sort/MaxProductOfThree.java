package me.choi.codility.sort;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 정렬 후 마지막 수가 음수인지 양수인지를 구분하는 것이 포인트
 * Time : 6:09 오후
 */
public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] A = {-3, 1, 2, -2, 5, 6};
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        int solution = maxProductOfThree.solution(A);

        System.out.println(solution);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int length = A.length;

        int fisrtProduct = A[0] * A[1];
        int secondProduct = A[length - 2] * A[length - 3];

        int lastProduct = A[length - 1];
        boolean plusOrMinus = lastProduct < 0;

        return (plusOrMinus == true) ? Math.min(fisrtProduct, secondProduct) * lastProduct : Math.max(fisrtProduct, secondProduct) * lastProduct;
    }
}
