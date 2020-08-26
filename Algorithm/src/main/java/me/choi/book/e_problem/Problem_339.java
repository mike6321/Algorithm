package me.choi.book.e_problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 도시의 개수
        int M = scanner.nextInt(); // 도로의 개수
        int K = scanner.nextInt(); // 거리정보
        int X = scanner.nextInt(); // 출발도시의 번호

        List<ArrayList<Node>> lists = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lists.add(new ArrayList<Node>());
        }
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            lists.get(i).add(new Node(x, y));
        }



     }
}
class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
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
