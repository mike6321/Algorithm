package me.choi.codility.prefixsums;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:36 오후
 */
public class GenomicRangeQuery {

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
        // write your code in Java SE 8
        int length = S.length();
        int impactLength = 4;
        int[] impactCnt = new int[impactLength];
        int[][] impactFactorArray = new int[impactLength][length + 1];

        char c;
        int impactFactor = 0;
        for (int i = 0; i < length; i++) {
            c = S.charAt(i);
            if ('A' == c) impactFactor = 1;
            else if ('C' == c) impactFactor = 2;
            else if ('G' == c) impactFactor = 3;
            else if ('T' == c) impactFactor = 4;

            impactCnt[impactFactor - 1] += 1;

            for (int j = 0; j < impactLength; j++) {
                impactFactorArray[j][i + 1] = impactCnt[j];
            }
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < impactLength; j++) {
                if (impactFactorArray[j][Q[i] + 1] - impactFactorArray[j][P[i]] > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }
        return result;
    }
}
