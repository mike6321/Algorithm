package me.choi.interviewwithprogrammers.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:04 오후
 */
public class KindexNumber {
    public static void main(String[] args) {
        KindexNumber kindexNumber = new KindexNumber();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] solution = kindexNumber.solution(array, commands);
    }
    public int[] solution(int[] array, int[][] commands) {

        int length = commands.length;
        int startIndex = 0;
        int lastIndex = 0;
        int where = 0;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 3; j++) {
                startIndex = commands[i][0];
                lastIndex = commands[i][1];
                where = commands[i][2];
            }

            List<Integer> list = new ArrayList<>();
            for (int k = startIndex - 1; k < lastIndex; k++) {
                list.add(array[k]);
            }
            Collections.sort(list);
            answer[i] = list.get(where - 1);
        }

        return answer;
    }
}
