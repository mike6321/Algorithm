package me.choi.programmers.stackandqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:11 오후
 */
public class CrossOverBridge {
    public static void main(String[] args) {
        CrossOverBridge crossOverBridge = new CrossOverBridge();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights =  {7,4,5,6};

        int solution = crossOverBridge.solution(bridge_length, weight, truck_weights);
        System.out.println(solution);
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> inBridge = new LinkedList<>();
        Queue<Truck> watingTruck = new LinkedList<>();

        Arrays.stream(truck_weights).forEach(weightVal -> {
            watingTruck.offer(new Truck(weightVal, 0));
        });

        int time = 0;
        int totalWeight = 0;
        while (!watingTruck.isEmpty() || !inBridge.isEmpty()) {
            time++;

            //웨이팅이 빠질 때
            if (!inBridge.isEmpty()) {

                Truck peekTruck = inBridge.peek();
                if (time - peekTruck.getTime() >= bridge_length) {
                    totalWeight -= peekTruck.getWeight();
                    inBridge.poll();
                }
            }

            //웨이팅이 들어올때
            if (!watingTruck.isEmpty()) {
                if (watingTruck.peek().getWeight() + totalWeight <= weight) {
                    Truck pollTruck = watingTruck.poll();
                    int pollTruckWeight = pollTruck.getWeight();

                    totalWeight += pollTruckWeight;
                    inBridge.offer(new Truck(pollTruckWeight, time));
                }
            }
        }

        return time;
    }
}
class Truck {
    private final int weight;
    private final int time;

    public Truck(int weight, int time) {
        this.weight = weight;
        this.time = time;
    }

    public int getWeight() {
        return weight;
    }

    public int getTime() {
        return time;
    }
}
