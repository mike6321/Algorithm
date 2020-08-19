package me.choi.baekjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/11
 * Time : 11:14 오후
 */

public class B1966 {


    private static int N;
    private static int M;
    private static int K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();

        for (int m=0 ; m<K ; m++) {

            N = sc.nextInt();
            M = sc.nextInt();
            List<method> queue = new ArrayList<method>();

            for (int i=0 ; i<N ; i++) {
                queue.add(new method(i, sc.nextInt()));
            }
            method method;
            int totalCount = 0;
            int result = 0;


            while (!queue.isEmpty()) {

                method = queue.get(0);

                /*해당 숫자보다 큰 수 가 있을시*/
                if (biggerThan(method.getVal(), queue)) {
                    queue.add(method);
                    queue.remove(0);

                }else {/*POP*/
                    totalCount++;
                    queue.remove(0);

                    if(method.getPos()==M)
                        result = totalCount;
                }

            }

            System.out.println(result);
        }

    }

    static boolean biggerThan(int num , List<method> queue) {

        for(int i=0 ; i< queue.size(); i++) {
            if (queue.get(i).getVal() > num)
                return true;
        }

        return false;
    }
}
class method {
    private final int pos;
    private final int val;

    public method(int pos, int val) {
        this.pos = pos;
        this.val = val;
    }

    public int getPos() {
        return pos;
    }

    public int getVal() {
        return val;
    }
}
