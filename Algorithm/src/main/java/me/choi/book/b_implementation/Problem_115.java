package me.choi.book.b_implementation;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 왕실의 나이트
 * Time : 9:41 오후
 */
public class Problem_115 {
    private static int n;
//    private static char[] alpha= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static int[] dy = {-1, 1, 2, -2, -2, 2, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c1 = s.charAt(0);
        int x = s.charAt(1) - '0';
        int y = s.charAt(0) - 'a' + 1;
        //int y = 0;
//        for (int i = 0; i < alpha.length; i++) {
//            if (alpha[i] == c1) {
//                y = i;
//            }
//        }
        System.out.println(y);
        int result = 0;
        for (int i = 0; i < 8; i++) {
            int next_x = x + dx[i];
            int next_y = y + dy[i];

            if (next_x >= 1 && next_y >= 1 && next_x <= 8 && next_y <= 8) {
                result += 1;
            }
        }

        System.out.println(result);
    }

}
