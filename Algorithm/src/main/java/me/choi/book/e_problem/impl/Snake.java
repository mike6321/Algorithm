package me.choi.book.e_problem.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 뱀
 * Time : 9:37 오후
 */
public class Snake {
    private static int[][] table;
    private static int[][] dxdy = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    private static List<Rotate> snakeRotate;
    private static int k;
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        snakeRotate = new ArrayList<>();

        //배열의 크기
        n = scanner.nextInt();
        table = new int[n+1][n+1];

        //사과위치
        k = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < k; i++) {
            String[] apple = scanner.nextLine().split(" ");
            int x = Integer.parseInt(apple[0]);
            int y = Integer.parseInt(apple[1]);

            table[x][y] = 1;
        }

        int l = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < l; i++) {
            String[] rotate = scanner.nextLine().split(" ");
            snakeRotate.add(new Rotate(Integer.parseInt(rotate[0]), rotate[1]));
        }

        int time = 1;
        int direction = 0;
        int startX = 1;
        int startY = 1;
        table[startX][startY] = 2;
        while (true) {
            int nextX = 0;
            int nextY = 0;

            nextX = startX + dxdy[direction][0];
            nextY = startY + dxdy[direction][1];

            if (nextX >= n || nextY >= n || nextX <= 0 || nextY <= 0 || table[nextX][nextY] == 2) {
                break;
            }
            //사과가 있다면
            if (table[nextX][nextY] == 1) {
                table[nextX][nextY] = 2;
                startX = nextX;
                startY = nextY;
            }
            //사과가 없다면
            else if (table[nextX][nextY] == 0) {
                table[startX][startY] = 0;
                table[nextX][nextY] = 2;
                startX = nextX;
                startY = nextY;
            }

            for (int i = 0; i < snakeRotate.size(); i++) {
                if (snakeRotate.get(i).getTime() == time) {
                    String where = snakeRotate.get(i).getDirection();
                    direction = (where == "D" ? (direction + 1) % 4 : (direction + 3) % 4);
                    break;
                }
            }
            time += 1;
        }
        System.out.println(time);
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

class Rotate {
    private final int time;
    private final String direction;

    public Rotate(int time, String direction) {
        this.time = time;
        this.direction = direction;
    }

    public int getTime() {
        return time;
    }

    public String getDirection() {
        return direction;
    }
}
