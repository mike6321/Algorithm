package me.choi.issue;

import java.util.*;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 어떻게 1억건의 데이터를 100건만 최신순으로 보일 수 있을까?
 * 소요시간 : 5706
 * Time : 9:37 오후
 */
public class BulkDataSortingUsingLibrary {

    private static List<Integer> cache = new ArrayList<>();

    static {
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            cache.add(random.nextInt(10000000));
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Collections.sort(cache);
        long end = System.currentTimeMillis() - start;
        System.out.println("소요시간 : " + end);
    }
}
