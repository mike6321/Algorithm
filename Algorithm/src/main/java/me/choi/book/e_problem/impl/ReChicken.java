package me.choi.book.e_problem.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReChicken {
    private static int n;
    private static int m;
    private static int[][] map;
    private static List<Where> home;
    private static List<Where> chicken;

    public static void main(String[] args) {
        init();

        combination(0, 0);
    }

    private static void combination(int index, int depth) {
        if (depth == m) {

        }
    }

    private static void init() {
        Scanner scanner =  new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        map = new int[n][n];

        home = new ArrayList<>();
        chicken = new ArrayList<>();

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] str = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(str[j]);
                if (map[i][j] == 1) {
                    home.add(new Where(i, j));
                }
                if (map[i][j] == 2) {
                    chicken.add(new Where(i, j));
                }
            }
        }
    }
}
class Where {
    private final int x;
    private final int y;

    public Where(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
