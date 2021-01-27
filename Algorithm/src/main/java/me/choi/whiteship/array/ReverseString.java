package me.choi.whiteship.array;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:35 오전
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.solution1("Hello".toCharArray()));
        // 시간복잡도 : O(N)
        // 공간복잡도 : O(N)
        System.out.println(reverseString.solution2("Hello".toCharArray()));
        // 시간복잡도 : O(N)
        // 공간복잡도 : O(1) -- 기존의 array를 그대로 사용한것이기 떄문에
    }

    private char[] solution1 (char[] message) {
        char[] reversedMessage = new char[message.length];

        for (int i = message.length - 1; i >= 0; i--) {
             reversedMessage[message.length - 1 - i] = message[i];
        }

        return reversedMessage;
    }

    private char[] solution2 (char[] message) {
        swap(message);
        return message;
    }

    private void swap(char[] message) {
        for (int i = 0; i < message.length / 2; i ++) {
            char temp = message[i];
            message[i] = message[message.length - 1 - i];
            message[message.length - 1 - i] = temp;
        }
    }
}
