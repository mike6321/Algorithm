package me.choi.codility;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : BinaryGap
 * Time : 12:25 오전
 */
public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        binaryGap.solution(1041);
    }
    public int solution(int N) {
        // write your code in Java SE 8
        int oneCount = 0;
        int zeroCount = 0;
        int result = 0;

        while (N != 0) {
            int target = N % 2;
            if (target == 1) {
                oneCount++;
            }
            if (target == 0 && oneCount == 1){
                zeroCount++;
            }

            if (oneCount == 2) {
                result = Integer.max(result, zeroCount);
                zeroCount = 0;
                oneCount = 1;
            }
            N = N / 2;
        }
        System.out.println(result);


        return result;
    }
}
