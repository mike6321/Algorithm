package me.choi.book.d_binarysearch;

import java.util.Scanner;

import static java.util.Arrays.binarySearch;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:09 오전
 */

/**
4
3
1 3 7 9
 */
public class BinarySearchLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = binarySearch(arr, 0, n, target);
        System.out.println(target + " 의 인덱스는 "+ result + " 입니다.");
    }
}
