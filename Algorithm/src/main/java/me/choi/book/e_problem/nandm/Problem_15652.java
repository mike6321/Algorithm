package me.choi.book.e_problem.nandm;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 중복조합
 * Time : 1:19 오전
 */
public class Problem_15652 {
    private static int n;
    private static int m;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[m];

        dfs(1, 0);

    }

    private static void dfs(int index, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            return;
        }

        for (int i = index; i <= n; i++) {
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }
}
