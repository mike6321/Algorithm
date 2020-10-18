package me.choi.book.e_problem.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:47 오후
 */

public class Chicken {
    private static int n;
    private static int m;
    private static int[][] map;
    private static List<Distance> home;
    private static int chickenSize;
    private static List<Distance> chicken;
    private static boolean[] combinationVisited;
    private static int totalResult = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        map = new int[n][n];
        home = new ArrayList<>();
        chicken = new ArrayList<>();

        // map 저장
        for (int i = 0; i < map.length; i++) {
            String[] numStr = br.readLine().split(" ");
            for (int j = 0; j < map.length; j++) {
                map[i][j] = Integer.parseInt(numStr[j]);
                //치킨 저장
                if (map[i][j] == 2) {
                    chicken.add(new Distance(i, j));
                }
                //집 저장
                if (map[i][j] == 1) {
                    home.add(new Distance(i, j));
                }

            }
        }
        /*
         * 1. 치킨집 뽑기
         * 2. 도시의 치킨거리 구하기
         * */
        chickenSize = chicken.size();
        combinationVisited = new boolean [chickenSize];

        //치킨 집을 뽑아보자!
        combination(0, 0);

        System.out.println(totalResult);
    }

    private static void combination(int chickenIndex, int depth) {

        if (depth == m) {
            calculateDistance();
            return;
        }
        if (chickenIndex == chickenSize) {
            return;
        }

        combination(chickenIndex+1, depth+1);
        combinationVisited[chickenIndex] = true;
        combination(chickenIndex+1, depth);
        combinationVisited[chickenIndex] = false;
    }
    //거리계산식
    private static void calculateDistance() {
        // TODO Auto-generated method stub
        int result = 0;

        for (int i = 0; i < home.size(); i++) {
            //내 집 위치
            int homeX = home.get(i).getX();
            int homeY = home.get(i).getY();

            for (int j = 0; j < chickenSize; j++) {

                if (combinationVisited[j] == false) {
                    continue;
                }
                //치킨 집 위치
                int chickenX = chicken.get(j).getX();
                int chickenY = chicken.get(j).getY();

                result += calculateAbs(homeX, homeY, chickenX, chickenY);
            }
        }

        if (totalResult >= result) {
            totalResult = result;
        }
    }

    private static int calculateAbs(int homeX, int homeY, int chickenX, int chickenY) {
        // TODO Auto-generated method stub

        return Math.abs(homeX - chickenX) + Math.abs(homeY - chickenY);
    }

}
class Distance {
    private final int x;
    private final int y;

    public Distance(int x, int y) {
        super();
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

