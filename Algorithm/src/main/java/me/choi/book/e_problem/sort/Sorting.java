package me.choi.book.e_problem.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:35 오후
 */
public class Sorting {
    public static void main(String[] args) {
        List<CheckPoint> list = new ArrayList<>();
        list.add(new CheckPoint(3, 4));
        list.add(new CheckPoint(1, 3));
        list.add(new CheckPoint(2, 2));
        list.add(new CheckPoint(3, 1));
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getX() + ", " + list.get(i).getY());
        }
    }
}
class CheckPoint implements Comparable<CheckPoint>{
    private final int x;
    private final int y;

    public CheckPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(CheckPoint origin) {
        return Integer.compare(this.x, origin.getX());
    }
}
