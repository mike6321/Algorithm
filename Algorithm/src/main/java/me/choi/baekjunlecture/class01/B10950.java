package me.choi.baekjunlecture.class01;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:42 오후
 */
public class B10950 {

    public static void main(String[] args) {
        int T = 0;
        int A = 0;
        int B = 0;

        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            A = scanner.nextInt();
            B = scanner.nextInt();

            System.out.println(A+B);
        }
    }
}
