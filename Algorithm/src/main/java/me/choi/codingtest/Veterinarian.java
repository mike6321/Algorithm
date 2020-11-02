package me.choi.codingtest;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:10 오후
 */
public class Veterinarian {

    private final Queue<String> queue = new LinkedList<>();

    public void accept(String petName) {
        queue.offer(petName);
    }

    public String heal() {
        String poll = queue.poll();

        return poll;
    }

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}
