package me.choi.codility.countingelements;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : max값을 두개로 설정하고 전체가 변경되는 (A[i] == N + 1) 경우에는 따로 최종 max 값을 변경한다.
 * 최종 max 값을 루프마다 체크를 하고 최종 max이 클 경우엔 최종 max + 1 을 하고
 * 이외의 경우엔 기존 값에 +1 을 하고
 *
 * 나중에는 최종 max 값 보다 작은 경우를 모두 최종 max 값으로 채운다.
 *
 * 이것이 가능한 이유는 A[i] == N + 1 의 경우가 없으면 최종 max 값은 변경이 이루어지지 않고 0으로 남아있기 떄문이다.
 * Time : 2:01 오후
 */
public class MaxCounters {
    public static void main(String[] args) {
        MaxCounters maxCounters = new MaxCounters();
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] solution = maxCounters.solution(N, A);
        for (int i : solution) {
            System.out.println(i);
        }
    }
    public int[] solution(int N, int[] A) {

        int[] result = new int[N];

        int max = 0;
        int resultMax = 0;
        for (int i = 0; i < A.length; i++) {
            int num = A[i];
            if (1 <= num && N >= num) {
                int resultIndex = num - 1;

                // 최종 최댓값이 더 큰 경우
                if (resultMax >= result[resultIndex]) {
                    result[resultIndex] = resultMax + 1;
                } else { // 최종 최댓값이 더 작은 경우
                    result[resultIndex] = result[resultIndex] + 1;
                }
                max = Integer.max(max, result[resultIndex]);
            }
            else if (num == N + 1) {
                resultMax = max;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] < resultMax) {
                result[i] = resultMax;
            }
        }

        return result;
    }
}
