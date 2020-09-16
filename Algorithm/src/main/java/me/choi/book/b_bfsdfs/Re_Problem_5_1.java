package me.choi.book.b_bfsdfs;

import java.util.Scanner;

public class Re_Problem_5_1 {
    private static int n;
    private static int m;
    private static int[][] table;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        table = new int[n][m];

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                table[i][j] = str.charAt(j) - '0';
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }

        System.out.println(result);

    }

    private static boolean dfs(int i, int j) {
        if (i <= -1 || j <= -1 || i >= n || j >= m) {
            return false;
        }

        if (table[i][j] == 0) {
            table[i][j] = 1;

            dfs(i - 1, j);
            dfs(i + 1, j);
            dfs(i, j - 1);
            dfs(i, j + 1);

            return true;
        }

        return false;
    }
}
