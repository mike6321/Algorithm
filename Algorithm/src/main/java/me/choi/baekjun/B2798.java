package me.choi.baekjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/09
 * Time : 9:57 오후
 */
public class B2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int M = scanner.nextInt();
        final int[] array = new int[N];

        List<Integer> list = new ArrayList<>();


        int sum = 0;
        int result = Integer.MIN_VALUE;

        for (int i=0 ; i<N ; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i=0 ; i<N ; i++) {
            for (int k=i+1 ; k< N ; k++) {
                for (int m=k+1 ; m< N ; m++) {
                    sum = array[i] + array[k] + array[m];
                    if (sum <= M)
                        list.add(sum);
                }
            }
        }


        for (int i=0 ; i<list.size() ; i++) {

            if (result < list.get(i))
                result = list.get(i);
         }

        System.out.println(result);


    }


}
