package me.choi.exam.sixshop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:18 오후
 */
public class Problem04 {
    public int[] solution(int N, int[] coffee_times) {

        List<Coffe> extract = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            extract.add(new Coffe(i + 1, coffee_times[i]));
        }

        int time = 0;



        int[] answer = {};
        return answer;
    }
}
class Coffe {
    private final int number;
    private final int time;

    public Coffe(int number, int time) {
        this.number = number;
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public int getTime() {
        return time;
    }
}
