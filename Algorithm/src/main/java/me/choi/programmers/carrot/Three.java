package me.choi.programmers.carrot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:57 오후
 */
public class Three {
    public static void main(String[] args) {
        Three three = new Three();
//        int[] arr1 = {10, 20, 51, 66, 78, 99, 99};
//        int[] arr2 = {5, 6, 20, 35, 44, 66, 100, 200};
//        int[] arr3 = {1, 2, 10, 20, 40, 50, 66, 77};

//        int[] arr1 = {1, 3, 5 ,7, 9, 11, 11};
//        int[] arr2 = {1, 2, 3, 3, 4, 5, 6, 7};
//        int[] arr3 = {2, 4, 6, 6, 8, 10, 12, 14, 16};

        int[] arr1 = {2000000000, 3, 5 ,7, 9, 11, 11};
        int[] arr2 = {2000000000, 2, 3, 3, 4, 5, 6, 7};
        int[] arr3 = {2000000000, 4, 6, 6, 8, 10, 12, 14, 16};

        int solution = three.solution(arr1, arr2, arr3);
        System.out.println(solution);
    }

    public int solution(int[] arr1, int[] arr2, int[] arr3) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] ditinctArr1 = ditinct(arr1);
        int[] ditinctArr2 = ditinct(arr2);
        int[] ditinctArr3 = ditinct(arr3);

        insertKetValue(ditinctArr1, map);
        insertKetValue(ditinctArr2, map);
        insertKetValue(ditinctArr3, map);
//        System.out.println(map);


        int maxValue = 0;
        for (Integer integer : map.keySet()) {
            if (map.get(integer) >= 3 && integer > maxValue) {
                maxValue = integer;
            }
        }

        return maxValue == 0 ? -1 : maxValue;
    }

    private int[] ditinct(int[] arr2) {
        return Arrays.stream(arr2).distinct().toArray();
    }

    private void insertKetValue(int[] arr1, Map<Integer, Integer> map) {
        for (int i : arr1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
    }
}
