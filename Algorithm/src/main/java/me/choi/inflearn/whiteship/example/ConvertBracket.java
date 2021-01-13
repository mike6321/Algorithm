package me.choi.inflearn.whiteship.example;

import java.util.Stack;

public class ConvertBracket {
    private int position;
    public String solution(String p) {
        //1. 입력이 빈 문자열인 경우 빈 문자열 반환
        if (p.isEmpty()) {
            return p;
        }

        //2. u v 분리
        boolean correct = isCorrect(p);
        String u = p.substring(0, position);
        String v = p.substring(position, p.length());

        if (correct) {
            return u += solution(v);
        }

        String answer = "(" + solution(v) + ")";

        for (int i = 1; i < u.length() - 1; ++i) {
            if (u.charAt(i) == '(') {
                answer += ")";
            }
            else {
                answer += "(";
            }
        }


        return answer;
    }

    private boolean isCorrect(String p) {
        boolean ret = true;
        int left = 0;
        int right = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                left += 1;
                stack.push('(');
            }
            else {
                right += 1;
                if (stack.empty()) {
                    ret = false;
                }
                else {
                    stack.pop();
                }
            }
            if (left == right) {
                position = i + 1;
                return ret;
            }
        }

        return true;
    }
}
