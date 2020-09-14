package me.choi.book.b_implementation;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 상하좌우
 * Time : 8:05 오후
 */
/*
5
R R R U D D

3
R R R D D
 */
public class Problem_110 {
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] table = new int[n][n];
        scanner.nextLine();
        String[] directions = scanner.nextLine().split(" ");
        Point start = new Point(0, 0);

        int x = start.getX();
        int y = start.getY();

        for (int i = 0; i < directions.length; i++) {

            if (directions[i].equals("U") && x - 1 >= 0) {
                x -= 1;
            }
            if (directions[i].equals("D") && x + 1 < n) {
                x += 1;
            }
            if (directions[i].equals("R") && y + 1 < n) {
                y += 1;
            }
            if (directions[i].equals("L") && y - 1 >= 0) {
                y -= 1;
            }
        }

        System.out.println((x + 1) + " " + (y + 1));
    }
}
class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
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
