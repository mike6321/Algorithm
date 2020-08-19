package me.choi.baekjunlecture.class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:42 오후
 */
public class B10818 {
    public static void main(String[] args) throws IOException {
        int N = 0;
        int[] arr;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        String line = br.readLine();
        st = new StringTokenizer(line, " ");
        br.close();

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (min > arr[i])
                min = arr[i];

            if (max < arr[i])
                max = arr[i];
        }

        System.out.print(min+ " "+max);


    }
}
