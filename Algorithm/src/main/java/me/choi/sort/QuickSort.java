package me.choi.sort;

import java.util.Scanner;

/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/25
 * Time : 8:54 오후
 */
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열을 나눕니다...");
        System.out.println("요솟수 : ");
        int nx = sc.nextInt();

        int[] array = new int[nx];

        for (int i=0 ; i<nx ; i++) {
            System.out.print("x["+i+"] = ");
            array[i] = sc.nextInt();
        }

        partition(array, 0, nx-1);

        for (int i=0 ; i<nx ; i++) {
            System.out.printf("x["+i+"] = "+ array[i]+ " ");
        }
    }

    private static void partition(int[] array, int left, int right) {
        int pl = left;
        int pr = right;
        int x = array[(pl+pr)/2];

        do {
            while (array[pl] < x) pl++;
            while (array[pr] > x) pr--;

            if (pl <= pr)
                swap(array, pl++, pr--);

        }while (pl <= pr);

        if (left < pr)
            partition(array, left, pr);
        if (pl < right)
            partition(array, pl, right);

    }
    static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
