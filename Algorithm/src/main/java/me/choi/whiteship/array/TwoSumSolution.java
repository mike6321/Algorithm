package me.choi.whiteship.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:04 오후
 */
public class TwoSumSolution {
    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] result = twoSumSolution.solution1(new int[]{2, 3, 5, 7}, 9);
        System.out.println(Arrays.toString(result));

        int[] result2 = twoSumSolution.solution2(new int[]{2, 3, 5, 7}, 9);
        System.out.println(Arrays.toString(result2));
        // 시간복잡도 : O(N)
        // 공간복잡도 : O(N)
    }

    private int[] solution2(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (numberMap.containsKey(numberToFind) && numberMap.get(numberToFind) != i) {
                return new int[] {i, numberMap.get(numberToFind)};
            }
        }
        return null;
    }

    private int[] solution1(int[] numbers, int target) {
        //itar
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }


}
