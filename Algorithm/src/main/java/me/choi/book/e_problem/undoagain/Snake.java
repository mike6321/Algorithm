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
    private static int[][] table;
    private static Map<Integer, String> snakeDirection;

    public static void main(String[] args) {
        init();


        while (true) {
            Deque<Point> snake = new ArrayDeque<>();

        }
    }

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        table = new int[n+2][n+2];

        k = scanner.nextInt();

        //외벽 2로 초기화
        for (int i = 0; i < n + 2; i ++) {
            table[0][i] = 2;
            table[i][0] = 2;
            table[i][n+1] = 2;
            table[n+1][i] = 2;
        }
        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            table[x][y] = 1;
        }

        print();

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
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
