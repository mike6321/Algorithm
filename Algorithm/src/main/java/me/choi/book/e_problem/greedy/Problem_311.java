package me.choi.book.e_problem.greedy;

import java.util.Scanner; /**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 모험가 길드
 * Time : 11:29 오후
 */

/**
5
2 3 1 2 2
 */
public class Problem_311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            count += 1;
            if (arr[i] <= count) {
                count = 0;
                result += 1;
            }
        }
        System.out.println(result);
    }

}
