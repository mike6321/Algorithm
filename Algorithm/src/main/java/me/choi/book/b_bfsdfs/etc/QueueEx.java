package me.choi.book.b_bfsdfs.etc;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:27 오후
 */
public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(3);
        queue.offer(4);
        queue.poll();
        queue.offer(5);
        queue.offer(7);

        /*
        * 3 4
        * 4
        * 4 5 7
        * */

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.poll();
        }
    }
}
