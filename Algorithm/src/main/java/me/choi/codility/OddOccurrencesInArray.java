package me.choi.codility;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:01 오전
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        //int[] A = {9, 3, 9, 3, 9, 7, 9};
        int[] A = {9, 3, 9, 3, 9, 3, 11};
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int solution = oddOccurrencesInArray.solution(A);
        System.out.println(solution);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        int oddValue = A[0];
        int evenValue = A[1];
        int result = -1;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                if (distinguishDifferentValue(A, oddValue, i)) return A[i];
            }
            else {
                System.out.println(i);
                if (distinguishDifferentValue(A, evenValue, i)) return A[i];
            }
        }
        return result;
    }

    private boolean distinguishDifferentValue(int[] A, int evenValue, int i) {
        if (A[i] != evenValue) {
            return true;
        }
        return false;
    }
}
