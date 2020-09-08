package me.choi.book.e_problem.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 실패율
 * Time : 8:05 오후
 */
public class Problem_361 {
    private static final int N = 4;
    private static final int[] stages = {4,4,4,4,4};
//    private static final int N = 5;
//    private static final int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

    public static void main(String[] args) {
        Problem_361 quiz = new Problem_361();
        int[] solution = quiz.solution(N, stages);

        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }
    }

    public int[] solution(int N, int[] stages) {
        List<Point> list = new ArrayList<>();
        int winner = stages.length;

        for (int i = 1; i <= N; i++) {
            int loser = 0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    loser += 1;
                }
            }

            double fail = 0;
            if (winner >= 1) {
                fail = (double) loser / winner;
            }

            winner -= loser;
            list.add(new Point(i, fail));
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).getStages();
        }

        return answer;
    }

}
class Point implements Comparable<Point>{
    private final int stages;
    private final double fail;

    public Point(int stages, double fail) {
        this.stages = stages;
        this.fail = fail;
    }

    public int getStages() {
        return stages;
    }

    public double getFail() {
        return fail;
    }

    @Override
    public int compareTo(Point origin) {
        if (origin.getFail() == this.fail) {
            // 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
            return Integer.compare(this.stages, origin.getStages());
        }

        return Double.compare(origin.fail, this.fail);

    }
}
