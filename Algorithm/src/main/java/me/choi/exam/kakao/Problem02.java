package me.choi.exam.kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 카카오 문제 2번
 * Time : 10:15 오후
 */
public class Problem02 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int arrRows = Integer.parseInt(bf.readLine());
        int arrColumns = Integer.parseInt(bf.readLine());
        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < arrRows; i++) {
            String[] s = bf.readLine().split(" ");
            List<String> stringList = new ArrayList<>();

            for (int j = 0; j < arrColumns; j++) {
                stringList.add(s[0]);
                stringList.add(s[1]);
                stringList.add(s[2]);
            }
            arr.add(stringList);
        }

//        Result.solution(arr);
    }
}
class Result {
    private static final int BORROW_INDEX = 0;
    private static final int LEND_INDEX = 1;
    private static final int POINT_INDEX = 2;


//    public static List<String> solution(List<List<String>> arr) {
//        final Map<String, Integer> map = new HashMap<>();
//
//        for (List<String> persons : arr) {
//            final String borrower = persons.get(BORROW_INDEX);
//            final String lender = persons.get(LEND_INDEX);
//            final int point = Integer.parseInt(persons.get(POINT_INDEX));
//
//            if (map.containsKey(borrower)) {
//                map.put(borrower, map.get(borrower) - point);
//            } else {
//                map.put(borrower, map.getOrDefault(borrower, 0) - point);
//            }
//
//            if (map.containsKey(lender)) {
//                map.put(lender, map.get(lender) + point);
//            } else {
//                map.put(lender, map.getOrDefault(lender, 0) + point);
//            }
//
//        }
//
//        return answer(map);
//    }

    private static List<String> answer(final Map<String, Integer> map) {
        final int min = min(map);
        if (min >= 0) {
            return new ArrayList<>(Arrays.asList("None"));
        }

        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == min)
                .map(Map.Entry::getKey)
                .sorted(Comparator.comparing(Object::toString))
                .collect(Collectors.toList());
    }

    private static int min(final Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .min(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getValue)
                .get();
    }

}

    /*
     * Complete the 'solution' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_STRING_ARRAY arr as parameter.
     */
/*
5
3
Frodo Apeach 7
Frodo Apeach 3
Apeach Frodo 4
Frodo Apeach 1
Apeach Frodo 7
 */
//    public static List<String> solution(List<List<String>> arr) {
//        // Write your code here
//    }



//        Map<String, Integer> map = new HashMap<>();
//
//
//        for (int i = 0; i < arr.size(); i++) {
//            List<String> targetList = arr.get(i);
//            for (int j = 0; j < targetList.size(); j++) {
////                System.out.println(targetList.get(j));
//
//                //빌린
//                String borrow = targetList.get(0);
//                //빌려준
//                String lend = targetList.get(1);
//
//                //돈
//                Integer money = Integer.parseInt(targetList.get(2));
//
//                minusMoney(map, borrow, money);
//                insertMoney(map, lend, money);
//            }
//        }
//
//        int minus = Integer.MAX_VALUE;
//
//        String[] character = new String[map.size()];
//        for (String s : map.keySet()) {
//            int num = Integer.parseInt(s);
//            if (minus >= num) {
//                minus = num;
//            }
//        }
//
//
//        return null;


//    private static void minusMoney(Map<String, Integer> map, String borrow, Integer money) {
//        if (map.containsKey(borrow)) {
//            map.put(borrow, map.get(borrow) - money);
//        }
//        else {
//            map.put(borrow, -money);
//        }
//    }
//
//    private static void insertMoney(Map<String, Integer> map, String lend, Integer money) {
//        if (map.containsKey(lend)) {
//            map.put(lend, map.get(lend) + money);
//        }
//        else {
//            map.put(lend, money);
//        }
//    }



//}
