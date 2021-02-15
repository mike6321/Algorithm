package me.choi.codility.naver;

import java.util.Stack;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:06 오후
 */
public class Four {
    public static void main(String[] args) {
        Four four = new Four();
        int[] param1 = {2, 4, 1, 6, 5, 9, 7};
        int[] param2 = {4, 3, 2, 6, 1};
        int[] param3 = {2, 1, 6, 4, 3, 7};
        int[] param4 = {1, 2, 3, 4};
        int[] param5 = {4, 3, 2, 6};
        int[] param6 = {5, 4, 2, 1, 3, 6};

        int solution = four.solution(param6);
        System.out.println(solution);
    }
    public int solution(int[] arr) {
        int length = arr.length;
        int result = 1;
        int hasLessThenNumIdx = 0;
        int count = 0;

        for (int i = hasLessThenNumIdx; i < length - 1; i++) {

            for (int j = 0; j < length - 1; j++) {

            }
        }
//        for (int i = 0; i < length; i = hasLessThenNumIdx + 1) {
//            for (hasLessThenNumIdx = i + 1; hasLessThenNumIdx < length - 1; hasLessThenNumIdx++, i++) {
//                if (arr[i] > arr[hasLessThenNumIdx]) {
//                    result++;
//                    count++;
//                    break;
//                }
//
//                if (count == 1) {
//                    result -= 1;
//                }
//            }
//        }
        return result;
    }
}
