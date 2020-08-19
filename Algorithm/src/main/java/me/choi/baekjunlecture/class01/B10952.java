package me.choi.baekjunlecture.class01;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:11 오후
 */
public class B10952 {
    public static void main(String[] args) {
        int A = 1;
        int B = 1;

        Scanner scanner = new Scanner(System.in);

        do {
            A  = scanner.nextInt();
            B  = scanner.nextInt();

            if (A == 0 && B == 0)
                break;

            System.out.println(A+B);

        }while (true);
    }
}
