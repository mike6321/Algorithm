package me.choi.book.e_problem;

import java.util.*;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 모험가 길드
 * Time : 11:29 오후
 */

/**
5
2 3 1 2 2
 */
public class Problem_311 {
    private static int n;
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        int result = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += 1;
            if (count >= list.get(i)) {
                result += 1;
                count = 0;
            }
        }

        System.out.println(result);
    }
}
