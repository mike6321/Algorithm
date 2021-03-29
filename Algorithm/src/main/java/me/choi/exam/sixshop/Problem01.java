package me.choi.exam.sixshop;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:46 오후
 */
public class Problem01 {
    public static void main(String[] args) {
        Problem01 problem01 = new Problem01();
        String str2 = "xyZA";
        String str1 = "ABCxy";

        String solution = problem01.solution(str1, str2);
    }

    public static String solution(String s1, String s2) {
        String result = s1 + s2;
        result = makeMinWord(s1, s2, result);
        result = makeMinWord(s2, s1, result);

        return result.length() == s1.length() + s2.length() ? "" : result;
    }

    private static String makeMinWord(String s1, String s2, String result) {
        for (int i = 0; i < s1.length(); i++) {
            String eqString = s1.substring(s1.length() - 1 - i);
            if (s2.length() > i && s2.substring(0, i + 1).equals(eqString)) {
                String tempStr = s1 + s2.substring(i + 1);
                if (tempStr.length() < result.length()) {
                    result = tempStr;
                }
                else if (tempStr.length() == result.length()) {
                    result = (tempStr.compareTo(result) > 1) ? tempStr : result;
                }
            }
        }
        return result;
    }
}
