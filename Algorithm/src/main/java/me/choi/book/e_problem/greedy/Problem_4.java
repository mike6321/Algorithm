package me.choi.book.e_problem.greedy;

import java.util.Arrays;
import java.util.Scanner;
/*
5
3 2 1 1 9
* */
public class Problem_4 {
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
