package me.choi.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:16 오후
 */
public class Q1 {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int solution = q1.solution(6);
        System.out.println(solution);
    }
    public int solution(int n) {
        Map<Integer, Integer> dragonLifeCycle = new HashMap<>();
        Map<Integer, Integer> eggLifeCycle = new HashMap<>();

        int noEggDragon = 0;
        int yesEggDragon = 0;
        int egg = 1;

        // 첫 번째 알 초기화 (탄생일 0)
        eggLifeCycle.put(1, 0);

        for (int i = 0; i <= n; i++) {
            // 드래곤 알 체크
            for (Integer getEgg : eggLifeCycle.keySet()) {
                int birthDate = eggLifeCycle.get(getEgg);
                // 알 탄생일 + 2 가 현재 일자인 경우
                 if (i == birthDate + 2) {
                    // 부화한 드래곤 넣기
                     dragonLifeCycle.put(i, i);
                     yesEggDragon++;
                     // 알 제거
                    egg--;
                }
            }

            // 드래곤 부화 체크
            for (Integer getDragon : dragonLifeCycle.keySet()) {
                int birthDate = dragonLifeCycle.get(getDragon);
                // 부화할 수 있는지 체크
                if (i != birthDate + 4) {
                    eggLifeCycle.put(i, i);
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
