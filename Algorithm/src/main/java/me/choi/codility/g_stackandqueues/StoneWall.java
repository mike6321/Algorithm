package me.choi.codility.g_stackandqueues;

import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : https://lipcoder.tistory.com/entry/StoneWall-Codility
 *
 *1. 스택이 비어있다 => h를 push한다.
 *
 * 2. 스택 top의 값이 h보다 큰 경우 => h를 push한다.
 *
 * 3. 스택 top의 값이 h보다 작은 경우 => pop 하고 배치 블럭 수를 1 증가시킨다.
 *
 * 4. 스택 top의 값이 h와 같은 경우 => 아무런 처리 없이 다음 번째 높이값으로 continue한다.
 *
 *
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
        //stack.push(H[0]);
        int count = 0;

        for (int i = 0; i < H.length; i++) {
            int targetNum = H[i];

            while (!stack.isEmpty()) {
                // 스택의 top이 현재 값보다 큰 경우
                if (stack.peek() > targetNum) {
                    count++;
                    stack.pop();
                // 현재 값이 스택의 top 보다 큰 경
                } else if (stack.peek() < targetNum){
                    stack.push(targetNum);
                    break;
                } else { //같은 경우
                    break;
                }
            }
            // 스택이 비었을 경우 현재 값 push
            if (stack.isEmpty()) {
                stack.push(targetNum);
            }
        }

        return count + stack.size();
    }
}
/**
 * 8 => 스택이 비어 있음 => 스택에 저장 [스택 : top(8)]
 *
 * 8 => top(8)과 같은 값이므로 생략
 *
 * 5 => top(8)보다 작으므로 pop한다. => result 1증가(1) => 스택에 저장 [스택 : top(5)]
 *
 * 7 => top(5)보다 크므로 => 스택에 저장 [스택 : top(7 5)]
 *
 * 9 => top(7)보다 크므로 => 스택에 저장 [스택 : top(9 7 5)]
 *
 * 8 => top(9)보다 작으므로 pop한다. => result 1증가(2) => top(7)보다 크므로 => 스택에 저장
 * [스택 : top(8 7 5)]
 *
 * 7 => top(8)보다 작으므로 pop한다. => result 1증가(3) => top(7)과 같으므로 생략
 * [스택 : top(7 5)]
 *
 * 4 => top(7)보다 작으므로 pop한다. => result 1증가(4) => top(5)보다 작으므로 pop한다. => result 1증가(5) => 스택이 비었으므로 => 스택에 저장 [스택 : top(4)]
 *
 * 8 => top(4)보다 크므로 => 스택에 저장 [스택 : top(4 8)]
 *
 * 출처: https://lipcoder.tistory.com/entry/StoneWall-Codility [기록공간]
 * */