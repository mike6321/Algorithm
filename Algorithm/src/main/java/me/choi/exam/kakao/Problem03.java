package me.choi.exam.kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 카카오 문제 3번
 * Time : 10:15 오후
 */
public class Problem03 {
    public static void main(String[] args) {
//        List<Integer> start_time = Arrays.asList(1, 3, 3, 5, 7);
//        List<Integer> running_time = Arrays.asList(2, 2, 1, 2, 1);
        List<Integer> start_time = Arrays.asList(1, 2, 3, 3, 4);
        List<Integer> running_time = Arrays.asList(4, 1, 2, 1, 1);
        int solution = Problem03.solution(start_time, running_time);

        System.out.println(solution);
    }


    public static int solution(List<Integer> start_time, List<Integer> running_time) {
        // Write your code here
        List<Time> timeList = new ArrayList<>();

        for (int i = 0; i < start_time.size(); i++) {
            timeList.add(new Time(start_time.get(i), start_time.get(i) + running_time.get(i)));
        }

//        System.out.println(timeList.size());


        int totalCount = 0;
        //마지막 종료시간
        int endTime = 0;
        //마지막 시작시간
        int startTime = 0;
        for (Time time : timeList) {
            //현재 시작시간
            int nowStartTime = time.getStartTime();
            //현재 종료시간
            int nowEndTime = time.getEndTime();

            if (startTime < nowStartTime && endTime < nowEndTime) {
                totalCount++;
                startTime = nowStartTime;
                endTime = nowStartTime;
            } else if (startTime == nowStartTime) {
                if (nowEndTime < endTime) {
                    endTime = nowEndTime;
                }
                continue;
            }
        }


        return totalCount;
    }
}
class Time {
    private final int startTime;
    private final int endTime;

    public Time(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

}
