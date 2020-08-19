package me.choi.baekjunlecture.class06;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:37 오후
 */

public class  B9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            int answer = go(num, 0);
            System.out.println(answer);

        }
    }

    private static int go(int goal, int sum) {
        if (goal == sum) {
            return 1;
        }

        if (goal < sum) {
            return 0;
        }

        int answer = 0;
        for (int i = 1; i <= 3; i++) {
            answer += go(goal, sum + i);
        }
        return answer;
    }
}
