package me.choi.codility.g_stackandqueues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:27 오후
 */
public class Brackets {
    private static Map<Character, Character> map = new HashMap<>();
    static {
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }
    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        int solution = brackets.solution("{[()()]}");

        System.out.println(solution);
    }
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();
        char[] mark = S.toCharArray();

        stack.push(mark[0]);
        for (int i = 1; i < mark.length; i++) {
            char peek = stack.peek();
            char target = mark[i];

            if (map.get(peek) == target) {
                stack.pop();
            } else {
                stack.push(target);
            }
        }

        return stack.size() != 0 ? 0 : 1;
    }
}
