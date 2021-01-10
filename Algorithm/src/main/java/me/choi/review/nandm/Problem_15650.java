package me.choi.review.nandm;

import java.util.Scanner;

/**
 * Project : lgorithm
 *
 * @author : jwdeveloper
 * @comment : 조합
 * https://jwdeveloper.tistory.com/272
 * Time : 10:55 오전
 */
public class Problem_15650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];

        dfs(0, 1, arr, n, m);

    }

    private static void dfs(int depth, int index, int[] arr, int n, int m) {

        if (depth == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();

            return;
        }

        for (int i = index; i <= n; i++) {
            arr[depth] = i;
            dfs(depth + 1, i + 1, arr, n, m);
        }
    }

}
