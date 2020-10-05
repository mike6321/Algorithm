package me.choi.book.e_problem.impl;

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

        problem_323.solution(s);
    }

    public int solution(String s) {
        int n = s.length();
        int answer = n;
        int result = Integer.MAX_VALUE;

        for (int jumpIndex = 1; jumpIndex <= n; jumpIndex++) {
            for (int i = 0; i < n; i += jumpIndex) {
                int nextIndex = jumpIndex + i;

                if (nextIndex >= n) {
                    break;
                }

                String trimStr = s.substring(i, nextIndex);
                System.out.println(trimStr);
                answer += 2;
            }

            answer += n - (answer / 2);
            //System.out.println(answer);
            if (result >= answer) {
                result = answer;
            }
        }

        System.out.println(result);


        return result;
    }
}
