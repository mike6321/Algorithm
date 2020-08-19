package me.choi.sort.problem;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 퀵정렬 사용
 * Time : 12:56 오전
 */
public class B2751 {
    public static void main(String[] args) {
        int[] arr = new int[1000001];

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, N - 1);
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }


    }

    private static void quickSort(int[] arr, int start, int end) {
        //원소가 한 개인 경우 바로 정렬
        if (start >= end) {
            return;
        }
        int key = start;
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j) {

            while (arr[i] <= arr[key]) {
                i++;
            }
            while (arr[j] >= arr[key] && j > start) {
                j--;
            }
            if (i > j) {
                temp = arr[j];
                arr[j] = arr[key];
                arr[key] = temp;
            }
            else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[key] = temp;
            }
        }
        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);

    }
}
