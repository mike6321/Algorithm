package me.choi.inflearn.class01;

public class Code03 {
    public static void main(String[] args) {
        int result = func(4);
        System.out.println(result);
    }

    private static int func(int i) {
        if (i == 0) {
            return 0;
        }
        else {
            return i + func(i - 1);
        }
    }

}
