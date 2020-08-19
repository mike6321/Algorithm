package me.choi.baekjunlecture.class05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:59 오후
 */
public class B1697 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] visited = new int[100001];

        queue.add(N);
        visited[N] = 1;

        while (!queue.isEmpty()) {
            int poll = queue.poll();

            if (poll == M) {
                break;
            }

            if (poll+1 <= 100000 && visited[poll+1] == 0) {
                visited[poll+1] = visited[poll] + 1;
                queue.add(poll+1);
            }
            if (poll-1 >= 0 && visited[poll-1] == 0) {
                visited[poll-1] = visited[poll] + 1;
                queue.add(poll-1);
            }
            if (poll*2 <= 100000 && visited[poll*2] == 0) {
                visited[poll*2] = visited[poll] + 1;
                queue.add(poll*2);
            }
        }

        System.out.println(visited[M]-1);
    }

}
