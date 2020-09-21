package me.choi.book.e_problem.greedy;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 만들 수 없는 금액
 * Time : 11:14 오후
 */
/*
5
3 2 1 1 9
* */
public class Problem_314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int target = 1;
        for (int i = 0; i < n; i++) {
            if (target < arr[i]) {
                break;
            }

            target += arr[i];
        }


        System.out.println(target);
    }
}
