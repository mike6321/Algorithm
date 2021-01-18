package me.choi.codility.countingelements;

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
        int length = A.length;
        boolean[] flag = new boolean[length];
        int count =  0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                if (!flag[A[i] - 1]) {
                    count++;
                }
                flag[A[i] - 1] = true;
            }

            if (count == X) {
                return i;
            }
        }

        return  -1;
    }
}
