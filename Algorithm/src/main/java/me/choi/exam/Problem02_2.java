package me.choi.exam;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:32 오후
 */
public class Problem02_2 {
    public static void main(String[] args) {
        String result = Problem02_2.transform("abbcbbb");
        System.out.println(result);

    }

    public static String transform(String input) {
        char[] chars = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        char prevChar = chars[0];
        sb.append(prevChar);

        char nowChar;
        int index = 0;
        for (int i = 1; i < chars.length; i++) {
            nowChar = chars[i];

            if (nowChar == prevChar) {
                continue;
            }
            prevChar = nowChar;
            sb.append(nowChar);
        }

        return sb.toString();
    }
}
/*
SELECT *
  FROM DEPARTMENTS
;
SELECT *
  FROM EMPLOYEES
;
* */
