package me.choi.book.e_problem.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Re_10825 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Score> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] str = scanner.nextLine().split(" ");
            list.add(new Score(str[0], parseInt(str[1]), parseInt(str[2]), parseInt(str[3])));
        }

        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i).getName());
        }

    }

    private static int parseInt(String str) {
        return Integer.parseInt(str);
    }

}
class Score implements Comparable<Score>{
    private final String name;
    private final int kor;
    private final int eng;
    private final int math;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

/*
국어 점수가 감소하는 순서로
국어 점수가 같으면 영어 점수가 증가하는 순서로
국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
* */
    @Override
    public int compareTo(Score other) {
        // 다 같을때 문자열 순
        if (other.getKor() == this.kor && other.getEng() == this.eng && other.getMath() == this.math) {
            //return other.name.compareTo(this.name);
            return this.name.compareTo(other.getName());
        }
        // 국어 영어 같을 때
        if (other.getKor() == this.kor && other.getEng() == this.eng) {
            //return Integer.compare(this.math, other.getMath());
            return Integer.compare(other.getMath(), this.math);
        }
        //국어만 같을 때
        if (other.getKor() == this.kor) {
            return Integer.compare(this.eng, other.getEng());
        }

        // 기본은 문자열 내림차순
       return Integer.compare(other.getKor(), this.kor);
    }
}
