package algorithm.basealgorithm.datastructure.quicksort;

import java.util.Arrays;

/**
 * 1.pivot을 정한다
 * 2.pivot보다 arr[left]가 작으면 leftIdx += 1
 * 3.pivot보다 arr[right]가 크면 rightIdx -=1
 * 4.leftIdx <= rightIdx 면 교환
 * 5. 교환 했으면 leftIdx += 1, rightIdx -= 1
 */
public class QuickSortArray {
    static void swap(int[] arr, int leftIdx, int rightIdx) {
        int temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
    }

    public int[] quickSortArray(int[] arr, int startIdx, int endIdx) {
        int leftIdx = startIdx;
        int rightIdx = endIdx;
        int pivotIdx = (startIdx + endIdx) / 2;
        int pivot = arr[pivotIdx];


        do {
            while (arr[leftIdx] < pivot) leftIdx++; // arr[leftIdx] 값이 pivot 보다 큰 수 가 나올 때 까지 Idx 증가
            while (arr[rightIdx] > pivot) rightIdx--;// arr[rightIdx] 값이 pivot 보다 작은 수 가 나올 때 까지 Idx 감소

            if (leftIdx <= rightIdx) { // leftIdx 보다 right가 크면 교환하기
                swap(arr, leftIdx++, rightIdx--);
            }
        } while (leftIdx <= rightIdx);

        // 재귀 호출
        if(startIdx < rightIdx) quickSortArray(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) quickSortArray(arr, leftIdx, endIdx);

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};

        QuickSortArray quickSortArray = new QuickSortArray();
        var result = quickSortArray.quickSortArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(result));
    }
}
