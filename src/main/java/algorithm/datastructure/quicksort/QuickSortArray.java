package algorithm.datastructure.quicksort;

import java.util.Arrays;

/**
 * 1.pivot을 정한다
 * 2.pivot보다 arr[left]가 작으면 leftIdx += 1
 * 3.pivot보다 arr[right]가 크면 rightIdx -=1
 * 4.leftIdx <= rightIdx 면 교환
 * 5. 교환 했으면 leftIdx += 1, rightIdx -= 1
 */
public class QuickSortArray {
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5,25};
        int pivotIdx = arr.length / 2;
        int pivot = arr[arr.length / 2]; // pivot = 40
        System.out.println("pivot: " + pivot);
        System.out.println("pivotIdx: " + pivotIdx);

        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        int temp;

        while (arr[leftIdx] < pivot) leftIdx += 1;
        while (arr[rightIdx] > pivot) rightIdx -= 1;

        temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
        leftIdx += 1;
        rightIdx += 1;
        System.out.printf("4:%d 7:%d\n", arr[4], arr[7]);
        System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx);
    }
}
