package me.choi.book.e_problem.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 모험가 길드 2
 * Time : 10:51 오후
 */
/*
5
2 3 1 2 2
 */
public class Problem_311_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int groupCount = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {

            cnt += 1;
            if (cnt >= arr[i]) {
                groupCount += 1;
                cnt = 0;
            }
        }
        System.out.println(groupCount);

    }
}
