package me.choi.baekjunlecture.class02;

import java.util.Scanner;

public class B10972 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }


        if (nextPermutation(a)) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+ " ");
            }
        }else {
            System.out.println(-1);
        }
    }
    // 7 2 3 6 5 4 1
    // 1. 뽑기 - 우측기준으로 처음 좌측보다 큰 수 뽑기
    // 4 - i
    // 7 2 3 6 5 [4] 1

    // 2. 뽑은 수 의 좌측과 비교하여 최초 작은 수 뽑기
    // 3 - j
    // 7 2 <3> 6 5 [4] 1

    // 3. Swap i <-> j
    // 7 2 4 6 5 3 1

    // 4. Swap j 이전 인덱스 포함 0번째 인덱스 까지 내림차순으로 변경
    // 7 [<2> 4 6 5 3 1]

    // 7 6 5 4 3 2 1
    private static boolean nextPermutation(int[] a) {

        int i = a.length-1;

        //1. 뽑기 - 우측기준으로 처음 좌측보다 큰 수 뽑기
        while(i>0 && a[i] <= a[i-1]) {
            i--;
        }

        if(i<=0)
            return false;

        int j = a.length-1;


        while(a[j] <= a[i-1]) {
            j--;
        }

        swap(a, i-1, j);


        j = a.length-1;
        while(i<j) {
            swap(a, i, j);
            i++;
            j--;
        }

        return true;
    }

    private static void swap(int[] a, int i, int j) {

        int temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }



}