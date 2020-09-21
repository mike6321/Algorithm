package me.choi.book.e_problem.greedy;

import java.util.Scanner;
/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 문자열 뒤집기
 * Time : 11:14 오후
 */
/*
0001100
* */
public class Problem_313 {
    private static int zeroCount = 0;
    private static int oneCount = 0;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        arr = new int[length];

        for (int i = 0; i < length; i++) {
             arr[i] = str.charAt(i) - '0';
        }

        distinguishZeroOrOne(arr);

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                if (arr[i+1] == 0) {
                    zeroCount++;
                }
                else {
                    oneCount++;
                }
            }
        }
        int min = Math.min(zeroCount, oneCount);
        System.out.println(min);
    }

    private static void distinguishZeroOrOne(int[] arr) {
        if (arr[0] == 0) {
            zeroCount += 1;
        }
        else {
            oneCount += 1;
        }
    }
}
