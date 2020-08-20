package me.choi.book.b_bfsdfs;

import java.io.IOException;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 음료수 얼려 먹기
 * Time : 11:00 오후
 */

/**
4 5
00110
00011
11111
00000
 */
public class Problem_5_1 {

    private static int[][] table = new int[1001][1001];
    private static int N;
    private static int M;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                table[i][j] = str.charAt(j) - '0';
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dfs(i, j)) {
                    sum += 1;
                }
            }
        }

        System.out.println(sum);
    }

    private static boolean dfs(int x, int y) {
        if (x <= -1 || x >= N || y <= -1 || y >= M) {
            return false;
        }

        if (table[x][y] == 0) {
            table[x][y] = 1;

            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);

            return true;
        }

        return false;
    }

}
