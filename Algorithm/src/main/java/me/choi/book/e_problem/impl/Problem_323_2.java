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
        /*******************TestCase*******************/
        //String s = "aabbaccc";
        //String s = "ababcdcdababcdcd";
        String s = "abcabcdede";
        //String s = "abcabcabcabcdededededede";
        //String s = "xababcdcdababcdcd";
        /*******************TestCase*******************/

        int solution = problem_323.solution(s);

        //System.out.println(solution);
    }

    public int solution(String s) {

        int result = Integer.MAX_VALUE;
        int length = s.length();

        /*******************TestCase*******************/
        //int position = 1;
        //int position = 8;
        int position = 3;
        //int position = 6;
        //int position = 1;
        /*******************TestCase*******************/

        int count = 0;
        int sequence = 0;
        boolean resultFlag = true;
        //전체 루프
        for (int i = 0; i < length; i+=sequence) {
            if (i == length - 1) {
                count = length;
                break;
            }
            if (resultFlag == false) {
                count += length - i;
                break;
            }
            boolean flag = true;
            sequence = 0;

            //첫 번째 문자열
            String firstIndex = s.substring(i, i + position);
            //한번일때 카운트
            int onceCount = 1;

            for (int j = i; j < length; j+=position) {
                //자르는 수가 인덱스를 넘어버린다면
                if (j + position -1 >= length) {
                    resultFlag = false;
                    break;
                }
                //두 번째 문자열
                if (i == j) {
                    continue;
                }

                String secondIndex = s.substring(j, j + position);

                //첫 번째 문자열과 두 번째 문자열이 같다면 (그 다음번째 체크)
                if (firstIndex.equals(secondIndex)) {
                    onceCount++;
                    sequence = j + position - i;

                    if (flag == true) {
                        count += position + 1;
                    }
                    flag = false;
                } else {
                    if (onceCount == 1) {
                        sequence = j + position - i - 1;
                        count += 1;
                    }

                    break;
                }
            }

        }

        System.out.println(count);

        return result;
    }

}
