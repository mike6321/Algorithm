package me.choi.programmers.carrot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * 출석 : A
 * 지각 : L
 * 결석 : P
 *
 * 기본점수 10점
 * 출석  + 1
 * 결석 - 1 (세번 결석시 0)
 * 지각 0 (지각 2번 - 1)
 * Time : 8:13 오후
 */
public class Two {
    public static void main(String[] args) {
        Two two = new Two();

//        String[] students = {"AAALLLAPAA", "AAAAAAAPPP", "ALAAAAPAAA"};
        String[] students = {"ALALLAAPAA", "ALLLAAAPAA", "APAPALLAAA"};
//        String[] students = {"AAAAA", "AAAAA", "AAAAAAAAAAAAA"};
        int[] solution = two.solution(students);
        for (int i : solution) {
            System.out.println(i);
        }

    }

    public int[] solution(String[] students) {

        int length = students.length;
        List<Student> scoreList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int score = 10;
            int aCount = 0; //출석
            int lCount = 0; //지각
            int pCount = 0; //결석

            char[] chars = students[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == 'A') {
                    aCount++;
                } else if (chars[j] == 'L') {
                    lCount++;
                } else if (chars[j] == 'P') {
                    pCount++;
                }
            }
            //출석
            score += aCount;
            //지각
            score -= lCount / 2;
            //결석
            score -= pCount;

            if (pCount > 2) {
                score = 0;
            }
            scoreList.add(new Student(i, score));

        }

        Collections.sort(scoreList);
        int[] answer = new int[length];

        int index = 0;
        for (Student student : scoreList) {
            answer[index] = student.getIndex() + 1;
            index++;
        }

        return answer;
    }
}
class Student implements Comparable{
    private final int index;
    private final int score;

    public Student(int index, int score) {
        this.index = index;
        this.score = score;
    }

    public int getIndex() {
        return index;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Object o) {
        Student obj = (Student) o;

        return obj.getScore() == this.getScore() ? this.getIndex() - obj.getIndex() : obj.getScore() - this.getScore();
//        if (obj.getScore() == this.getScore()) {
//            return this.getIndex() - obj.getIndex();
//        }
//        return obj.getScore() - this.getScore();
    }
}
