package me.choi.baekjunlecture.class01;


import java.util.Scanner;

public class B2441 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < N-i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
