package me.choi.book.a_greedy;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 1이 될때까지
 * Time : 8:54 오후
 */
public class Problem_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int result = 0;

        while (N >= K) {

            while (N % K != 0) {
                N -= 1;
                result++;
            }

            N /= K;
            result++;
        }

        System.out.println(result);
    }

}
