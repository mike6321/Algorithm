package me.choi.book.a_greedy;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:53 오후
 */
/*
3 3
3 1 2
4 1 4
2 2 2

2 4
7 3 1 8
3 3 3 4
 */
public class Problem_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            int min = 10001;
            for (int j = 0; j < M; j++) {
                if (min >= arr[i][j]) {
                    min = arr[i][j];
                }
            }
            if (max <= min) {
                max = min;
            }
        }
        System.out.println(max);
    }
}
