package me.choi.baekjunlecture.class05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:24 오후
 */
public class B1963 {

    private static boolean[] isPrime = new boolean[10000];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int start = 0;
        int end = 0;
        boolean[] visited;
        int[] answer;

        isPrime();

        for (int i = 0; i < T; i++) {

            boolean flag = false;

            start = scanner.nextInt();
            end = scanner.nextInt();
            visited = new boolean[10000];
            answer = new int[10000];
            Queue<Integer> queue = new LinkedList<>();

            visited[start] = true;
            queue.add(start);

            while (!queue.isEmpty()) {
                int now = queue.poll();

                if (now == end) {
                    System.out.println(answer[now]);
                    flag = true;
                    break;
                }

                for (int m = 0; m < 4; m++) {
                    for (int k = 0; k <= 9; k++) {

                        int next = change(now, m, k);

                        if (next == -1) {
                            continue;
                        }

                        if (isPrime[next] && !visited[next]) {
                            queue.add(next);
                            answer[next] = answer[now] + 1;
                            visited[next] = true;
                        }
                    }
                }

            }
            if (flag == false) {
                System.out.println("Impossible");
            }
        }

    }
/*
* 1234
* 34
* */
    private static int change(int now, int index, int digit) {

        if (index == 0 && digit == 0) {
            return -1;
        }

        int first = now / 1000;
        int second = (now % 1000) / 100;
        int third = (now % 100) / 10;
        int fourth = now % 10;

        int n = 0;

        if (index == 0) {
            n = (digit * 1000) + (second * 100) + (third * 10) + fourth;
        }else if (index == 1) {
            n = (first * 1000) + (digit * 100) + (third * 10) + fourth;
        }else if (index == 2) {
            n = (first * 1000) + (second * 100) + (digit * 10) + fourth;
        }else if (index == 3) {
            n = (first * 1000) + (second * 100) + (third * 10) + digit;
        }

        return n;
    }


    // 소수 초기화
    private static void isPrime() {
        // true : 소수 , fasle : 합성수
        for (int i = 2; i < 10000; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i < 10000; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j < 10000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

    }
}
