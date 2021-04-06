package me.choi.exam.kakaocommerce;

import java.util.*;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 1:01 오후
 */
public class Solution01 {

    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        //step 01
//        int[] gift_cards = {4, 5, 3, 2, 1};
//        int[] wants = {2, 4, 4, 5, 1};

        //step 02
        int[] gift_cards = {5, 4, 5, 4, 5};
        int[] wants = {1, 2, 3, 5, 4};

        int solution = solution01.solution(gift_cards, wants);
        System.out.println(solution);
    }

    public int solution(int[] gift_cards, int[] wants) {

        List<Gift> gifts = new ArrayList<>();
        for (int i = 0; i < gift_cards.length; i++) {
            gifts.add(new Gift(gift_cards[i], wants[i], i));
        }

        /**
         * 우선순위
         * 1. 바뀔때 두가지가 만족하는지
         * 2. 어쩔수없으면 시퀀셜하게
         * */
        int size = gifts.size();
        int answer = size;
        boolean tag = false;

        for (int i = 0; i < gifts.size(); i++) {
            int nowGift = gifts.get(i).getGiftNum();
            int nowWant = gifts.get(i).getWantNum();
            int nowIndex = gifts.get(i).getNowIndex();

            //key 와 value가 교차하는 index 찾기
            for (int j = 0; j < gifts.size(); j++) {
                if (j == i) {
                    continue;
                }
                int targetGift = gifts.get(j).getGiftNum();
                int targetWant = gifts.get(j).getWantNum();
                int targetNowIndex = gifts.get(i).getNowIndex();
                if (nowGift == targetWant && nowWant == targetGift) {
                    answer -= 2;
                    gifts.remove(nowIndex);
                    gifts.remove(targetNowIndex);

                    tag = true;
                }
            }

            //key와 value가 일치하는 index 찾기
            for (int j = 0; j < gifts.size(); j++) {
                if (j == i) {
                    continue;
                }
                int targetGift = gifts.get(j).getGiftNum();
                int targetWant = gifts.get(j).getWantNum();
                int targetNowIndex = gifts.get(i).getNowIndex();

                if (nowWant == targetGift) {
                    answer -= 1;
                    //swap
                    Collections.swap(gifts, nowIndex, targetNowIndex);

                    gifts.remove(nowIndex);
                    gifts.remove(targetNowIndex);
                }
            }
        }

        return answer;
    }
}
class Gift {
    private final int giftNum;
    private final int wantNum;
    private final int nowIndex;

    public Gift(int giftNum, int wantNum, int nowIndex) {
        this.giftNum = giftNum;
        this.wantNum = wantNum;
        this.nowIndex = nowIndex;
    }

    public int getGiftNum() {
        return giftNum;
    }

    public int getWantNum() {
        return wantNum;
    }

    public int getNowIndex() {
        return nowIndex;
    }
}
