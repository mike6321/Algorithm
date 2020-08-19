package me.choi.baekjunlecture.class01;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:38 오후
 */
public class B8393 {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
                sum += i;
        }

        System.out.println(sum);
    }
}
