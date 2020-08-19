package me.choi.sort.problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 시간복잡도가 O(n^2)을 해도 1억이 안되기 떄문에 단순 선택정렬을 선택해도 무리가 없다.
 * Time : 11:46 오후
 */
public class B2750 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int min = 0;
        int temp = 0;
        int index = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            min = 1001;
            for (int j = i; j < N; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            swap(arr, index, i);
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void swap(int[] arr, int index, int i) {
        int temp;
        temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
