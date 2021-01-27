package me.choi.whiteship.example;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:21 오후
 */
public class StringCompression {
    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        stringCompression.solution("aabbaccc");
    }
    public int solution(String s) {
        int splitNum = s.length() / 2;

        int startIndex = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < splitNum; i++) {
            String nowStr = s.substring(startIndex, startIndex + i);
            while (true) {
                //startIndex + i;
                
            }
        }

        int answer = 0;
        return answer;
    }
}
