package me.choi.exam.sixshop;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:32 오후
 */
public class Problem02 {
    public static void main(String[] args) {
        Problem02 problem02 = new Problem02();
        int[] grade = {2, 2, 1};
//        int[] grade = {3, 2 ,1, 2};
        int[] solution = problem02.solution(grade);
    }

    public int[] solution(int[] grade) {
        List<Grade> grades = new ArrayList<>();
        for (int i = 0; i < grade.length; i++) {
            grades.add(new Grade(i, grade[i], 0));
        }
        Collections.sort(grades);

        int preveGrade = grades.get(0).getGrade();
        int rank = 1;
        for (int i = 0; i < grades.size(); i++) {
            int nowGrade = grades.get(i).getGrade();
            if (preveGrade == nowGrade) {
                grades.get(i).setRank(rank);
            }
            else {
                rank++;
                grades.get(i).setRank(i + 1);
                preveGrade = grades.get(i).getGrade();
            }
        }

        int[] answer = new int[grade.length];
        for (int i = 0; i < grades.size(); i++) {
            Grade resultGrade = grades.get(i);
            answer[resultGrade.getIndex()] = resultGrade.getRank();
        }

        for (int i : answer) {
            System.out.println(i);
        }

        
        return answer;
    }
}
class Grade implements Comparable<Grade>{
    private final int index;
    private final int grade;
    private int rank;

    public Grade(int index, int grade, int rank) {
        this.index = index;
        this.grade = grade;
        this.rank = rank;
    }

    public int getIndex() {
        return index;
    }

    public int getGrade() {
        return grade;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Grade o) {
        return o.getGrade() - this.grade;
    }
}

