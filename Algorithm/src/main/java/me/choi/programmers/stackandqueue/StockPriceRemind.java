package me.choi.programmers.stackandqueue;

import java.util.Arrays;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:33 오후
 */
public class StockPriceRemind {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        StockPriceRemind stockPriceRemind = new StockPriceRemind();
        int[] solution = stockPriceRemind.solution(prices);

        Arrays.stream(solution).forEach(System.out::println);
    }
    public int[] solution(int[] prices) {

        int length = prices.length;

        int[] answer = new int[length];

        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            int target = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int price = prices[j];
                count++;
                if (target > price) {
                    break;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}
