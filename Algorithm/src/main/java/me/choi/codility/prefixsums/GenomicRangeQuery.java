package me.choi.codility.prefixsums;

import java.util.HashMap;
import java.util.Map;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:36 오후
 */
public class GenomicRangeQuery {
    static Map<Character, Integer> impactFactors = new HashMap<>();
    static {
        impactFactors.put('A', 1);
        impactFactors.put('C', 2);
        impactFactors.put('G', 3);
        impactFactors.put('T', 4);
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
        // write your code in Java SE 8
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int p = P[i];
            int q = Q[i];

            result[i] = Integer.min(impactFactors.get(S.charAt(p)),impactFactors.get(S.charAt(q)));
        }

        return result;
    }
}
