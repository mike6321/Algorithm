package me.choi.book.e_problem.sort;

import java.util.*;

public class Re_Problem_360 {
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int center = (arr.length - 1) / 2;

        System.out.println(arr[center]);
    }
}


