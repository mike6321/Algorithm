package me.choi.book.e_problem.undoagain;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 치킨 배달
 * Time : 8:57 오후
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chicken {
    private static int n;
    private static int m;
    private static int[][] map;
    private static List<Where> home;
    private static List<Where> chicken;
    private static int[] arr;
    private static int calculateResult = Integer.MAX_VALUE;

    public static void main(String[] args) {
        //초기화
        init();
        //조합
        combination(0, 0);

        System.out.println(calculateResult);
    }

    // 조합생성
    private static void combination(int index, int depth) {

        if (depth == m) {
            List<Where> result = new ArrayList<Where>();
            for (int i = 0; i < m; i++) {
                result.add(chicken.get(arr[i]));
            }
            // 계산 시작
            calculate(result);

            return;
        }

        for (int i = index; i < chicken.size(); i++) {
            arr[depth] = i;
            combination(i + 1, depth + 1);
        }
    }

    private static void calculate(List<Where> result) {
        int homeDistance = 0;

        // 도시를 기준으로 루프돌기
        for (int i = 0; i < home.size(); i++) {
            int homeX = home.get(i).getX();
            int homeY = home.get(i).getY();
            int homeChickenDistance = Integer.MAX_VALUE;

            // 뽑은 조합을 기준으로 루프돌
            for (int j = 0; j <result.size(); j++) {
                int chickenX = result.get(j).getX();
                int chickenY = result.get(j).getY();
                // 도시와 치킨 사이의 거리 구하기
                int absCalculate = absCalculate(chickenX, chickenY, homeX, homeY);
                // 치킨거리 구하기 (최소)
                homeChickenDistance = Math.min(absCalculate, homeChickenDistance);
            }
            //도시의 치킨거리
            homeDistance += homeChickenDistance;
        }
        calculateResult = Math.min(homeDistance, calculateResult);

    }

    private static int absCalculate(int chickenX, int chickenY, int homeX, int homeY) {
        return Math.abs(homeX - chickenX) + Math.abs(homeY - chickenY);
    }

    private static void init() {
        Scanner scanner =  new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new int[m];
        map = new int[n][n];

        home = new ArrayList<>();
        chicken = new ArrayList<>();

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] str = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(str[j]);
                // 집 위치 저장
                if (map[i][j] == 1) {
                    home.add(new Where(i, j));
                }
                // 치킨집 위치 저장
                if (map[i][j] == 2) {
                    chicken.add(new Where(i, j));
                }
            }
        }
    }
}
class Where {
    private final int x;
    private final int y;

    public Where(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
