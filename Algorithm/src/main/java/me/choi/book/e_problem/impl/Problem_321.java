package me.choi.book.e_problem.impl;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 럭키 스트레이
 * Time : 1:15 오후
 */
public class Problem_321 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        int result1 = 0;
        int result2 = 0;
        int center = length / 2;

        for (int i = 0; i < length; i++) {
            if (i >=0 && i < center) {
                result1 += arr[i];
            }
            if (i >= center && i < length) {
                result2 += arr[i];
            }
        }
        LuckyOrFail(result1, result2);

    }

    private static void LuckyOrFail(int result1, int result2) {
        if (result1 == result2) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("READY");
        }
    }
}
