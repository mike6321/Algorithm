package me.choi.exam.kakaoenter;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:15 오후
 */
public class Problem02 {
    public static void main(String[] args) {

    }

    public long minimumOneBitOperations(long n) {
        String binaryStr = Long.toBinaryString(n);
//        String result = "";
        StringBuilder result = new StringBuilder();
        result = result.append(binaryStr.charAt(0));

        for (int i = 1; i < binaryStr.length(); i++) {
            int fisrtChar = (result.charAt(i - 1) - '0');
            int secondChar = (binaryStr.charAt(i) - '0');
            int mixChar = fisrtChar ^ secondChar;

            result.append(mixChar);
        }

        return Long.parseLong(result.toString(), 2);
    }

}
