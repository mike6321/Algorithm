package me.choi.issue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 어떻게 1억건의 데이터를 100건만 최신순으로 보일 수 있을까?
 * Time : 9:37 오후
 */
public class BulkDataSorting {
    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();
        for (int i = 500; i < 1000; i++) {
            data.add(i);
        }
        for (int i = 0; i < 500; i++) {
            data.add(i);
        }

        Queue<Integer> priority1 = new PriorityQueue<>();
        // 1 2 3 4
        Queue<Integer> priority2 = new PriorityQueue<>();
        // 4 3 2 1

        //100개의 데이터를 넣었음
        for (int i = 0; i < 100; i++) {
            priority1.offer(data.get(i));
        }

        //599
        for (int i = 100; i < data.size(); i++) {
            int targetData = data.get(i);

            for (int j = 0; j < priority1.size(); j++) {
                int nowMinValue = priority1.peek();
                System.out.println(nowMinValue);
            }
        }

        System.out.println(priority1.poll());
    }
}
