package me.choi.baekjunlecture.class03;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:20 오후
 */
public class B1476 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int E = scanner.nextInt();
        int S = scanner.nextInt();
        int M = scanner.nextInt();

        int e = 1;
        int s = 1;
        int m = 1;

        int count = 1;

        while (true) {

            if (e == E  && s == S && m == M) {
                break;
            }

            e += 1;
            s += 1;
            m += 1;

            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if (m == 20) {
                m = 1;
            }
            count++;

        }

        System.out.println(count);
    }
}
