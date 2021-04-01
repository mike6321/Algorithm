package me.choi.book.c_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:28 오후
 */
public class Issu {
    public static void main(String[] args) {
        List<Integer> table = new ArrayList<>();
        Random random = new Random();
        for(int i = 1; i < 1000000; i++) {
            table.add(random.nextInt(100000));
        }

        Collections.sort(table);

        // TODO: Merge, quick을 사용하지 않는다...? 2021/04/01 8:46 오후
        List<Integer> limitHun = table.stream()
                                      .limit(100)
                                      .collect(Collectors.toList());

        for (Integer integer : limitHun) {
            System.out.print(integer + " , ");
        }
    }
}
