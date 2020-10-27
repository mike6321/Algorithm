package me.choi.book.e_problem.undoagain;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Snake {
    private static int size;
    private static int[][] map;
    private static Map<Integer, String> rotation;
    private static int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        map = new int[size+2][size+2];

        // 벽은 2로 지정
        for (int i = 0; i < size + 2; i++) {
            map[0][i] = 2;
            map[i][0] = 2;
            map[i][size+1] = 2;
            map[size+1][i] = 2;
        }

        // 사과 위치는 1로 지정
        int appleSize = scanner.nextInt();
        for (int i = 0; i < appleSize; i++) {
            int appleX = scanner.nextInt();
            int appleY = scanner.nextInt();
            map[appleX][appleY] = 1;
        }


        // 회전 정보 지정
        int whereSize = scanner.nextInt();
        scanner.nextLine();
        rotation = new HashMap<Integer, String>();
        for (int i = 0; i < whereSize; i++) {
            String[] str = scanner.nextLine().split(" ");
            rotation.put(Integer.parseInt(str[0]), str[1]);
        }

        Deque<Point> snake = new ArrayDeque<>();
        snake.addFirst(new Point(1, 1));
        int where = 0;
        int time = 1;

        while(true) {
            Point point = snake.peekLast();

            int startX = point.getX();
            int startY = point.getY();


            int nextX = startX + direction[where][0];
            int nextY = startY + direction[where][1];

            // 벽에 부딪히거나 자신에게 닿으면 2
            if (map[nextY][nextX] == 2) {
                break;
            }

            //사과가 없는경우
            if (map[nextY][nextX] != 1) {
                Point tail = snake.pollFirst();
                int tailX = tail.getX();
                int tailY = tail.getY();

                map[tailY][tailX] = 0;
            }

            map[nextY][nextX] = 2;
            snake.addLast(new Point(nextY, nextX));

            if(rotation.containsKey(time)) {
                String direct = rotation.get(time);

                where = direct.equals("D") ? (where + 1) % 4 : (where + 3) % 4;
            }

            time += 1;

        }
        System.out.println(time);
    }

}
class Point {
    private final int x;
    private final int y;

    public Point(int y, int x) {
        super();
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


