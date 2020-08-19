package me.choi.inflearn.class02;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 배열의 합 구하기
 * Time : 11:35 오후
 */
public class Code05 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3 ,4, 5};
        int result = sum(array.length, array);

        System.out.println(result);
    }

    private static int sum(int length, int[] array) {
        if (length <= 0) {
            return 0;
        }
        else {
            return sum(length-1, array) + array[length - 1];
        }
    }
}
