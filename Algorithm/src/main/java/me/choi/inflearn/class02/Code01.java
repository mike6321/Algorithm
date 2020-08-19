package me.choi.inflearn.class02;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 문자열 길이 계산
 * Time : 10:52 오후
 */
public class Code01 {
    public static void main(String[] args) {
        String str = "ace";
        int length = length(str);
        System.out.println(length);
    }

    public static int length(String str) {
        if (str.equals("")) {
            return 0;
        }
        else {
            return 1 + length(str.substring(1));
        }
    }
}
