package me.choi.inflearn.class01;

public class Code07 {
    public static void main(String[] args) {
        int result = gcd(2,4);
        System.out.println(result);
    }

    private static int gcd(int m, int n) {

        //swap
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) {
            return n;
        }
        else {
            return gcd(n, m % n);
        }
    }

}
