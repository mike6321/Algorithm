package me.choi.book.a_greedy;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 6:07 오후
 */
public class ex_3_1 {
    public static void main(String[] args) {
        int N = 1260;
        int[] arr = {500, 100, 50, 10};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count += (N / arr[i]);
            N -= arr[i] * (N / arr[i]);
        }
        System.out.println(count);
    }
}
