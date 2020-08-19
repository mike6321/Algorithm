package me.choi.book.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 미로탈출
 * Time : 12:01 오전
 */

/**
5 6
101010
111111
000001
111111
111111
*/
public class Problem_5_2 {
    private static int[][] table = new int[201][201];
    private static int N;
    private static int M;
    private static final int[] nx = {-1, 0, 1, 0};
    private static final int[] ny = {-0, 1, 0, -1};

    public static void main(String[] args) {
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

        int result = bfs();
        System.out.println(result);
    }

    private static int bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0));

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.getX();
            int y = point.getY();

            for (int i = 0; i < 4; i++) {
                int dx = x + nx[i];
                int dy = y + ny[i];

                if (dx >= 0 && dy >= 0 && dx < N && dy < M && table[dx][dy] == 1) {
                    table[dx][dy] = table[x][y] + 1;
                    queue.offer(new Point(dx, dy));
                }
            }
        }

        return table[N-1][M-1];
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
