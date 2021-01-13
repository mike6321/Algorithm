package me.choi.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 기능개발
 * Time : 7:44 오후
 */
public class FunctionDevelopment {
    public static void main(String[] args) {
        FunctionDevelopment functionDevelopment = new FunctionDevelopment();
//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};
//        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] progresses = {99, 99, 99};
        int[] speeds = {1, 1, 1};
        functionDevelopment.solution(progresses, speeds);
    }

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remains = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                remains += 1;
            }
            queue.offer(remains);
        }
//        System.out.println(queue);
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int target = queue.poll();
            int count  = 1;
            // 뽑고 나서 아무것도 없을떄
            if (queue.isEmpty()) {
                result.add(count);
                break;
            }
            int peek = queue.peek();

            while (peek <= target) {
                count++;
                queue.poll();
                if (queue.isEmpty()) {
                    break;
                }
                peek = queue.peek();
            }
            result.add(count);
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
            answer[i] = result.get(i);
        }

        return answer;
    }
}
