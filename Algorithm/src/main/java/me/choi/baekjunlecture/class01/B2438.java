package me.choi.baekjunlecture.class01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:51 오후
 */
public class B2438 {
    public static void main(String[] args) throws  IOException {
        int N = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
