package me.choi.interviewwithprogrammers;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:22 오후
 */
public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        MaxNumber maxNumber = new MaxNumber();
        String solution = maxNumber.solution(numbers);
        System.out.println(solution);
    }
    public String solution(int[] numbers) {
        int length = numbers.length;

        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }
        // TODO: Arrays.sort를 활용하여 정렬 Comparator를 활용하여 규칙을 만들어 주는데, 두 String을 합하여 더 큰 쪽이 우선순위가 있도록 구성 2021/02/17 8:48 오후
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        if (strArr[0].equals("0")) {
            return "0";
        }

        String answer = "";
        for (String s : strArr) {
            answer += s;
        }

        return answer;
    }
}
