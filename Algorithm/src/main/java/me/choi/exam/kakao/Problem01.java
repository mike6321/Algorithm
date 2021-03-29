package me.choi.exam.kakao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 카카오 문제 1번
 * Time : 10:15 오후
 */
public class Problem01 {
    public static void main(String[] args) throws IOException {

        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList(new String[]{"item2", "10", "15"}));
        items.add(Arrays.asList(new String[]{"item1", "3", "4"}));
        items.add(Arrays.asList(new String[]{"item3", "17", "8"}));

        int orderBy = 1;

        int orderDirection = 0;

        int pageSize = 2;

        int pageNumber = 1;
        List<String> solution = Problem01.solution(items, orderBy, orderDirection, pageSize, pageNumber);
//        System.out.println(solution);

    }

    public static List<String> solution(List<List<String>> items, int orderBy, int orderDirection, int pageSize, int pageNumber) {

        List<Target> targetList = new ArrayList<>();
        // Write your code here
        for (int i = 0; i < items.size(); i++) {
            List<String> target = items.get(i);

            insertList(targetList, i, target, orderBy);
        }
        List<Target> sortList;
        if (orderDirection == 0) {
            sortList = targetList.stream().sorted(Comparator.comparing(Target::getName)).collect(Collectors.toList());
        } else {
            sortList = targetList.stream().sorted(Comparator.comparing(Target::getName).reversed()).collect(Collectors.toList());
        }

        pageNumber++;

        List<String> result = new ArrayList<>();

        for (int i = pageNumber * pageSize  + 1; i <= (pageNumber + 1) * pageSize; i++) {
            result.add(sortList.get(i).getName());
        }

        for (String s : result) {
            System.out.println(s);
        }



        return result;

    }

    private static void insertList(List<Target> targetList, int i, List<String> target, int j) {
        targetList.add(new Target(target.get(0), i));
    }
}
class Target {
    private final String name;
    private final int index;

    public Target(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
