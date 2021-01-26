package me.choi.codility.b_arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 짝이 안맞는것을 찾을 땐 XOR 연산을 하
 * Time : 2:41 오후
 */
public class OddOccurrencesInArrayXor {
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 3, 9, 3};
        OddOccurrencesInArrayXor oddOccurrencesInArrayXor = new OddOccurrencesInArrayXor();
        oddOccurrencesInArrayXor.solution(A);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int temp = 0;
        for (int i : A) {
            temp = temp ^ i;
        }
        System.out.println(temp);
        return temp;
    }
}
