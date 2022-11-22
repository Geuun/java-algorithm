package algorithm.basealgorithm.recursionfunction;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    public static void print1To100 (int num) {
        if (num > 100) {
            return;
        }

        System.out.println(num);
        print1To100(num + 1);
    }

    public static int sumList (List<Integer> nums) {

        if(nums.isEmpty()) return 0;
        return nums.remove(nums.size() - 1) + sumList(nums);

    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(7, 3, 2, 9));
//        print1To100(1);
        System.out.println(sumList(nums));
    }
}
