package me.choi.book.e_problem.greedy;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 무지의 먹방 라이브
 * Time : 12:01 오전
 */
public class Problem_316 {

    public static void main(String[] args) {
        Problem_316 problem_316 = new Problem_316();

        int[] food_times = {3, 2, 1};
        int k = 5;

        int result = problem_316.solution(food_times, k);
        System.out.println(result);
    }

    public int solution(int[] food_times, long k) {
        int answer = 0;
        int index = 0;

        while (k > 0) {

            food_times[index] -= 1;
            index++;

            if (index == food_times.length) {
                index = 0;
            }

            k--;
            if (k == 1) {
                answer = index;
            }
        }

        return answer;
    }
}
