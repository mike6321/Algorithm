package me.choi.baekjunlecture.class01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:39 오후
 */
public class B1924 {
    public static void main(String[] args) {
        final int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Map<Integer, String> result = new HashMap<>();
        result.put(0, "SUN");
        result.put(1, "MON");
        result.put(2, "TUE");
        result.put(3, "WED");
        result.put(4, "THU");
        result.put(5, "FRI");
        result.put(6, "SAT");


        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= 12; i++) {
            if (i == month)
                break;

            sum += months[i];
        }
        sum += day;

        System.out.println(result.get(sum%7));

    }
}
