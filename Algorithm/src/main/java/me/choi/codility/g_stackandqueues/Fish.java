package me.choi.codility.g_stackandqueues;

import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 1:26 오후
 */
public class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        int solution = fish.solution(A, B);

        System.out.println(solution);
    }
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> down = new Stack<>();
        int lastSize = 0;
        int aliveSize = 0;
        for (int i = 0; i < A.length; i++) {
            //하류로 내려가는 고기들 stack에 담기
            if (B[i] == 1) {
                down.push(A[i]);
            } else { // 상류로 올라가는 고기들의 경우
                while (!down.isEmpty()) {
                    lastSize = down.peek(); // 첫 번째 하류로 내려가는 고기와 사이즈 비교
                    if (lastSize > A[i]) { // 하류로 내려가는 고기 값이 더크면 루프 종료
                        break;
                    } else {
                        down.pop();
                    }
                }
                if (down.isEmpty()) {
                    aliveSize++;
                }
            }
        }
        return aliveSize + down.size();
    }
}
