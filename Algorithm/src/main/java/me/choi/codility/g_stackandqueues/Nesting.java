package me.choi.codility.g_stackandqueues;

import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:35 오후
 */
public class Nesting {
    public static void main(String[] args) {
        Nesting nesting = new Nesting();
        String S = "(()(())())";
        int solution = nesting.solution(S);

        System.out.println(solution);
    }

    public int solution(String S) {
        // write your code in Java SE 8
        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            char targetChar = chars[i];

            if (targetChar == '(') {
                stack.push(targetChar);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                char pop = stack.pop();

                if (targetChar == ')' && pop != '(') {
                    return 0;
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
