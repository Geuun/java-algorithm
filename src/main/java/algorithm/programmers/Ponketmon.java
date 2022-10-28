package algorithm.programmers;

import java.util.*;

public class Ponketmon {
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
}
