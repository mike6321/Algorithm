package me.choi.codility.g_stackandqueues;

import java.util.Arrays;
import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:44 오후
 */
public class StoneWall {
    public static void main(String[] args) {
        StoneWall stoneWall = new StoneWall();
        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        int solution = stoneWall.solution(H);

        System.out.println(solution);
    }

    public int solution(int[] H) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < H.length; i++) {
            while (!stack.isEmpty() && stack.peek() > H[i]) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() < H[i]) {
                stack.push(H[i]);
                result++;
            }
        }
        return result;
    }
}
