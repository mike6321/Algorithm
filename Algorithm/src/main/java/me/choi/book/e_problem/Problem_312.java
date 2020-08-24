package me.choi.book.e_problem;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 곱하기 혹은 더하기
 * Time : 12:52 오전
 */
public class Problem_312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        Arrays.sort(arr);

        int result = 1;
        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] == 0 || arr[i] == 1) {
                result += arr[i];
            } else {
                result *= arr[i];
            }

        }
        System.out.println(result);
    }

}
