package me.choi.book.d_binarysearch;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:29 오전
 */

/**
5
8 3 7 9 2
3
5 7 9
*/
public class Problem_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] target = new int[M];
        for (int i = 0; i < M; i++) {
            target[i] = scanner.nextInt();
        }
        Arrays.sort(arr); //오름차순 정렬

        for (int i = 0; i < M; i++) {
            int result = binarySearch(arr, 0, N, target[i]);

            if (result >= 0) {
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }
    }
}
