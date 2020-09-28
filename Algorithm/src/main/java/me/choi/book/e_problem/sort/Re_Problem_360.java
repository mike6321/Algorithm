package me.choi.book.e_problem.sort;

import java.util.*;

public class Re_Problem_360 {
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        List<Point3> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int totalSum = 0;
            for (int j = 0; j < n; j++) {
                totalSum += Math.abs(arr[i] - arr[j]);
            }
            list.add(new Point3(arr[i], totalSum));
            result[i] = totalSum;
        }

        Collections.sort(list);

        System.out.println(list.get(0).getX());

    }
}
class Point3 implements Comparable<Point3>{
    private final int x;
    private final int y;

    public Point3(int x, int y) {
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
    public int compareTo(Point3 o) {
        return this.getY() - o.getY();
    }
}
