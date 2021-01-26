package me.choi.codility.g_stackandqueues;

import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 스택 자료구조를 사용
 * Time : 12:27 오후
 */
public class Brackets {

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        int solution = brackets.solution("{[()()]}");

        System.out.println(solution);
    }
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();
        char[] mark = S.toCharArray();

        for (int i = 0; i < mark.length; i++) {
            char targetChar = mark[i];
            //열기괄호일땐 push
            if (targetChar == '{' || targetChar == '[' || targetChar == '(') {
                stack.push(targetChar);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                char popChar = stack.pop();
                // TODO: [solution] junwoochoi 2021/01/26 1:24 오후
                /**
                 * 열기괄호가 아닐떈 스택 가장 상단에 있는 것이 해당 괄호의 여는 괄호인지 체크
                 * 아니는 0 리턴
                 * */
                if (targetChar == '}' && popChar != '{') {
                    return 0;
                } else if (targetChar == ')' && popChar != '(') {
                    return 0;
                } else if (targetChar == ']' && popChar != '[') {
                    return 0;
                }

            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
