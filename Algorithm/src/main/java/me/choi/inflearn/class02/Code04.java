package me.choi.inflearn.class02;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 2진수 변환하여 출력
 * Time : 11:31 오후
 */
public class Code04 {
    public static void main(String[] args) {
        int testNum = 5;
        printInBinary(testNum);
    }

    public static void printInBinary(int n) {
        if (n < 2) {
            System.out.print(n);
        }
        else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}
