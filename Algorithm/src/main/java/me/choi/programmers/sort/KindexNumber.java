package me.choi.programmers.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : k번째
 * Time : 10:43 오후
 */
public class KindexNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KindexNumber kindexNumber = new KindexNumber();
        kindexNumber.solution(array, command);
    }

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            int startIndex = commands[i][0];
            int lastIndex = commands[i][1];
            int where = commands[i][2];

            List<Integer> list = new ArrayList<>();
            for (int j = startIndex - 1; j < lastIndex; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            result.add(list.get(where - 1));
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i));
            answer[i] = result.get(i);
        }

        return answer;
    }
}
