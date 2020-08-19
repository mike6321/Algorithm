package me.choi.inflearn.class02;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 문자열 프린트
 * Time : 10:55 오후
 */
public class Code02 {
    public static void main(String[] args) {
        String str = "ace";
        printChars(str);
    }

    public static void printChars(String str) {
        if (str.length() == 0) {
            return;
        }
        else {
            System.out.println(str.charAt(0));
            printChars(str.substring(1));
        }
    }
}
