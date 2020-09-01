package me.choi.book.e_problem.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 안테나
 * Time : 12:17 오전
 */
public class Problem_18310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[(arr.length - 1)  / 2]);
    }
}
