package me.choi.review.nandm;

import java.util.Scanner;

/**
 * Project : lgorithm
 *
 * @author : jwdeveloper
 * @comment : 순열
 * https://jwdeveloper.tistory.com/271
 * Time : 10:55 오전
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        //방문노드
        boolean[] vistied = new boolean[n+1];
        //depth에 따른 배열 값 저
        int[] arr = new int[m];

        dfs(0, vistied, arr, n, m);
    }

    // 4 2
    private static void dfs(int depth, boolean[] vistied, int[] arr, int n, int m) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!vistied[i]) {
                arr[depth] = i;
                vistied[i] = true;
                dfs(depth + 1, vistied, arr, n, m);
                vistied[i] = false;
            }
        }
    }


}
