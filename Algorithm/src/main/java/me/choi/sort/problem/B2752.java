package me.choi.sort.problem;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:22 오전
 */
public class B2752 {
    public static void main(String[] args) {

        int min = 0;
        int index = 0;
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            min = 1000001;
            for (int j = i; j < 3; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
