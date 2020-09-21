package me.choi.book.e_problem.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 볼링공 고르기
 * Time : 11:14 오후
 */
/*
5 3
1 3 2 3 2

8 5
1 5 4 3 2 4 5 2
* */
public class Problem_315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int y = scanner.nextInt();
            list.add(new Point(i+1, y));
        }

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i).getY() != list.get(j).getY()) {
                    result++;
                }
            }
        }

        System.out.println(result);
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
