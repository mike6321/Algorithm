package me.choi.codility.e_prefixsums;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : (B - A) / K 를 하니 정확성에서 자꾸 오류가 나서 각각 나눴다.
 * Time : 9:42 오후
 */
public class CountDiv {
    public static void main(String[] args) {
        int A = 6;
        int B = 11;
        int K = 2;
        CountDiv countDiv = new CountDiv();
        int solution = countDiv.solution(A, B, K);
        System.out.println(solution);
    }
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        if (A % K == 0) {
            return B/K - A/K + 1;//(B - A) / K + 1;
        }
        return B/K - A/K;//(B - A) / K;
    }
}
