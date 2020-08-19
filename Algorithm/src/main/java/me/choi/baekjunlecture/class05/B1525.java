package me.choi.baekjunlecture.class05;

import java.util.*;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:11 오후
 */

public class B1525 {

    public static void main(String[] args) {
        int destination = 123456789;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        int start = 0;
        int k = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                k = scanner.nextInt();
                if (k == 0) {
                    k = 9;
                }
                start = (start * 10) + k;
            }
        }
        //System.out.println(start);

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();

        map.put(start, 0);
        queue.add(start);

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            String now = String.valueOf(poll);
            int whereIsNine = now.indexOf("9"); // 1차원 배열에서 9가 몇번째 인덱스 인지
            int x = whereIsNine / 3; //9가 퍼즐에서 몇번째 행인지
            int y = whereIsNine % 3; //9가 퍼즐에서 몇번째 역인지

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int move = nx * 3 + ny; // 퍼즐 상에서 이동할 인덱스

                if (nx >= 0 && nx < 3 && ny >= 0 && ny < 3) {
                    StringBuffer sb = new StringBuffer(now);
                    char temp = sb.charAt(move);
                    sb.setCharAt(move, '9');
                    sb.setCharAt(whereIsNine, temp);
                    int nextNum = Integer.parseInt(sb.toString());
                    if (!map.containsKey(nextNum)) {
                        map.put(nextNum, map.get(poll) + 1);
                        queue.add(nextNum);
                    }
                }
            }
        }
        if (map.containsKey(destination)) {
            System.out.println(map.get(destination));
        }
        else {
            System.out.println(-1);
        }
    }
}

