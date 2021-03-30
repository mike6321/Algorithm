package me.choi.sort.remind;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 병합정렬
 * 일단 반으로 쪼개서 나중에 합치자!
 * Time : 12:44 오후
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 4, 3, 5, 2};
        mergeSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, temp, start, mid);
            mergeSort(arr, temp, mid + 1, end);
            merge(arr, temp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            temp[i] = arr[i];
        }

        int part1 = start;
        int part2 = mid + 1;
        int index = start;

        while (part1 <= mid && part2 <= end) {
            if (temp[part1] <= temp[part2]) {
                arr[index] = temp[part1];
                part1++;
            }
            else {
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = temp[part1 + i];
        }
    }

}
