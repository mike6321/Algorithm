package me.choi.book.e_problem.impl;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 1:55 오전
 */
public class Problem_323_2 {
    public static void main(String[] args) {
        Problem_323_2 problem_323 = new Problem_323_2();
        String s = "aabbaccc";

        int solution = problem_323.solution(s);
        //System.out.println(solution);
    }

    public int solution(String s) {
        int result = Integer.MAX_VALUE;
        int length = s.length();
        int position = 1;

        int count = 0;
        int next = 0;
        for (int i = 0; i < length; i+=count) {
            next = 0;
            String firstIndex = s.substring(i, i + position);
            System.out.println(firstIndex);
            for (int j = i + 1; j < length; j++) {
                String secondIndex = s.substring(j, j + position);
                if (firstIndex.equals(secondIndex)) {
                    count += 1;
                }
                else {
                    next = count + 1;
                    break;
                }
            }
        }
        System.out.println(count);
//        for (int position = 1; position <= length / 2; position++) {
//            System.out.println(position);
//            for (int i = 0; i < length; i++) {
//                String firstIndex = s.substring(i, i + position);
//                for (int j = i + 1; j < length; j++) {
//                    String secondIndex = s.substring(j, j + position);
//
//                }
//            }
//        }



        return result;
    }
}
