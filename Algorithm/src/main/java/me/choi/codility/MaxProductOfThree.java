package me.choi.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxProductOfThree {
    public static void main(String[] args) {
        MaxProductOfThree mpo = new MaxProductOfThree();
        int[] a = {-3, 1, 2, -2, 5, 6};
        mpo.solution(a);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(new Point(i, A[i]));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getValue());
        }

        int result = list.get(list.size() - 1).getValue() * list.get(list.size() - 2).getValue() * list.get(list.size() - 3).getValue();

        System.out.println(result);
        return result;
    }
}
class Point implements Comparable<Point>{
    private final int index;
    private final int value;

    public Point(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Point o) {
        return this.value - o.getValue();
    }
}
