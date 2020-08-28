package me.choi.book.e_problem;

import java.util.*;

public class Problem_339 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 도시의 개수
        int m = scanner.nextInt(); // 도로의 개수
        int k = scanner.nextInt(); // 거리 정보
        int x = scanner.nextInt(); // 출발 도시의 정보
        int[] visited = new int[300001];
        List<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
            visited[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            graph.get(a).add(b);
        }
        visited[x] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);

        while (!queue.isEmpty()) {
            int start = queue.poll();
            int size = graph.get(start).size();
            for (int i = 0; i < size; i++) {
                int nextNode = graph.get(start).get(i);

                if (visited[nextNode] == -1) {
                    visited[nextNode] = visited[start] + visited[nextNode];
                    queue.offer(visited[nextNode]);
                }
            }
        }

        boolean tag = false;

        for (int i = 0; i < m; i++) {
            if (visited[i] == k) {
                tag = true;
                System.out.println(visited[i]);
            }
        }
        if (!tag) {
            System.out.println(-1);
        }
    }

}

