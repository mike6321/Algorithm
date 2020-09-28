package me.choi.book.e_problem.sort;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Problem_363 {
    private static int n;
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            queue.offer(scanner.nextInt());
        }
        System.out.println(queue.size());
        int result = 0;
        while (queue.size() != 1) {
            int first = queue.poll();
            int second = queue.poll();

            int sum = first + second;

            result += sum;
            queue.offer(result);
        }

        System.out.println(result);
    }
}
