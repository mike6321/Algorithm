package me.choi.baekjunlecture.class01;

import java.util.Scanner;

public class B2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int i = N-1; i > 0; i--) {

            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
