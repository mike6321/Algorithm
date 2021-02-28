package me.choi.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:40 오후
 */
public class Problem02 {
    public static void main(String[] args) {
        Problem02 problem02 = new Problem02();
//        String m = "kkaxbycyz";
//        String k = "abc";

        String m = "acbbcdc";
        String k = "abc";

        String solution = problem02.solution(m, k);
        System.out.println(solution);
    }
    public String solution(String m, String k) {
        StringBuilder result = new StringBuilder();

        int index = 0;
        for (int i = 0; i < k.length(); i++) {
            char key = k.charAt(i);
            for (int j = index; j < m.length(); j++) {
                char letter = m.charAt(j);
                if (key == letter) {
                    String cutter = m.substring(index, j);
                    result.append(cutter);
                    index = j + 1;
                    break;
                }
            }
        }

        if (index < m.length()) {
            result.append(m.substring(index));
        }

        return result.toString();
    }
}
/**

 SELECT *
 FROM
 (
 SELECT TO_CHAR(CREATED_AT, 'fmmm') AS "MONTH",
 COUNT(1) AS "COUNT"
 FROM SELLINGS
 GROUP BY TO_CHAR(CREATED_AT, 'fmmm')
 )
 ORDER BY MONTH
 ;

 SELECT COUNT(1)
 FROM SELLINGS
 WHERE TO_CHAR(CREATED_AT, 'fmmm') = '7'
 ;

 SELECT P.ID AS PLACE_ID
 , P.NAME
 , COUNT(PR.COMMENTS) AS 개수
 FROM PLACES P
 LEFT OUTER JOIN PLACE_REVIEWS PR
 ON P.ID = PR.PLACE_ID
 GROUP BY P.ID
 ORDER BY P.ID


 SELECT P.ID               AS "PLACE_ID"
 , P.NAME             AS "NAME"
 , COUNT(PR.COMMENTS) AS "개수"
 FROM PLACES P
 LEFT OUTER JOIN PLACE_REVIEWS PR
 ON P.ID = PR.PLACE_ID
 GROUP BY P.ID
 ORDER BY P.ID ASC
 ;
 * */

