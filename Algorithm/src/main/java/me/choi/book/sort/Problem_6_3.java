package me.choi.book.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 두 배열의 원소 교체
 * Time : 12:07 오전
 */

/**
5 3
1 2 5 4 3
5 5 6 6 5
 */
public class Problem_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            arr2[i] = scanner.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < K; i++) {
            arr1[i] = arr2[N - i - 1];
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr1[i];
        }

        System.out.println(sum);
    }
}
