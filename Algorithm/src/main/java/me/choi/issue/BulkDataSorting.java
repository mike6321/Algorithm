package me.choi.issue;

import java.util.*;
import java.util.stream.Stream;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 어떻게 1억건의 데이터를 100건만 최신순으로 보일 수 있을까?
 * Time : 9:37 오후
 */
public class BulkDataSorting {

    private static List<Integer> cache = new ArrayList<>();

    static {
        for (int i = 10000000; i > 1000000 ; i--) {
            cache.add(i);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> hundredQueue = new PriorityQueue<>();

        long start = System.currentTimeMillis();
        int size = cache.size();

        for (int i = 0; i < size; i++) {
            int targetData = cache.get(i);

            if (hundredQueue.size() > 99) {
                int maxofHundredCacheValue = hundredQueue.peek();

                if (maxofHundredCacheValue > targetData) {
                    hundredQueue.offer(targetData);
                    hundredQueue.poll();
                }
            }
            else {
                hundredQueue.offer(targetData);
            }
        }
        long end = System.currentTimeMillis() - start;

        int index = 1;
        while (!hundredQueue.isEmpty()) {
            System.out.println("index " + index +  " : " + hundredQueue.poll());
            index++;
        }
        System.out.println("소요시 : " + end);
    }
}