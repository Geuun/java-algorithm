package algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. 메소드 설계 -> int[]를 받아서 int[]를 리턴하는 method
 * 2. 각 수포자가 찍는 번호의 반복을 배열에 저장
 * 3. 가장 많이 맞춘 사람을 저장할 score 배열 선언
 * 4. 반복문을 통해서 각 수포자의 정답이 맞는지 체크하고 맞다면 각 정답 배열 인덱스에 +1
 * 5. 최대점수 maxScore 구하기
 * 6. 최대점수를 가지는 수포자의 명단 list
 * 7. answers 에 담아서 출력
 */
public class PracticeTest {
    public int[] solution(int[] answers) {

        //2.
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        //3.
        int[] score = {0, 0, 0};

        //4.
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % supo1.length]) {
                score[0]++;
            }
            if (answers[i] == supo2[i % supo2.length]) {
                score[1]++;
            }
            if (answers[i] == supo3[i % supo3.length]) {
                score[2]++;
            }
        }

        //5.
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        //6.
        List<Integer> list = new ArrayList<>();
        if (maxScore == score[0]) {
            list.add(1);
        }
        if (maxScore == score[1]) {
            list.add(2);
        }
        if (maxScore == score[2]) {
            list.add(3);
        }

        //7.
        answers = new int[list.size()];

        for (int i = 0; i < answers.length; i++) {
            answers[i] = list.get(i);
        }

        return answers;
    }
}
