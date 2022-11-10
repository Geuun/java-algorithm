package algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 같은 숫자는 싫어
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class IHateSameNum {
    public int[] solution(int[] arr) {

        int compNum = -1; // 비교할 숫자
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != compNum) {
                nums.add(arr[i]);
                compNum = arr[i];
            }
        }

        int[] answer = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            answer[i] = nums.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        IHateSameNum iHateSameNum = new IHateSameNum();
        int[] input1 = {1, 1, 3, 3, 0, 1, 1}; // 1, 3, 0, 1
        int[] input2 = {4, 4, 4, 3, 3}; // 4, 3
        iHateSameNum.solution(input1);
        iHateSameNum.solution(input2);
    }
}
