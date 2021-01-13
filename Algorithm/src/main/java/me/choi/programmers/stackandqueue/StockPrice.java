package me.choi.programmers.stackandqueue;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 주식가격
 * Time : 4:20 오후
 */
public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        StockPrice stockPrice = new StockPrice();
        stockPrice.solution(prices);
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int target = prices[i];
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (target > prices[j]) {
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
