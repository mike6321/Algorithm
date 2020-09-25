package me.choi.book.e_problem.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*국영수 재풀이*/
public class Re_Problem_359 {
    private static int n;
    private static List<Score_2> scoreList;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scoreList = new ArrayList<>();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] str = scanner.nextLine().split(" ");
            scoreList.add(new Score_2(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3])));
        }

        Collections.sort(scoreList);

        for (int i = 0; i < n; i++) {
            System.out.println(scoreList.get(i).getName());
        }

    }
}
class Score_2 implements Comparable<Score_2>{
    private final String name;
    private final int korea;
    private final int english;
    private final int math;

    public Score_2(String name, int korea, int english, int math) {
        this.name = name;
        this.korea = korea;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKorea() {
        return korea;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    @Override
    public int compareTo(Score_2 origin) {

        if (origin.getKorea() == this.korea && origin.getEnglish() == this.english && origin.getMath() == this.math) {
            return this.name.compareTo(origin.getName());
        }

        if (origin.getKorea() == this.korea && origin.getEnglish() == this.english) {
            // 수학 감
            return origin.getMath() - this.math;
        }

        if (origin.getKorea() == this.korea) {
            // 영어점수 증가
            return this.english - origin.getEnglish();
        }

        // 숫자 내림차순
        return origin.getKorea() - this.korea;
    }
}

