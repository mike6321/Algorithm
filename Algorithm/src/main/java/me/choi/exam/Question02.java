package me.choi.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 5:07 오후
 */
public class Question02 {
    public static void main(String[] args) {
        Question02 question02 = new Question02();
        int solution = question02.solution(6);
        System.out.println(solution);
    }

    public int solution(int n) {

        List<Dragon> dragonLifeCycle = new ArrayList<>();
        List<Dragon> eggLifeCycle = new ArrayList<>();

        int noEggDragon = 0;
        int yesEggDragon = 0;
        int egg = 1;

        // 첫 번째 알 초기화 (탄생일 0)
        eggLifeCycle.add(new Dragon(1, 0));

        for (int i = 0; i <= n; i++) {
            // 드래곤 알 체크

            for (int j = 0; j < eggLifeCycle.size(); j++) {
                Dragon dragon = eggLifeCycle.get(j);

                if (i  == dragon.getTime() + 2) {
                    dragonLifeCycle.add(new Dragon(i, i));
                    yesEggDragon++;
                    egg--;
                }
            }

            for (int j = 0; j < dragonLifeCycle.size(); j++) {
                Dragon dragon = eggLifeCycle.get(j);
                if (i != dragon.getTime() + 4) {
                    eggLifeCycle.add(new Dragon(i, i));
                    egg++;
                }
                else {
                    noEggDragon++;
                }
            }
        }
        int answer = noEggDragon + yesEggDragon + egg;
        return answer;
    }


}
class Dragon {
    private final int id;
    private final int time;

    public Dragon(int id, int time) {
        this.id = id;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public int getTime() {
        return time;
    }
}
