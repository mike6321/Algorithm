package me.choi.book.d_binarysearch;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 순차탐색
 * Time : 12:55 오전
 */
/**
5 Dongbin
Hanul Jonggu Dongbin Taeil SangWook
*/
public class ex_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
        int n = scanner.nextInt();
        String target = scanner.next();

        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        System.out.println(sequantialSearch(n, target, arr));
    }

    private static int sequantialSearch(final int n, final String target, final String[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

            if (arr[i].equals(target)) {
                return i + 1;
            }

        }
        return -1;
    }

}
