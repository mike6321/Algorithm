package me.choi.baekjunlecture.class05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 물통
 * Time : 7:28 오후
 */
public class B2251 {

    public static void main(String[] args) {

        /*
         * A -> B
         * 0 1
         * A -> C
         * 0 2
         * B -> A
         * 1 0
         * B -> C
         * 1 2
         * C -> A
         * 2 0
         * C -> B
         * 2 1
         * */
        int[] now  = {0, 0, 1, 1, 2, 2};
        int[] next  = {1, 2, 0, 2, 0, 1};
        boolean[][] checked = new boolean[201][201];

        Scanner scanner = new Scanner(System.in);
        int[] bucket = new int[3];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = scanner.nextInt();
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        checked[0][0] = true;

        boolean[] answer_C = new boolean[201];
        answer_C[bucket[2]] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int A = point.getX();
            int B = point.getY();
            int C = bucket[2] - A - B; // C만 가득채우고 시작했기 때문에 C가 전체라고 생각해도 된다.

            for (int i = 0; i < 6; i++) {
                int[] nextStep = {A, B, C};
                nextStep[next[i]] += nextStep[now[i]];
                nextStep[now[i]] = 0;

                // 만약 담으려는 버킷이 넘쳐버린다면
                if (nextStep[next[i]] > bucket[next[i]]) {
                    // ex) A -> B 에서 B가 넘쳐버리는 경우
                    // A에 B에서 넘치는 양만큼 다시 넣고
                    // B를 가득 채운다.
                    nextStep[now[i]] = nextStep[next[i]] - bucket[next[i]];
                    nextStep[next[i]] = bucket[next[i]];
                }

                // TODO: [main] junwoochoi 2020/08/04 8:15 오후
                // 사실 C에 대한 체크를 왜 하지 않는지 모르겠다.
                if (!checked[nextStep[0]][nextStep[1]]) {
                    checked[nextStep[0]][nextStep[1]] = true;
                    queue.add(new Point(nextStep[0], nextStep[1]));

                    if (nextStep[0] == 0) {
                        answer_C[nextStep[2]] = true;
                    }

                }
            }
        }

        for (int i = 0; i <= bucket[2]; i++) {
            if (answer_C[i]) {
                System.out.print(i+ " ");
            }
        }
    }
}
class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
