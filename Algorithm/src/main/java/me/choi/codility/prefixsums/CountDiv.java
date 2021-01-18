package me.choi.codility.prefixsums;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
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
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                count++;
            }
        }
        return count;
    }
}
