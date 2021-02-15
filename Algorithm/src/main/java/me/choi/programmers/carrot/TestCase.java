package me.choi.programmers.carrot;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:41 오후
 */
public class TestCase {
    public static void main(String[] args) {
        String str = "{";
        for (int i = 1; i <= 300000; i++) {
            str += i;


            if (i == 300000) {
                str += i;
                str += "}";
            }
        }
        System.out.println(str);
    }
}
