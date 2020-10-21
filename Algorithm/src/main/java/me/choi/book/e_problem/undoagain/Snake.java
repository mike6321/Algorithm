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
    private static int[] table;
    private static List<Point> apple;
    private static Map<Integer, String> snakeDirection;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        table = new int[n];

        k = scanner.nextInt();
        apple = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            apple.add(new Point(x, y));
        }

        l = scanner.nextInt();
        scanner.nextLine();

        snakeDirection = new HashMap<>();

        for (int i = 0; i < l; i++) {
            String str = scanner.nextLine();
            String[] splitStr = str.split(" ");

            snakeDirection.put(Integer.parseInt(splitStr[0]), splitStr[1]);
        }
    }
}
