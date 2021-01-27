package me.choi.whiteship.array;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:39 오후
 */
public class Problem04 {
    public static void main(String[] args) {
        Problem04 sortByArray = new Problem04();
        System.out.println(Arrays.toString(sortByArray.solution(new int[] {2, 4, 1, 5, 6, 9})));
    }

    private int[] solution(int[] numbers) {
        boolean[] booleans = new boolean[100];
        for (int num : numbers) {
            booleans[num] = true;
        }

        int index = 0;
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                numbers[index++] = i;
            }

        }
        return numbers;
    }
}
