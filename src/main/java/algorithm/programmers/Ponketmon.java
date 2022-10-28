package algorithm.programmers;

import java.util.*;

/**
 * 1. 폰켓몬 종류를 구하기 위해서 set으로 중복 제거하기
 * 2. 중복이 없는 set의 크기와 가져갈 수 있는 폰켓몬의 수를 비교한다.
 * 3. 가져갈 수 있는 폰켓몬의 수 구하기 == pickedNum
 * 4. set의 크기가 더 작은 경우에는 set.size()를 반환하고 나머지는 pickedNum을 반환한다
 */

public class Ponketmon {
    public int solution(int[] nums) {
        int answer = 0;
        int pickedNum = nums.length / 2;
        Set<Integer> set = new LinkedHashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        if(pickedNum >= set.size()) answer = set.size();
        else answer = pickedNum;

        return answer;
    }

//    public int solutionSet(int[] nums) {
//        int answer = 0;
//
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//
//        int N = nums.length / 2;
//
//        if (set.size() < N) {
//            return set.size();
//        } else {
//            return N;
//        }
//    }
}
