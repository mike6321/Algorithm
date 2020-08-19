package me.choi.sort;

import java.util.Scanner;

/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/23
 * Time : 6:51 오후
 */
public class SelectionSort {
//    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블정렬");
        System.out.println("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i=0 ;i<nx; i++) {
            x[i] = sc.nextInt();
        }

        selectionSort(x, nx);

        for (int i=0 ;i<nx; i++) {
            System.out.printf("x["+i+"]="+x[i]+ " ");
        }
    }

    private static void  selectionSort(int[] array, int length) {
        //6   4 8 3 1 9 7
        for (int i=0 ; i<length ; i++) {
//            int min = Integer.MAX_VALUE;
            int minIndex = i;
            for (int k=i ; k<length ; k++) {
                if (array[k] < array[minIndex])
                     minIndex= k;
//                if (min > array[k]) {
//                    min = array[k];
//                    minIndex = k;
//                    System.out.println("minValue :: "+min);
//                    System.out.println(minIndex);
//                }
            }
            swap (minIndex, i, array);

        }
    }

    static void swap (int minIndex, int startIndex, int[] array) {
        int temp = array[minIndex];

        array[minIndex] = array[startIndex];
        array[startIndex] = temp;
    }

}
