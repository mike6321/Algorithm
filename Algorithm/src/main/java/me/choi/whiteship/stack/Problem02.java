package me.choi.whiteship.stack;

import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:03 오후
 */
public class Problem02 {
    public static void main(String[] args) {
        Problem02 problem02 = new Problem02();
        boolean check1 = problem02.check("[{1 + 2 * (2 + 2)} - (1 - 3)]");
        boolean check2 = problem02.check("[{1 + 2 * (2 + 2)} - [1 - 3)]");

        System.out.println(check1);
        System.out.println(check2);
    }

    private boolean check(String mathExpression) {
        Stack<Character> brackets = new Stack<>();
        char[] chars = mathExpression.toCharArray();

        for (char c : chars) {
            if (c == '[' || c == '{' || c == '(') {
                brackets.push(c);
            } else {
                if (brackets.isEmpty()) {
                    return false;
                }

                if (c == ']' && brackets.pop() != '[') {
                    return false;
                } else if (c == '}' && brackets.pop() != '{') {
                    return false;
                } else if (c == ')' && brackets.pop() != '(') {
                    return false;
                }
            }
        }


        return brackets.isEmpty() ? true : false;
    }
}
