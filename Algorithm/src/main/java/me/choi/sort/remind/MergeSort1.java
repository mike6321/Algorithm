package me.choi.sort.remind;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 정렬을 마친 배열의 병합
 * Time : 1:38 오후
 */
public class MergeSort1 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 11, 13};
        int[] b = {1, 2, 3, 4, 9, 16, 21};
        int[] c = new int[a.length + b.length];

        int[] result = merge(a, a.length, b, b.length, c);

        Arrays.stream(result)
              .forEach(System.out::println);
    }

    private static int[] merge(int[] a, int la, int[] b, int lb, int[] c) {

        int pa = 0;
        int pb = 0;
        int pc = 0;

        while (pa < la && pb < lb) {
            //작은값만 반영
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
        }

        /**
         * 남은 값 처리
         * */
        while (pa < la) {
            c[pc++] = a[pa++];
        }
        while (pb < lb) {
            c[pc++] = b[pb++];
        }

        return c;
    }
}
