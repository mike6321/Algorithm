package me.choi.exam.kakaocommerce;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:29 오후
 */
public class Solution2_2 {

    private static int n;
    private static int m;
    private static int[] arr;
    private static boolean[] visited;
    private static int MaxValue = Integer.MIN_VALUE;
    private static int[][] temp;

    public static void main(String[] args) {
        int[][] needles = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        int r = 2;


        Solution2_2 solution2_2 = new Solution2_2();
        int solution = solution2_2.solution(needles, r);
        System.out.println(solution);

    }

    public int solution(int[][] needs, int r) {
        temp =needs;
        n = needs[0].length;
        m = r;

        arr = new int[m];
        dfs(1, 0, needs);

        return MaxValue + 1;
    }

    private static void dfs(int index, int depth, int[][] needs) {
        if (m == depth) {
            for (int value : arr) {
                for (int i = 0; i < n; i++) {
                    needs[value][i] = 0;
                }
            }

            int count = 0;
            for (int i = 0; i < needs.length; i++) {
                int sum = 0;
                for (int j = 0; j < needs[i].length; j++) {
                    sum += needs[i][j];
                }
                if (sum == 0) {
                    count++;
                }

            }
            if (count > MaxValue) {
                MaxValue = count;
            }
            needs = temp;

            return;
        }

        for (int i = index; i <= n; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1, needs);
        }
    }
}
