package me.choi.baekjunlecture.class01;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:24 오후
 */
public class B10953 {
    public static void main(String[] args) {
        int T = 0;
        int A = 0;
        int B = 0;
        String str;

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for (int i = 0; i < T ; i++) {
            str = scanner.next();

            System.out.println((str.codePointAt(0)-48) + (str.codePointAt(2)-48));
        }
    }
}
