package me.choi.book.e_problem.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 국영수
 * Time : 11:08 오후
 */
public class Problem_359 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Student> students = new ArrayList<>();

        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            String[] s = str.split(" ");

            students.add(new Student(s[0], parseInt(s[1]), parseInt(s[2]), parseInt(s[3])));
        }


    }

    private static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}
class Student implements Comparable<Student>{
    private String name;
    private int korea;
    private int english;
    private int math;

    public Student(String name, int korea, int english, int math) {
        this.name = name;
        this.korea = korea;
        this.english = english;
        this.math = math;
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
    public int compareTo(Student student) {
        if (this.korea > student.getKorea()) {
            return 1;

            if (this.korea == student.getKorea() && this.english > student.getEnglish()) {
                return -1;
            }
        }
        return 0;
    }
}
