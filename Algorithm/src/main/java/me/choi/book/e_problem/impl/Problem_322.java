package me.choi.book.e_problem.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 문자열 재정렬
 * Time : 3:37 오후
 */
/*
K1KA5CB7
AJKDLSI412K4JSJ9D
* */
public class Problem_322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();

        List<Character> strList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < length; i++) {

            //문자일때
            if (s.charAt(i) < 48 || s.charAt(i) > 58) {
                strList.add(s.charAt(i));
            }
            //숫자일때
            else {
                numList.add(s.charAt(i) - '0');
            }
        }

        Collections.sort(strList);
        Collections.sort(numList);

        print(strList, numList);
    }

    private static void print(List<Character> strList, List<Integer> numList) {
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }

        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i));
        }
    }
}

