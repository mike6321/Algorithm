package me.choi.book.b_bfsdfs.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 인접리스트
 * Time : 4:07 오후
 */
class Node {
    private final int index;
    private final int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Node{" +
                "index=" + index +
                ", distance=" + distance +
                '}';
    }
}

public class AdjacencyList {
    public static List<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Node>());
        }
        // 노드 0에 연결된 노드 정보 저장
        graph.get(0).add(new Node(1, 7));
        graph.get(0).add(new Node(2, 5));

        // 노드 1에 연결된 노드 정보 저장
        graph.get(1).add(new Node(0, 7));

        // 노드 2에 연결된 노드 정보 저장
        graph.get(2).add(new Node(0, 5));

        // 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j).toString());
            }
            System.out.println();
        }
    }
}
