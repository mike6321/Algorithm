package me.choi.book.e_problem;

import java.util.*;

public class Problem_339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 도시의 개수
        int M = scanner.nextInt(); // 도로의 개수
        int K = scanner.nextInt(); // 거리정보
        int X = scanner.nextInt(); // 출발도시의 번호
        int[] arr = new int[300001];

        List<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            lists.add(new ArrayList<Integer>());
            arr[i] = -1;
        }

        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            lists.get(x).add(y);
        }
        arr[X] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(X);

        while (!queue.isEmpty()) {
            Integer now = queue.poll();

            for (int i = 0; i < lists.get(now).size(); i++) {
                Integer nextNode = lists.get(now).get(i);

                if (arr[nextNode] == -1) {
                    arr[nextNode] = arr[now] + 1;
                    queue.offer(nextNode);
                }
            }
        }

        boolean tag = true;
        for (int i = 1; i <= N; i++) {
            if (arr[i] == K) {
                System.out.println(i);
                tag = false;
            }
        }
        if (tag) {
            System.out.println(-1);
        }
     }

}

