package me.choi.codility;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:37 오후
 */
public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        int sol = binaryGap.solution(32);

        System.out.println(sol);
    }

    public int solution(int N) {
        String toBinaryString = Integer.toBinaryString(N);
        List<Integer> oneIndex = new ArrayList<>();

        for (int i = 0; i < toBinaryString.length(); i++) {
            if (toBinaryString.charAt(i) == '1') {
                oneIndex.add(i);
            }
        }

        int maxGap = Integer.MIN_VALUE;
        if (oneIndex.size() != 1) {
            for (int i = 0; i < oneIndex.size() - 1; i++) {
                int gap = Math.abs(oneIndex.get(i) - oneIndex.get(i + 1));
                maxGap = Integer.max(maxGap, gap);
            }
        }
        else {
            maxGap = 0;
        }

        return maxGap;
    }
}
