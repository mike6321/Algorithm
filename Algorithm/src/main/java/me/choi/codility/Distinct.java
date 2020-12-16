package me.choi.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 4:47 오후
 */
public class Distinct {
    public static void main(String[] args) {
        Distinct distinct = new Distinct();
        int[] A = {2, 1, 1, 2, 3, 1};
        distinct.solution(A);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i+1]) {
                list.add(A[i]);
            }
        }

        //System.out.println(list.size() + 1);
        return list.size() + 1;
    }
}
