package me.choi.exam.kakaocommerce;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 *
 * int[][] needles = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
 *         int r= 2;
 * Time : 1:55 오후
 */
public class Solution02 {
    private static int n;
    private static int m;
    private static boolean[] visited;
    private static int[] arr;
    public static void main(String[] args) {

        int[][] needles = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        int r = 2;
        Solution02 solution02 = new Solution02();
        solution02.solution(needles, r);

    }

    public int solution(int[][] needs, int r) {
        visited = new boolean[needs[0].length + 1];
        arr = new int[r];
        m = 2;
        n = needs[0].length;

        dfs(0);


        int answer = 0;
        return answer;
    }

    private static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] - 1 + " ");
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


