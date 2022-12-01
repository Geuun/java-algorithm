package algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheHallOfFame {
    static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (i >= k) {
                list.add(score[i]);
                list.sort(Collections.reverseOrder());
                answer[i] = list.get(k - 1);
            } else if (i < k) {
                list.add(score[i]);
                list.sort(Collections.reverseOrder());
                answer[i] = list.get(list.size() - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int k1 = 3;
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        System.out.println(Arrays.toString(solution(k1, score1)));
        System.out.println(Arrays.toString(solution(k2, score2)));

    }
}
