package me.choi.book.e_problem.undoagain;

import java.util.HashMap;
import java.util.Map;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 무지의 먹방 라이브
 * Time : 11:57 오후
 */
public class Muzi {
    static class A {
        private int a;

        public A(int a) {
            this.a = a;
        }
    }
    public static void main(String[] args) {
        Map<A, Integer> map = new HashMap<>();

        map.put(new A(1), 3);
        map.put(new A(2), 3);

        System.out.println(map.size());

        map.put(new A(2), 4);

        //map의 사이즈는?
        System.out.println(map.size());
    }
}
