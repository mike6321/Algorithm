package me.choi.codility.c_timecomplexity;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:13 오후
 */
public class FrogJmp {
    public static void main(String[] args) {
        FrogJmp frogJmp = new FrogJmp();
        int X = 10;
        int Y = 85;
        int D = 30;
        frogJmp.solution(X, Y, D);
    }
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int result = (Y - X) / D;

        if ((Y - X) % D != 0) {
            result++;
        }
//        System.out.println(result);
        return result;
    }
}
