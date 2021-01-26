package me.choi.codility.e_prefixsums;

import java.util.HashMap;
import java.util.Map;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * 누적을 구해서
 * Time : 10:36 오후
 */
public class GenomicRangeQuery {
    private static Map<Character, Integer> impactsFactors = new HashMap<>();
    static {
        impactsFactors.put('A', 1);
        impactsFactors.put('C', 2);
        impactsFactors.put('G', 3);
        impactsFactors.put('T', 4);
    }

    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};

        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        int[] solution = genomicRangeQuery.solution(S, P, Q);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8a
        int impactFactorsLength = impactsFactors.size();
        int strLength = S.length();
        int[][] impactFactorsArrays = new int[impactFactorsLength][strLength+1];

        // TODO: [solution] junwoochoi 2021/01/20 10:37 오후
        /**
         * 루프의 인덱스를 구하는 것이 까다로웠다.
         * 한번 다시 리마인드해보자!
         * */
        // 7번의 루프
        for (int i = 1; i <= strLength; i++) {
            char targetChar = S.charAt(i-1);
//            System.out.println(targetChar);
            // 4번의 루프
            for (int j = 0; j < impactFactorsLength; j++) {
                int impactFactor = impactsFactors.get(targetChar) - 1;

                if (impactFactor == j) {
                    impactFactorsArrays[j][i] = impactFactorsArrays[j][i - 1] + 1;
                } else {
                    impactFactorsArrays[j][i] = impactFactorsArrays[j][i - 1];
                }
            }
        }

//        for (int i = 0; i < impactFactorsLength; i++) {
//            for (int j = 0; j <= strLength; j++) {
//                System.out.print(impactFactorsArrays[i][j] + " ");
//            }
//            System.out.println();
//        }

        int length = P.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int p = P[i];
            int q = Q[i];
            // TODO: [solution] junwoochoi 2021/01/20 10:30 오후
            /**
             * q+1에 주목!
             * p, q 의 value가 같은 경우 자기 자신이 나오는 이유는 array의 "첫 번째 열이 0으로 시작했기 떄문에" 하나라도 변하면 그자신이 되기 때문이다.
             * [0] 0 1 1 1 1 1 2
             * [0] 1 1 1 2 3 3 3
             * [0] 0 0 1 1 1 1 1
             * [0] 0 0 0 0 0 1 1
             *
             *누적이기 때문에 다음열의 값이 이전열보다 작을 수는 없다
             * 0 0 1 1 1 1 1 2
             * 0 1 1 1 2 3 3 3 -> 절대 작지 않다.
             * 0 0 0 1 1 1 1 1
             * 0 0 0 0 0 0 1 1
             *
             *이 기준으로 q - p 를 해서 양수가 나오는 것은 변화가 있다는 이야기이고
             * A, C, G, T 순으로 순차적으로 이루어져 있기 떄문에 break를 하면 변화가 일어난것중 가장 작은 impactFactor가 나온다.
             * */
            for (int j = 0; j < impactFactorsLength; j++) {
                if (impactFactorsArrays[j][q+1] - impactFactorsArrays[j][p] > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }

        return result;
    }
}
