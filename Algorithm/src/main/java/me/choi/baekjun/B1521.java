package me.choi.baekjun;

import java.util.Scanner;

/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/09
 * Time : 9:08 오후
 */
class B1521 {

    public static void main(String[] args) {

        final int[] array = new int[8];

        Scanner sc = new Scanner(System.in);
        String result = "mixed";

        for(int i=0 ; i<8  ; i++) {
            array[i] = sc.nextInt();
        }

        if (Asending(array)) {
            result = "ascending";
        }
        if (Decending(array)) {
            result = "descending";
        }

        System.out.println(result);
    }

    static boolean Asending(int[] array) {

        boolean result = false;

        for (int i=0 ; i<7 ; i++) {
            if (array[i+1] == array[i]+1) {
                result = true;
            }else {
                result = false;
                break;
            }
        }

        return result;
    }

    static boolean Decending(int[] array) {

        boolean result = false;

        for (int i=0 ; i<7 ; i++) {
            if (array[i+1] == array[i]-1) {
                result = true;
            }else {
                result = false;
                break;
            }
        }

        return result;
    }
}

