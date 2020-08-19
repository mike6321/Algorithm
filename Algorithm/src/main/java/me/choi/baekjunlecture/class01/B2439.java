package me.choi.baekjunlecture.class01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2439 {
    public static void main(String[] args) throws IOException {
        int N = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){

            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }

            for (int k = N; k > N-i; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
