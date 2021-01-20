package me.choi.codility.prefixsums;
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
    private static Map<Character, Integer> impactFactor = new HashMap<Character, Integer>();

    static {
        impactFactor.put('A', 1);
        impactFactor.put('C', 2);
        impactFactor.put('G', 3);
        impactFactor.put('T', 4);
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
        int strLength = S.length();
        int impactFactorLength = 4;
        int[][] impactFactorArray = new int[impactFactorLength][strLength + 1];


        // 문자열만큼 돌고
        for (int i = 1; i <= strLength; i++) {
            char targetStr = S.charAt(i-1);
            int impactFactorIndex = impactFactor.get(targetStr);

            //네번
            for (int j = 0; j < impactFactorLength; j++) {
                if (impactFactorIndex == j + 1) {
                    impactFactorArray[j][i] = impactFactorArray[j][i-1] + 1;
                } else {
                    impactFactorArray[j][i] = impactFactorArray[j][i-1];
                }
            }
        }
        for (int i = 0; i < impactFactorLength; i++) {
            for (int j = 0; j < strLength + 1; j++) {
                System.out.print(impactFactorArray[i][j] + " ");
            }
            System.out.println();
        }



        int length = P.length;
        int[] result = new int[length];
        System.out.println("##############################");
        for (int i = 0; i < length; i++) {
//    		int p = P[i];
//    		int q = Q[i];
            for (int j = 0; j < impactFactorLength; j++) {
                System.out.println("[" + i + "," + j +"] "+ "[" + j + "," + (Q[i]+1) + "] " + "[" + j +"," + P[i] + "] => "+impactFactorArray[j][Q[i] + 1]  + ", " + impactFactorArray[j][P[i]]);
                // 순서대로 올라가기 때문에 뒤에 증가되는것은 신경쓸필요 없고 그냥 break 하면 된다.
                if (impactFactorArray[j][Q[i] + 1] - impactFactorArray[j][P[i]] > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
            System.out.println("##############################");
        }




        return result;
    }
}
