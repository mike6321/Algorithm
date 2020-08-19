package me.choi.baekjunlecture.class03;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:20 오후
 */
public class B1107 {

    static boolean[] broken = new boolean[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 0; i < M; i++) {
            int brokenNum = scanner.nextInt();
            broken[brokenNum] = true;
        }

        int answer = Math.abs(N-100);

        for (int i = 0; i < 1000000; i++) {
            int length = possible(i);

            if (length > 0) {
                int press = Math.abs(i - N);
                if (answer > press+length) {
                    answer = press+length;
                }
            }
        }
        System.out.println(answer);
    }

    private static int possible(int num) {
        int length = 0;
        if (num == 0) {
            return broken[num] ? 0:1;
        }

        while (num > 0) {

            if (broken[num%10]) {
                return 0;
            }
            length += 1;
            num /= 10;
        }

        return length;
    }

}
