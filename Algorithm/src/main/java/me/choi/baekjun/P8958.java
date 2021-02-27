package me.choi.baekjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:00 오후
 */
public class P8958 {
    public static void main(String[] args) {
        P8958 p8958 = new P8958();
        Scanner scanner = new Scanner(System.in);


        int testCase = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < testCase; i++) {
            List<Character> list = new ArrayList<>();
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                list.add(chars[j]);
            }
            System.out.println(list);
        }
    }


}
