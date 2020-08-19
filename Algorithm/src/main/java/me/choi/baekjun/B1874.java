package me.choi.baekjun;

import java.util.Scanner;
import java.util.Stack;

/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/10
 * Time : 8:06 오후
 */
public class B1874 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int[] array = new int[n];
        Stack<Integer> stack = new Stack<>();
        StringBuffer result = new StringBuffer();

        for (int i=0 ; i<n ; i++)
            array[i] = sc.nextInt();

        int cnt = 1;
        boolean yesorNo = true;

        for (int i=1 ; i<=n ; i++) {

            while (cnt <= array[i-1]) {
                stack.push(cnt);
                result.append('+');
                cnt++;
            }

            if (stack.peek() == array[i-1]) {
                stack.pop();
                result.append('-');
            }else {
                yesorNo = false;
                break;
            }

        }

        if (yesorNo) {
            for (int i = 0; i < result.length(); i++)
                System.out.println(result.charAt(i));
        }else {
            System.out.println("NO");
        }



    }
}