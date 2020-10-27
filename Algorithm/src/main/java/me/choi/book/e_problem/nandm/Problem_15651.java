package me.choi.book.e_problem.nandm;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 중복순열
 * Time : 1:02 오전
 */
public class Problem_15651 {
    private static int n;
    private static int m;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        StringBuffer sb = new StringBuffer();
        arr = new int[m];

        dfs(0, sb);
        System.out.println(sb);
    }

    private static void dfs(int depth, StringBuffer sb) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");

            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            dfs(depth + 1, sb);
        }
    }
}
