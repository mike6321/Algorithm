package me.choi.book.e_problem.bfsdfs;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 연구소
 * Time : 8:14 오후
 */
public class Problem_341 {
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    private static int[][] table = new int[8][8];
    private static int[][] temp = new int[8][8];
    private static int n = 0;
    private static int m = 0;
    private static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        dfs(0);
        System.out.println(score);
    }

    private static void dfs(int count) {
        if (count == 3) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    temp[i][j] = table[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (temp[i][j] == 2) {
                        virus(i, j);
                    }
                }
            }

            score = Math.max(score, getScore());
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (table[i][j] == 0) {
                    table[i][j] = 1;
                    count += 1;

                    dfs(count);

                    table[i][j] = 0;
                    count -= 1;
                }
            }
        }
    }

    private static int getScore() {
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j  <m; j++) {
                if (temp[i][j] == 0) {
                    result += 1;
                }
            }
        }

        return result;
    }

    private static void virus(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (temp[nx][ny] == 0) {
                    temp[nx][ny] = 2;
                    virus(nx, ny);
                }
            } 
        }
    }

}
