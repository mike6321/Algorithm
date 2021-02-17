package me.choi.interviewwithprogrammers;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:52 오후
 */
public class Hindex {
    public static void main(String[] args) {
        Hindex hindex = new Hindex();
        int[] citations = {3, 0, 6, 1, 5};
        int solution = hindex.solution(citations);
        System.out.println(solution);
    }
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;

        int answer = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (citations[i] > answer) {
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
