package me.choi.sort.remind;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 가장 작은 것을 선택해서 제일 앞으로 보낸다. (n^2)
 * Time : 12:31 오전
 */
public class SelectionSort {
    public static void main(String[] args) {
        int index = 0;
        int temp = 0;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        Arrays.stream(array)
                .forEach(System.out::println);
    }
}
