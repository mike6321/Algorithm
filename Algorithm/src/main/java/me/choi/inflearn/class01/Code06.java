package me.choi.inflearn.class01;

/*
* fibonacci
* */
public class Code06 {
    public static void main(String[] args) {
        int result = fibonacci(3);

        System.out.println(result);
    }

    private static int fibonacci(int i) {

        if (i < 2) {
            return i;
        }
        else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

}
