package me.choi.whiteship.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:55 오전
 */
public class Problem01 {
    public static void main(String[] args) {
        Problem01 containsDuplicate = new Problem01();
        System.out.println(containsDuplicate.solution1(new int[] {1, 2, 3, 4, 5}));
        // 시간복잡도 : O(N^2)
        // 공간복잡도 : O(1)
        System.out.println(containsDuplicate.solution2(new int[] {1, 2, 3, 4, 5}));
        // 시간복잡도 : O(NlogN)
        // 공간복잡도 : O(logN)
        System.out.println(containsDuplicate.solution2(new int[] {1, 2, 3, 4, 5, 1}));
        // 시간복잡도 : O(N)
        // 공간복잡도 : O(N)
    }

    private boolean solution1(int[] numbers) {
        for (int i = 0; i < numbers.length;i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean solution2(int[] numbers) {
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }

        return false;
    }

    private boolean solution3(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();

        for (int num : numberSet) {
            if (numberSet.contains(num)) {
                return true;
            }
            else {
                numberSet.add(num);
            }
        }

        return false;
    }
}
