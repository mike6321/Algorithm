package me.choi.book.e_problem.nandm;

import java.util.Scanner;

public class Problem_15650 {
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        arr = new int[m];
        visited = new boolean[n];
        combination(n, m, 1, 0);
    }

    private static void combination(int n, int m, int at, int depth) {
        if (m == depth) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i <= n; i++) {
            arr[depth] = i;
            //visited[i] = true;
            combination(n, m,  i + 1, depth + 1);
//            if (visited[i] == false) {
//                //arr[depth] = i + 1;
//                //visited[i] = false;
//            }
        }
    }
}
