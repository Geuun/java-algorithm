package algorithm.programmers;

import java.util.Arrays;

/**
 * 나누어 떨어지는 숫자 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
public class aDivisiveNumber {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int[] answer = new int[arr.length];
        int divisor = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) answer[i] = arr[i];
        }
        System.out.println(Arrays.toString(answer));
        // [5, 0, 0, 10]
    }
}
