package me.choi.book.e_problem.impl;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:07 오후
 */

public class SnakeSol {
    private static int[][] table;
    //private static int[][] dxdy = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {-1, 0, 1, 0};
    private static int k;
    private static int n;
    private static Map<Integer, String> dir;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * 사과 : 1
         * 외벽 : 2
         * 뱀 : 2
         * */
        //배열의 크기
        n = scanner.nextInt();
        table = new int[n+2][n+2];

        //외벽을 3으로
        for(int i = 0; i < n+2; i++) {
            table[0][i] = table[n+1][i] = table[i][0] = table[i][n+1] = 1;
        }

        //사과위치
        k = scanner.nextInt();
        scanner.nextLine();

        //사과위치를 2로
        for (int i = 0; i < k; i++) {
            String[] apple = scanner.nextLine().split(" ");
            int x = Integer.parseInt(apple[0]);
            int y = Integer.parseInt(apple[1]);

            table[x][y] = 2;
        }

        int l = scanner.nextInt();
        scanner.nextLine();
        dir = new HashMap<Integer, String>();
        for (int i = 0; i < l; i++) {
            String[] rotate = scanner.nextLine().split(" ");
            dir.put(Integer.parseInt(rotate[0]), rotate[1]);
        }

        int time = 1;
        int startX = 1;
        int startY = 1;
        int direction = 1;

        //첫번째 꼬리 초기화
        //table[startX][startY] = 2;
        Deque<Point2> snakeQueue = new ArrayDeque<>();
        snakeQueue.addFirst(new Point2(startY, startX));

        while (true) {
            /*
             * 사과 : 2
             * 외벽 : 1
             * 뱀 : 1
             * 안간곳 : 0
             */
            Point2 Point2 = snakeQueue.peekLast();
            startX = Point2.getX();
            startY = Point2.getY();

            int nextX = startX + dx[direction];
            int nextY = startY + dy[direction];

            //외벽에 닿거나 자기한테 닿을때 종료
            if (table[nextY][nextX] == 1) {
                break;
            }

            //사과가 없다면
            //만약 이동한 칸에 사과가 없다면, 몸길이를 줄여서 꼬리가 위치한 칸을 비워준다. 즉, 몸길이는 변하지 않는다.
            if (table[nextY][nextX] != 2) {
                Point2 tail = snakeQueue.pollFirst();
                int tailX = tail.getX();
                int tailY = tail.getY();

                //꼬리제거
                table[tailY][tailX] = 0;
            }

            //머리이동
            snakeQueue.addLast(new Point2(nextY, nextX));
            table[nextY][nextX] = 1;

            if (dir.containsKey(time)) {
                String where = dir.get(time);
                direction = where.equals("D") ? (direction + 1) % 4 : (direction + 3) % 4;
            }


            time += 1;
        }
        System.out.println(time);
    }
}
class Point2 {
    private final int x;
    private final int y;

    public Point2(int y, int x) {
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