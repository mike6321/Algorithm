package me.choi.baekjunlecture.class01;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:53 오후
 */
public class B10951 {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            A = scanner.nextInt();
            B = scanner.nextInt();

            System.out.println(A+B);
        }
    }
}
