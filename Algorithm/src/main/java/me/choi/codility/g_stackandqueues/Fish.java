package me.choi.codility.g_stackandqueues;

import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 스택자료구조
 * 하류 물고기일때를 스택에 푸시하고
 * 상류 물고일때 스택에 있는 하류 물고기의 값을 비교하여 루프를 돈다.
 *
 * 상류 물고기일때 stack에 아무것도 담겨있지 않을 때에도 카운트를 늘려줘야한다.
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
        int resultSize = 0;
        for (int i = 0; i < A.length; i++) {
            //상류일때 push
            if (B[i] == 1) {
                down.push(A[i]);
            }
            //하류일때
            else {
                while (!down.isEmpty()) {
                    int downTarget = down.peek();
                    if (downTarget > A[i]) {
                        break;
                    } else {
                        down.pop();
                    }
                }
                if (down.isEmpty()) {
                    ++resultSize;
                }
            }
        }
        //남아있는 하류 물고기 수와 살아남있는 물고기 수의 합을 리턴
        return resultSize + down.size();
    }
}
