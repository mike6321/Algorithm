package me.choi.sort;

import java.util.Scanner;

/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/22
 * Time : 9:43 오후
 */
public  class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블정렬");
        System.out.println("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i=0 ;i<nx; i++) {
            x[i] = sc.nextInt();
        }
        bubbleSort(x, nx);

        for (int i=0 ;i<nx; i++) {
            System.out.printf("x["+i+"]="+x[i]+ " ");
        }


    }

    private static void bubbleSort(int[] array, int length) {
        for (int i=0;i<length-1;i++) {
            int cnt = 0;
            for (int k=length-1 ; k>i; k--) {
                if (array[k-1] > array[k])
                    swap(array, k);
                    cnt ++ ;
            }
            if (cnt == 0 ) break;
        }
    }

    private static void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i-1];
        array[i-1] = temp;
    }
}
