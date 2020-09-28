package me.choi.book.e_problem.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Re_Problem_361 {
    public static void main(String[] args) {
        Re_Problem_361 problem = new Re_Problem_361();
     ;   //int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        //int N = 5;

        int[] stages = {4, 4, 4, 4, 4};
        int N = 4;
        int[] solution = problem.solution(N, stages);

        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }
    }

    public int[] solution(int N, int[] stages) {

        List<Adventurer> adventurerList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            double success = 0;
            double fail = 0;
            double failCalculate;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    fail += 1;
                }
                if (stages[j] >= i) {
                    success += 1;
                }
            }
            if (success == 0) {
                adventurerList.add(new Adventurer(i, 0));
            }
            else {
                failCalculate = fail / success;
                adventurerList.add(new Adventurer(i, failCalculate));
            }
        }

        Collections.sort(adventurerList);
        int[] result = new int[adventurerList.size()];
        for (int i = 0; i < adventurerList.size(); i++) {
            result[i] = adventurerList.get(i).getIndex();
        }

        return result;
    }
}
class Adventurer implements Comparable<Adventurer>{
    private final int index;
    private final double failCalculate;

    public Adventurer(int index, double failCalculate) {
        this.index = index;
        this.failCalculate = failCalculate;
    }

    public int getIndex() {
        return index;
    }

    public double getFailCalculate() {
        return failCalculate;
    }

    @Override
    public int compareTo(Adventurer o) {

        if (o.getFailCalculate() == this.failCalculate) {
            Integer.compare(this.index, o.getIndex());
        }
        return Double.compare(o.getFailCalculate(), this.failCalculate);
    }
}
