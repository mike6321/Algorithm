package me.choi.inflearn.whiteship.example;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    public int solution(int cacheSize, String[] cities) {
        List<String> lru = new ArrayList<>();
        int answer = 0;

        if (cacheSize == 0) {
            answer = cities.length * 5;
            return answer;
        }

        for (String city : cities) {
            String temp = city.toUpperCase();

            if (lru.contains(temp)) {
                lru.remove(temp);
                lru.add(temp);
                answer += 1;
            }
            else {
                if (lru.size() == cacheSize) {
                    lru.remove(0);
                }

                lru.add(temp);

                answer += 5;
            }
        }
        return answer;
    }
}
