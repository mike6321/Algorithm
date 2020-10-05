package me.choi.book.e_problem.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 문자열 압축
 * Time : 7:28 오후
 */
public class Problem_323 {

    public static void main(String[] args) {
        Problem_323 problem_323 = new Problem_323();
        String s = "aabbaccc";

        int solution = problem_323.solution(s);
        System.out.println(solution);
    }

    public int solution(String s) {

        int length = s.length();
        int result = 0;
        int jumpIndex = 0;
        int plusIndex = 1;

        for (int i = 0; i < length; i+=jumpIndex) {
            int nextIndex = i + plusIndex;
            int lastIndex = nextIndex + plusIndex - 1;

            if (nextIndex < length && lastIndex < length) {
                String nowStr = s.substring(i, nextIndex);
                int nxIdx = i + plusIndex;
                int lstIdx = nextIndex + plusIndex;
                String nextStr = s.substring(nxIdx, lstIdx);

                if (nowStr.equals(nextStr)) {
                    result += Math.abs(i - nextIndex) + 1;
                    //jumpIndex += plusIndex * 2;
                    jumpIndex = plusIndex + 1;
                }
                else {
                    jumpIndex = 1;
                    result += 1;
                }
            }
            else {
                jumpIndex = 1;
                result += 1;
            }
        }

        return result;
    }
}
