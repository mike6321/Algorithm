package me.choi.book.bfsdfs.etc;

import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:14 오후
 */
public class StackEx {
/*
*
    public Element push(Element item); // 데이터 추가
    public Element pop(); // 최근에 추가된(Top) 데이터 삭제
    public Element peek(); // 최근에 추가된(Top) 데이터 조회
    public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
    public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음
*
*/
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.pop();
        stack.push(1);
        stack.push(4);
        stack.pop();
        /*
        * 5 2 3 7
        * 5 2 3
        * 5 2 3 1
        * 5 2 3 1 4
        * 5 2 3 1
        * */

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
