package algorithm.datastructure.selectionsort;

import java.util.Arrays;

interface StatementStrategy {
    boolean apply(int a, int b);
}

public class SelectionSort {
    public int[] SelectionSort(int[] nums, StatementStrategy stmt) {
        for (int i = 0; i < nums.length - 1; i++) {
            int Idx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (stmt.apply(nums[Idx], nums[j])) {
                    Idx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[Idx];
            nums[Idx] = temp;
            System.out.println(Arrays.toString(nums));
        }
        return nums;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] nums = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        selectionSort.SelectionSort(nums, (a, b) -> a > b);
        selectionSort.SelectionSort(nums, (a, b) -> a < b);
    }
}
