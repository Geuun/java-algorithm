package algorithm.datastructure.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNum = 7;

        int startIdx = 0;
        int endIdx = nums.length - 1;
        int middleIdx = endIdx + startIdx / 2;
        int targetIdx = -1;

        while (startIdx <= endIdx) {
            if (nums[middleIdx] > targetNum) { // 1 - (3) - 6 --- 11
                endIdx = middleIdx - 1;
            } else if (nums[middleIdx] < targetNum) {
                startIdx = middleIdx + 1;
            } else {
                System.out.println(middleIdx);
                targetIdx = middleIdx;
                break;
            }
        }
        System.out.println(targetIdx);
    }
}
