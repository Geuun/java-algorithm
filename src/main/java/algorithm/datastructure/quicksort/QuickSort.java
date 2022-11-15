package algorithm.datastructure.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
        return answer;
    }
    public List<Integer> sort(List<Integer> arr) {

        if (arr.size() <= 1) return arr; // => 재귀 탈출 조건

        /**
         * 1. 기준 값 뽑는 로직 구현
         * 2. 기준 값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
         */

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        int pivot = arr.get(arr.size() / 2); // 5

        for (int i = 0; i < arr.size()  ; i++) {
            if (pivot > arr.get(i)) left.add(arr.get(i));
            else if (pivot < arr.get(i)) right.add(arr.get(i));
        }

        System.out.println(left);
        System.out.println(right);
        System.out.println(mid);

        return merge(sort(left), sort(mid), sort(right));
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        var arr = new int[] {20, 18, 5, 19, 5, 25, 40, 50};

        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        qs.sort(al);
        System.out.println(Arrays.toString(arr));
    }
}
