package me.choi.book.c_sort;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 삽입정렬
 * Time : 1:54 오전
 */
public class InsertionSort {
    private static final int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

    public static void main(String[] args) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(j, j - 1);
                }
                else {
                    break;
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
