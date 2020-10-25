package me.choi.book.e_problem.undoagain;

import java.util.*;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 뱀 재풀이
 * Time : 9:07 오후
 */
public class Snake {
    private static int n;
    private static int k;
    private static int l;
    private static int[][] map;
    private static Map<Integer, String> snakeDirection;
    private static int[][] where = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};

    public static void main(String[] args) {
        //초기화
        init();

        //외벽 : 2
        //뱀  : 2
        //사과 : 1

        // 사과가 있으면 몸길이을 늘리고
        // 사과가 없으면 몸길이를 늘리지 않고 이동한다.

        // 외벽에 닿거나 자신의 몸통에 닿으면 종료한다.
        Deque<Point> snake = new ArrayDeque<>();
        snake.addFirst(new Point(1, 1));
        int direction = 1;
        int time = 1;

        while (true) {
            Point point = snake.peekLast();

            //다음 순번
            int nextX = point.getX() +where[direction][0];
            int nextY = point.getY() +where[direction][1];

            if (map[nextY][nextX] == 2) {
                break;
            }

            // 사과가 없으면
            if (map[nextY][nextX] != 1) {
                Point tail = snake.pollFirst(); // 꼬리뜯기
                map[tail.getY()][tail.getX()] = 0; // 꼬리 있던자리 비우기
            }

            snake.addLast(new Point(nextY, nextX)); // 뱀 몸통늘리기 2
            map[nextY][nextX] = 2; // 뱀 몸통늘리기 1


            if (snakeDirection.containsKey(time)) {
                direction = snakeDirection.get(time).equals("D") ? (direction + 1) % 4 : (direction + 3) % 4;
            }

            time += 1;
        }

        System.out.println(time);
    }

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        map = new int[n+2][n+2];

        k = scanner.nextInt();

        // 외벽 2로 초기화
        for (int i = 0; i < n + 2; i ++) {
            map[0][i] = 2;
            map[i][0] = 2;
            map[i][n+1] = 2;
            map[n+1][i] = 2;
        }

        // 사과 초기화
        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            map[x][y] = 1;
        }

        //print();

        l = scanner.nextInt();
        scanner.nextLine();

        snakeDirection = new HashMap<>();

        for (int i = 0; i < l; i++) {
            String str = scanner.nextLine();
            String[] splitStr = str.split(" ");

            snakeDirection.put(Integer.parseInt(splitStr[0]), splitStr[1]);
        }

    }

    private static void print() {
        System.out.println();
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
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


