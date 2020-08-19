package me.choi.inflearn.class01;

/*
* factorial
* factorial(int n) 은 음이 아닌 정수 n에 대해서 n!을 올바로 계산한다.
* */
public class Code04 {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    private static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        else {
            return i * factorial(i - 1);
        }
    }

}
