package me.choi.book.sort;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 선택정렬
 * Time : 1:13 오전
 */
public class SelectionSort {
    private static final int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

    public static void main(String[] args) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int min_index = i;
            for (int j = i; j < length; j++) {
                if (arr[min_index] > arr[j]) {
                    swap(min_index, j);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int min_index, int j) {
        int temp = arr[min_index];
        arr[min_index] = arr[j];
        arr[j] = temp;
    }
}
