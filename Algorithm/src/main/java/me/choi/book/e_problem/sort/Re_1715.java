package me.choi.book.e_problem.sort;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Re_1715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new PriorityQueue<>( );

        for (int i = 0; i < n; i++) {
            queue.add(scanner.nextInt());
        }

        int result = 0;
        while (queue.size() != 1) {
            int first = queue.poll();
            int secod = queue.poll();

            int sum = first + secod;
            result += sum;

            queue.offer(sum);
        }

        System.out.println(result);
    }
}
