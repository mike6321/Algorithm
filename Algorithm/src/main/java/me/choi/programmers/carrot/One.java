package me.choi.programmers.carrot;

import java.util.*;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:51 오후
 */
public class One {
    public static void main(String[] args) {
        String s = "aaaaaaaaaa";
        One one = new One();
        String result = one.solution(s);

        System.out.println(result);
    }

    public String solution(String s) {
        final int[] counts = new int[26];
        final String source = s.toLowerCase(Locale.ROOT);
        final char[] letters = source.toCharArray();
        for (char letter : letters) {
            counts[letter - 'a']++;
        }

        int max = getMaxCount(counts);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            if (count == max) {
                result.append((char) (i + 'a'));
            }
        }

        return result.toString();
    }

    private int getMaxCount(final int[] counts) {
        return Arrays.stream(counts)
                .max()
                .getAsInt();
    }

//    public String solution(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        char[] chars = s.toLowerCase().toCharArray();
//        for (char aChar : chars) {
//            if (!map.containsKey(aChar)) {
//                map.put(aChar, 1);
//            } else {
//                map.put(aChar, map.get(aChar) + 1);
//            }
//        }
//        int maxValue = 0;
//        char maxKey = 0;
//        List<Character> list = new ArrayList<>();
//        for (Character character : map.keySet()) {
//            if (map.get(character) > maxValue) {
//                maxValue = map.get(character);
//                maxKey = character;
//            }
//        }
//
//
//        return String.valueOf(maxKey);
//    }

}
