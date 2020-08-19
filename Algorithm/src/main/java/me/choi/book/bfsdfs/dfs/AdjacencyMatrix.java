package me.choi.book.bfsdfs.dfs;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:59 오후
 */
public class AdjacencyMatrix {
    private static final int INF = 999999999;

    public static int[][] graph = {
            {0, 7, 5},
            {7, 0, INF},
            {5, INF, 0}
    };

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(graph[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
