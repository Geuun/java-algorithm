package algorithm.datastructure.selectionsort;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

interface SortStrategy {
    boolean compare(int a, int b);
}

public class SelectionSort {
    public int[] SelectionSort(int[] nums, SortStrategy sortHow) {
        for (int i = 0; i < nums.length - 1; i++) {
            int Idx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (sortHow.compare(nums[Idx], nums[j])) {
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

    public int[] Advence(int[] nums, BiFunction<Integer, Integer, Boolean> sortHow) {
        for (int i = 0; i < nums.length - 1; i++) {
            int Idx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (sortHow.apply(nums[Idx], nums[j])) {
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

        /**
         * Function<T, R> 인터페이스
         * T : 입력타입
         * R : 리턴타입
         * 아래 코드는 Integer 배열을 받아서 True 또는 False(Boolean)를 리턴
         */
        Function<Integer[], Boolean> fn = (nums1) -> nums1[0] > nums1[1];
        System.out.println(fn.apply(new Integer[]{10, 20}));

        /**
         * BiFunction<T, T, R> 인터페이스
         * 앞에 두개 타입을 Integer a, Integer b로 받아서 True or False로 리턴
         * BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
         */

        /**
         * Predicate<T, T> 인터페이스
         * True False를 리턴하는 인터페이스
         * BiPredicate<Integer, Integer> bp = (a, b) -> a > b;
         */
    }
}
