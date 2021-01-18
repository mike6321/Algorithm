package me.choi.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:52 오전
 */
public class FrogRiverOne {
    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int solution = frogRiverOne.solution(X, A);
        System.out.println(solution);
    }

    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                set.add(A[i]);
            }

            if (set.size() == X) {
                return i;
            }
        }


        return  -1;
    }
}
