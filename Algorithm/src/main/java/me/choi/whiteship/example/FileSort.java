package me.choi.whiteship.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:40 오후
 */
public class FileSort {
    public static void main(String[] args) {
        FileSort fileSort = new FileSort();
        String[] solution = fileSort.solution(new String[]{"img12.png", "img10.png", "img2.png", "img1.png"});

    }

    private String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //Head 뽑기
                String str1 = o1.split("[0-9]")[0];
                String str2 = o2.split("[0-9]")[0];

//                System.out.println(str1);
//                System.out.println(str2);

                //대문자 변환
                int result = str1.toUpperCase().compareTo(str2.toUpperCase());

                //Head가 같을 경우
                if (result == 0) {
                    //숫자를 비교
                    result = distinguishNumber(o1, str1) - distinguishNumber(o2, str2);
                }
                return result;
            }
        });

        return files;
    }

    private int distinguishNumber(String str, String head) {
        //HEAD 제거
        str = str.replace(head, "");
        //숫자 저장
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c) && result.length() < 6) {
                result += c;
            }
            else {
                break;
            }
        }

        return Integer.valueOf(result);
    }
}
