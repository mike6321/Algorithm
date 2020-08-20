package me.choi.book.a_greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 큰 수의 법칙
 * Time : 7:03 오후
 */

/*
5 8 3
2 4 5 4 6
*/
public class Problem_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int length = arr.length;
        int max = arr[length - 1];
        int secondMax = arr[length - 2];

        int result = (((M / K) * K) * max) + (M % K) * secondMax;
        System.out.println(result);

    }
}
