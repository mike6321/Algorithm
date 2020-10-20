package me.choi.book.e_problem.nandm;

import java.util.Scanner;

public class Problem_15650 {
    private static int n;
    private static int m;
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new int[m];
        dfs(1, 0);
    }

    private static void dfs(int index, int depth) {
        if (m == depth) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
            return;
        }

        for (int i = index; i <= n; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
