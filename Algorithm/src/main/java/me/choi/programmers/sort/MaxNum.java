package me.choi.programmers.sort;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:33 오후
 */
public class MaxNum {
    public static void main(String[] args) {
        MaxNum maxNum = new MaxNum();
        int[] numbers = {6, 10, 2};
        maxNum.solution(numbers);
    }


    public String solution(int[] numbers) {
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);

        }

        Arrays.sort(result, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return null;
    }
}
