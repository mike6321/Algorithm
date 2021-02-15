package me.choi.codility.naver;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:32 오후
 */
public class Three {
    public static void main(String[] args) {
        Three three = new Three();
        int[] blocks = {1, 5, 5, 2, 6};
//        int[] blocks = {2, 6, 8, 5};
        int solution = three.solution(blocks);
        System.out.println(solution);
    }
    public int solution(int[] blocks) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < blocks.length; i++) {
            int rightIndex = rightMove(i, blocks);
            int leftIndex = leftMove(i, blocks);

            result = Integer.max(result, Math.abs(rightIndex - leftIndex) + 1);
            //System.out.println(rightIndex - leftIndex);

        }

        return result;
    }

    private int rightMove(int i, int[] blocks) {
        for (int j = i; j < blocks.length - 1; j++) {
            if (blocks[j] > blocks[j+1]) {
                return j;
            }
        }
        return blocks.length - 1;
    }

    private int leftMove(int i, int[] blocks) {
        for (int j = i; j > 1; j--) {
            if (blocks[j] > blocks[j-1]) {
                return j;
            }
        }

        return 0;
    }

}
