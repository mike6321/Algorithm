package me.choi.book.b_implementation;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 시각
 * Time : 8:48 오후
 */
public class Problem_113 {
    private static int hour;
    private static int minutes;
    private static int seconds;
    private static int count = 0;
    private static final String THREECHECK = "3";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hour = scanner.nextInt();

        for (int i = 0; i <= hour; i++) {
            for (int j = 1; j <= 60; j++) {
                for (int k = 1; k <= 60; k++) {
                    countUp(i, j, k);
                }
            }
        }
        System.out.println(count);
    }

    private static boolean checkingThree(int i) {
        return Integer.toString(i).contains(THREECHECK);
    }

    private static void countUp(int i, int j, int k) {
        if (checkingThree(i) || checkingThree(j) || checkingThree(k)) {
            count += 1;
        }
    }

}
