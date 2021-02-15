package me.choi.codility.naver;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:29 오후
 */
public class Two {
    public static void main(String[] args) {
        Two two = new Two();
        int solution = two.solution(268);

        System.out.println(solution);
    }

    public int solution(int N) {
        String s = String.valueOf(N);

        char[] chars = s.toCharArray();
        char[] charsResult = new char[chars.length + 1];

        for (int i = 0; i < chars.length; i++) {
            charsResult[i] = 5;

            for (int j = 0; j < charsResult.length; j++) {
                if (i == j) {
                    continue;
                }
                charsResult[j+1] = chars[j];
            }

        }


        // write your code in Java SE 8
        return 0;
    }
}
