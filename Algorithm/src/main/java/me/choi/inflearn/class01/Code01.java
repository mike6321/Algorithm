package me.choi.inflearn.class01;

public class Code01 {
    public static void main(String[] args) {
        func();
    }

    private static void func() {
        System.out.println("hello world!");
        func();
    }

}
