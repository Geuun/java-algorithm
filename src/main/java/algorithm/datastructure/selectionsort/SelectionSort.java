package algorithm.datastructure.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public int[] SelectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
//            System.out.println("minIndx: " + minIdx);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
        return nums;
    }

    public int[] SelectionSortDesc(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] nums = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        System.out.println(Arrays.toString(selectionSort.SelectionSort(nums)));
        System.out.println(Arrays.toString(selectionSort.SelectionSortDesc(nums)));
    }
}
