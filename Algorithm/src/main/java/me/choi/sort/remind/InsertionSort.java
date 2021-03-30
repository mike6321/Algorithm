package me.choi.sort.remind;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 삽입정렬 (멈출 포인트를 알고있다.)
 * 거의 정렬이 되어있는 경우는 엄청 빠름
 * 2 3 4 5 6 7 8 9 10 1
 * Time : 12:18 오후
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int j = 0;
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            j = i;

            while (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
