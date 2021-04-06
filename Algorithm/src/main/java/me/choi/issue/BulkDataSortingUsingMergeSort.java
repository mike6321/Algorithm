package me.choi.issue;

import java.util.ArrayList;
import java.util.Random;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : MergeSort를 이용한 정렬
 * 소요시간 : 8376
 * Time : 11:44 오후
 */
public class BulkDataSortingUsingMergeSort {

    private static ArrayList<Integer> cache = new ArrayList<>();

    static {
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            cache.add(random.nextInt(10000000));
        }
    }

    public static void main(String[] llgs) {
        long start = System.currentTimeMillis();
        MergeSort(cache);
        long end = System.currentTimeMillis() - start;

        for (int i = 0; i < 100; i++) {
            System.out.print(cache.get(i) + " ");
        }
        System.out.println();

        System.out.println("소요시간 : " + (end));
    }

    public static ArrayList<Integer> MergeSort(ArrayList<Integer> m) {
        if(m.size()<=1) return m; //종료조건

        //반복조건
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right= new ArrayList<>();
        int mid = m.size()/2;  //중간인덱스 찾기

        for(int i=0;i<mid;i++) {
            left.add(m.get(i));
        }

        for(int i=mid;i<m.size();i++) {
            right.add(m.get(i));
        }

        left = MergeSort(left);
        right = MergeSort(right);

        return merge(left,right);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer>left, ArrayList<Integer>right){
        ArrayList<Integer> rst=new ArrayList<Integer>(left.size()+right.size()); //두개를 합친 큰 리스트
        int l=0, r=0;

        while(l<left.size() && r<right.size()) { //둘다 원소가 있는 경우
            if(left.get(l) < right.get(r)) {
                rst.add(left.get(l++));
            } else {
                rst.add(right.get(r++));
            }
        }

        while(l<left.size()) { //왼쪽만 남아있는 경우
            rst.add(left.get(l++));
        }

        while(r<right.size()) { //오른쪽만 남아있는 경우
            rst.add(right.get(r++));
        }

        return rst;
    }
}
