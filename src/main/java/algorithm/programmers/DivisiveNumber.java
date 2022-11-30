package algorithm.programmers;

import java.util.*;

/**
 * 나누어 떨어지는 숫자 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
public class DivisiveNumber {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {

        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        int[] answer = new int[list.size()];
        int idx = 0;
        while(!list.isEmpty()){
            answer[idx++] = list.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        List<Integer> answer = new ArrayList<>();
        int divisor = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) answer.add(arr[i]);
        }

        Arrays.sort(answer.toArray());

        System.out.println(answer);
    }
}
