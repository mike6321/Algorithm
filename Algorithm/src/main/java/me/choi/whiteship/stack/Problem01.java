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

//        Stack<Integer> reversedStack1 = solution1(stack);
//        System.out.println(reversedStack1);

        Problem01 problem01 = new Problem01();
        problem01.solution2(stack);
        System.out.println(stack);
    }

    // TODO: [스택 비재귀] junwoochoi 2021/01/27 11:57 오전
    /**
     * 스택 비재귀
    * */
    private static Stack<Integer> solution1(Stack<Integer> stack) {
        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }

        return reversedStack;
    }

    // TODO: [스택 재귀] junwoochoi 2021/01/27 12:02 오후
    /**
     * 스택 재귀
     * 재귀를 생각할때는 작은 단위로 생각하라
     *
     * 1 2 3
     *
     * solution2 - 1 2 3
     * solution2 - 1 2   - pop(3)
     * solution2 - 1     - pop(2)
     * solution2 -       - pop(1)
     *
     * insertAtBottom - null      , 1  [1]
     * insertAtBottom - [1]     , 2
     * insertAtBottom -
     * */
    private void solution2(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        solution2(stack);
        insertAtBottom(stack, temp);
    }

    private void insertAtBottom(Stack<Integer> stack, int number) {
        if (stack.isEmpty()) {
            stack.push(number);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, number);
            stack.push(temp);
        }
    }
}
