package me.choi.sort;

import java.util.Scanner;

/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/23
 * Time : 12:24 오전
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        System.out.println("버블 정렬 왼쪽부터");
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i=0 ; i < num ; i++) {
            array[i] = sc.nextInt();
        }
        bubbleSort(array, num);
        System.out.println("결과");

        for (int i=0 ; i<num ; i++) {
            System.out.printf("x["+i+"]="+array[i]+ " ");
        }
    }
    private static void bubbleSort(int[] array, int length) {
        for (int i=0 ; i<length-1 ; i++) {
            for (int k=i ; k<length-1 ; k++) {
                if (array[k] > array[k+1])
                    swap(array, k);
            }
        }
    }

    private static void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
    }
}
