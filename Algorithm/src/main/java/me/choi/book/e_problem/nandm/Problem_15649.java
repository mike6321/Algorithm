package me.choi.book.e_problem.nandm;

import java.util.Scanner;

public class Problem_15649 {
    private static int n;
    private static int m;
    private static boolean[] visited;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        visited = new boolean[n+1];
        arr = new int[m];

        dfs(0);

    }

    private static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                arr[depth] = i;
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
