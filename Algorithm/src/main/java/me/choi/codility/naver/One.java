package me.choi.codility.naver;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:08 오후
 */
public class One {
    public static void main(String[] args) {
        One one = new One();
        int solution = one.solution(3, 7);
        one.solution2(3, 7);

        //System.out.println(solution);
    }

    public int solution(int A, int B) {
        int productNum = A * B;

        // write your code in Java SE 8
        int result = 0;
        while (productNum  != 0) {
            if (productNum% 2 == 1) {
                result++;
            }
            productNum = productNum / 2;
        }

        return result;
    }

    public int solution2(int A, int B) {

        // write your code in Java SE 8
        return Long.bitCount(A * B);
    }
}
