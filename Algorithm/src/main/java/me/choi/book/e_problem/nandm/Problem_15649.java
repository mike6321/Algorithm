package me.choi.book.e_problem.nandm;

import java.util.Scanner;

public class Problem_15649 {
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 숫자
        int m = scanner.nextInt(); // 뽑기

        visited = new boolean[n];
        arr = new int[m];

        combination(n, m, 0);
    }

    private static void combination(int n, int m, int depth) {

        if (depth == m) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }


        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                arr[depth] = i + 1;
                visited[i] = true;
                combination(n, m, depth + 1);
                visited[i] = false;
            }
        }

    }
}
