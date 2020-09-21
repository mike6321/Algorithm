package me.choi.book.e_problem.greedy;

import java.util.Scanner;

public class Problem_312_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = str.charAt(i) - '0';
        }
        int result = 1;

        if (arr[0] == 0) {
            result = result + arr[0];
        }
        else {
            result = result * arr[0];
        }
        for (int i = 1; i < length; i++) {
            result = result * arr[i];
        }
        System.out.println(result);
    }
}
