package me.choi.book.e_problem.impl;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 문자열 압축 재 풀이
 * Time : 11:21 오후
 */
public class Problem_323_3 {
    public static void main(String[] args) {

        Problem_323_3 problem_323 = new Problem_323_3();
        String s = "aabbaccc";
        int solution = problem_323.solution(s);
        System.out.println(solution);
    }

    private int solution(String s) {
        int result = 0;
        int length = s.length();

        //몇번의 간격일지에 대한 루프
        for (int i = 1; i <= length; i++) {
            //결과값 저장
            StringBuffer sb = new StringBuffer();
            int cnt = 1;
            for (int j = 0; j < length; j++) {
                int nextIndex = j + i;

                //범위를 넘어설때
//                if (nextIndex >= length || nextIndex + i >= length) {
//                    break;
//                }
                String firstStr = s.substring(j, nextIndex);
                String secondStr = s.substring(nextIndex, nextIndex + i);

                //첫번째 문자열과 두번째 문자열이 같다면
                if (firstStr.equals(secondStr)) {
                    cnt++;

                    //if (nextIndex + )
                    continue;
                }
                else {
                    // cnt 가 0 인 경우는 제외 (0a 이런 경우는 없으니)
                    if (cnt != 1) {
                        sb.append(cnt);
                    }
                    sb.append(firstStr);
                    cnt = 1;
                }
            }
        }




        return result;
    }
}
