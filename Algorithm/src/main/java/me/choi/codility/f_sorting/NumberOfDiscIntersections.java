package me.choi.codility.f_sorting;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 4:13 오후
 */
public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        int[] A = {1, 5, 2, 1, 4, 0};

        int solution = numberOfDiscIntersections.solution(A);
        System.out.println(solution);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int length = A.length;
        long[] lower = new long[length];
        long[] upper = new long[length];

        for (int i = 0; i < A.length; i++) {
            lower[i] = i - (long) A[i];
            upper[i] = i + (long) A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);


        int disk = 0;
        int upperIdx = 0;
        // TODO: [solution] junwoochoi 2021/01/26 2:11 오전
        /**
         * lower[i] > upper[upperIdx] 이부분이 참 이해가 되지 않았다.
         * 정리하자면
         * uppper는 끝점이고 lower는 시작점이다.
         * 시작점이 끝점보다 커졌다는것은 해당 디스크는 수명이 끝났다는 이야기이고 디스크의 갯수를 빼주어야한다.
         * */

        //정렬된 시작점 기준으로 루프돌기
        for (int i = 0; i < length; i++) {
            //시작점이 현재 끝점보다 커진다면
            while (lower[i] > upper[upperIdx]) {
                //디스크의 갯수를 빼주고
                --disk;
                //끝점의 카운트를 높힌다.
                ++upperIdx;
            }

            /**
             * lower가 2이고 upper가 1인경우
             * 끝점이 1인 디스크 B의 수명이 끝났으므로 B를 제거한다.
             *
             * lower가 5이고 upper가 4인경우
             * 끝점이 4인 디스크 C의 수명이 끝났으므로 C를 제거한다.
             * lower가 5이고 upper가 4인경우
             * 끝점이 4인 디스크 E의 수명이 끝났으므로 E를 제거한다.
             * */

            result += disk;
            ++disk;
        }
        return result;
    }
}
