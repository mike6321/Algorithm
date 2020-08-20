package me.choi.book.b_bfsdfs.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : dfs 예제
 * Time : 4:44 오후
 */
public class Dfs {
    public static boolean[] visited = new boolean[9];
    public static List<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        init();

        dfs(1);
    }

    public static void dfs(int x) {
        visited[x] = true;
        System.out.println(x + " ");

        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) {
                dfs(y);
            }
        }
    }

    private static void init() {
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);
    }

}
