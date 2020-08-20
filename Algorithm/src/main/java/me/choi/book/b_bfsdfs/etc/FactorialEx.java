package me.choi.book.b_bfsdfs.etc;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:43 오후
 */
public class FactorialEx {
    public static void main(String[] args) {
        int result = factorialRecursive(5);
        System.out.println(result);
    }

    private static int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

}
