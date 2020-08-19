package me.choi.inflearn.class01;

public class Code05 {
    public static void main(String[] args) {
        int result = power(2,4);
        System.out.println(result);
    }

    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return x * power(x,n-1);
        }
    }

}
