package me.choi.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:54 오후
 */
public class PermCheck {
    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
//        int[] A = {4, 1, 3, 2};
        int[] A = {4, 1, 3};
        int solution = permCheck.solution(A);
        System.out.println(solution);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        int length = A.length;
        for (int i = 0; i < length; i++) {
            // 길이 보다 크면 return 0
            if (A[i] > length) {
                return 0;
            }
            // 중복된 수가 등장하면 return 0
            if (set.contains(A[i])) {
                return 0;
            }
            set.add(A[i]);
        }

//        for (int i = 1; i <= set.size(); i++) {
//            if (!set.contains(i)) {
//                return 0;
//            }
//        }
        return 1;
    }
}
