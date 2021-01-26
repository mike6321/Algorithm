package me.choi.codility.f_sorting;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * 각 요소의 범위가 정수 최소 ~ 최대 이므로 더했을 경우 long 형으로 처리해야 함
 * 정렬을 우선 한다.
 * 정렬 된 상태 이면 아래는 무조건 만족하므로 A[P] + A[Q] > A[R] 에 대해서만 체크함.
 *
 * A[R] + A[P] > A[Q] (첫번째, 마지막 합은 중간보다 항상 큼)
 * A[Q] + A[R] > A[P] (중간, 마지막 합은 첫번째보다 항상 큼)
 * Time : 8:33 오전
 */
public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        int[] A = {10, 2, 5, 1, 8, 20};
        int solution = triangle.solution(A);

        System.out.println(solution);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        long P = 0;
        long Q = 0;
        long R = 0;
        for (int i = 0; i < A.length - 2; i++) {
            P = A[i];
            Q = A[i + 1];
            R = A[i + 2];

            if (P + Q > R) {
                return 1;
            }
        }

        return 0;
    }
}
