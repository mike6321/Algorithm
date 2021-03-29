package me.choi.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:41 오전
 */
public class SalesByMatch {
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i]) + 1);
            }
            else {
                map.put(ar[i], 0);
            }
        }

        for (Integer key : map.keySet()) {

        }


        return 0;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = 7;
        int[] ar = {1, 2, 1, 2, 1, 3, 2};
        int solution = sockMerchant(7, ar);

        System.out.println(solution);
    }
}
