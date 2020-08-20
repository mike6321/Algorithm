package me.choi.book.c_sort;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 퀵 정렬
 * Time : 9:10 오후
 */
public class QuickSort {

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = start; // 피벗은 첫 번째 원소
        int left = start + 1;
        int right = end;

        while (left <= right) {
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
        //분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    private static void swap(int[] arr, int pivot, int right) {
        int temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
    }
}
