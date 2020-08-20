package me.choi.book.c_sort;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 계수정렬
 * Time : 10:23 오후
 */
public class CountSort {
    private static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int n = 15;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] cnt = new int[MAX_VALUE + 1];

        for (int i = 0; i < n; i++) {
            cnt[arr[i]] += 1;
        }

        for (int i = 0; i <= MAX_VALUE; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
