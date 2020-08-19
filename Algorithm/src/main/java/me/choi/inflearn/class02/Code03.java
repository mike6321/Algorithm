package me.choi.inflearn.class02;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 문자열 뒤집기
 * Time : 10:57 오후
 */
public class Code03 {
    public static void main(String[] args) {
        String str = "ace";
        printCharReverse(str);
    }

    public static void printCharReverse(String str) {
        if (str.length() == 0) {
            return;
        }
        else {
            printCharReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }
}
/*
printCharReverse(ace)  a
printCharReverse(ce)   c
printCharReverse(e)    e
printCharReverse( ) return

후출력
*/