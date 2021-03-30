package me.choi.sort.remind;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 퀵정렬
 * Time : 8:56 오후
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 4, 3, 5, 2};
        quickSort(arr, 0, arr.length - 1);

        Arrays.stream(arr)
              .forEach(System.out::println);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = start; // pivot은 첫 번째 원소
        int left = start + 1;
        int right = end;


        while (left <= right) { // 엇갈릴때까지 반복한다

            // pivot보다 큰 데이터를 찾을때까지 반복
            while (left <= end && arr[left] <= arr[pivot]) {
                left++;
            }

            // pivot보다 작은 데이터를 찾을때까지 반복
            while (right > start && arr[right] >= arr[pivot]) {
                right--;
            }

            // 엇갈린 경우 작은 데이터와 피벗을 교체
            if (left > right) {
                swap(arr, pivot, right);
            }

            // 엇갈리지 않은 경우 작은 데이터와 큰 데이터 교체
            else {
                swap(arr, left, right);
            }
        }

        quickSort(arr, start, right - 1); // 왼쪽 정렬
        quickSort(arr, right + 1, end); // 오른쪽 정렬
    }

    private static void swap(int[] arr, int pivot, int right) {
        int temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
    }

}
