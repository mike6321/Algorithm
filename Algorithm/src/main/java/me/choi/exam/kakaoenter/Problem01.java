package me.choi.exam.kakaoenter;

import java.util.*;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:03 오후
 */
public class Problem01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(30, 15, 16);
        List<Integer> result = cardinalitySort(list);
        System.out.println(result);
    }

    public static List<Integer> cardinalitySort(List<Integer> nums) {

        List<BinaryClass> oneCount = new ArrayList<>();
        for (Integer num : nums) {
            char[] binaryChars = Integer.toBinaryString(num).toCharArray();
            int count = 0;
            for (int i = 0; i < binaryChars.length; i++) {
                if (binaryChars[i] == '1') {
                    count++;
                }
            }
            oneCount.add(new BinaryClass(num, count));
        }
        Collections.sort(oneCount);

        List<Integer> result = new ArrayList<>();
        for (BinaryClass binaryClass : oneCount) {
            result.add(binaryClass.getPrevNumber());
        }

        return result;
    }
}
class BinaryClass implements Comparable<BinaryClass>{
    private final int prevNumber;
    private final int count;

    public BinaryClass(int prevNumber, int count) {
        this.prevNumber = prevNumber;
        this.count = count;
    }

    public int getPrevNumber() {
        return prevNumber;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(BinaryClass o) {
        if (this.count == o.getCount()) {
            return Integer.compare(this.prevNumber, o.getPrevNumber());
        }

        return Integer.compare(this.count, o.getCount());
    }

}
