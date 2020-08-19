package me.choi.baekjunlecture.class01;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:29 오후
 */
public class B2739 {
    public static void main(String[] args) {
        int i = 1;
        int N = 0;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        while (i < 10) {
            System.out.println(N+" * "+i+" = "+N*i);

            i++;
        }
    }
}
