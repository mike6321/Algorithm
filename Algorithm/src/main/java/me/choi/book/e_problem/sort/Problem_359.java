package me.choi.book.e_problem.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
12
Junkyu 50 60 100
Sangkeun 80 60 50
Sunyoung 80 70 100
Soong 50 60 90
Haebin 50 60 100
Kangsoo 60 80 100
Donghyuk 80 60 100
Sei 70 70 70
Wonseob 70 70 90
Sanghyun 70 70 80
nsj 80 80 80
Taewhan 50 60 90
*/
public class Problem_359 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String str[] = scanner.nextLine().split(" ");
            students.add(new Student(str[0], parseInt(str[1]), parseInt(str[2]), parseInt(str[3])));
        }

        Collections.sort(students);

        for (int i = 0; i < N; i++) {
            System.out.println(students.get(i).getName());
        }
    }

    private static int parseInt(String str) {
        return Integer.parseInt(str);
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
    /*
    국어 점수가 감소하는 순서로 o
    국어 점수가 같으면 영어 점수가 증가하는 순서로 o
    국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로 o
    모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
    */
    @Override
    public int compareTo(Student student) {
        // TODO Auto-generated method stub
        if (student.getEnglish() == this.english && student.getKorea() == this.korea && student.getMath() == this.math) {
            return this.name.compareTo(student.getName());
        }

        if (student.getEnglish() == this.english && student.getKorea() == this.korea) {
            return Integer.compare(student.getMath(), this.math);
        }

        if (student.getKorea() == this.korea) {
            return Integer.compare(this.english, student.getEnglish());
        }

        return Integer.compare(student.getKorea(), this.korea);
    }

}

