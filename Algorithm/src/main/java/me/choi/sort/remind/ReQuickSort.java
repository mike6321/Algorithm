package me.choi.sort.remind;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:00 오전
 */
public class ReQuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 4, 3, 5, 2};
        quickSort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = start;
        int left = start + 1;
        int right = end;

        while (left <= right) {

            while (left <= end && arr[left] <= arr[pivot]) {
                left++;
            }

            while (right >= start && arr[right] >= arr[pivot]) {
                right--;
            }

            if (left > right) {
                swap(arr, pivot, right);
            }
            else {
                swap(arr, left, right);
            }
        }

        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    private static void swap(int[] arr, int pivot, int right) {
        int temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
    }
}
