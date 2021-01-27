package me.choi.whiteship.stack;

import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * 문제 1. 스택 뒤집기
 * 스택을 뒤집는 코드를 작성하라.
 *
 * Time : 11:37 오전
 */
public class Problem01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Stack<Integer> reversedStack = solution1(stack);
        System.out.println(reversedStack);
    }

    private static Stack<Integer> solution1(Stack<Integer> stack) {
        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }

        return reversedStack;
    }
}
