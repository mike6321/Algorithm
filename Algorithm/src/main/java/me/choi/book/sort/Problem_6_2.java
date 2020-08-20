package me.choi.book.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 성적이 낮은 순서대로 학생 출력하기
 * Time : 11:23 오후
 */
/**
2
홍길동 95
이순신 77
 */
public class Problem_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int[] arr = new int[100];
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String[] strings = scanner.nextLine().split(" ");
            students.add(new Student(strings[0], parseInt(strings[1])));
        }

        Collections.sort(students);

        for (int i = 0; i < N; i++) {
            System.out.print(students.get(i).getName()+ " ");
        }
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}

class Student implements Comparable<Student>{
    private final String name;
    private final int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getScore() < student.getScore()) {
            return -1;
        }
        return 1;
    }

}
