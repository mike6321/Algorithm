package me.choi.codility.b_arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 짝이 안맞는것을 찾을 땐 XOR 연산을
 *            다 같은대 1개만 다른경우
 * Time : 2:41 오후
 */
public class OddOccurrencesInArrayXor {
    public static void main(String[] args) {
        int[] A = {9, 3, 7, 9, 3};

        /**
         * (9, 9), (3, 3), 7
         * 0, 0, 7
         * 0, 7
         * 7
         *
         * {9, 3, 9, 3, 5, 7, 5, 7, 3};
         *
         * 9 9 3 3 5 5 7 7 3
         * (9 9) (3 3) (5 5) (7 7) 3
         * 0 0 0 0 3
         * 3
         *
         * 2 9 3 7 2 9 3
         *
         * 1 + 2 + 3 + 4 = 10
         * 4 + 2 + 3 + 1 = 10
         * (2 + 3) + (4 + 1) = 10
         *
         * {9, 3, 9, 3, 5, 7, 5, 7, 3};
         * pair
         * ^
         *
         * pair가 되지 않는 나머지 값을 찾을때 사용!
         * */
        OddOccurrencesInArrayXor oddOccurrencesInArrayXor = new OddOccurrencesInArrayXor();
        oddOccurrencesInArrayXor.solution(A);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println(Integer.toBinaryString(A[i]));
        }

        /**
         *
         * 다른게 있으면 1로 리턴을 한다.
         *
         * 1001
         * 1001
         *
         * 0
         *
         * 0011
         * 0011
         *
         * 0
         *
         * =1010
         *
         * 1010
         * 1001
         *
         * =0011
         *
         * */

        for (int i : A) {
            temp = temp ^ i;
        }
        System.out.println(temp);
        return temp;
    }
}
