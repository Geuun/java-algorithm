package algorithm.datastructure.quicksort;

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
        int pivot = arr[arr.length / 2]; // pivot = 40
        System.out.println("pivot: " + pivot);

        int leftIdx = 0;
        int rightIdx = arr.length;
        int temp;

        for (leftIdx = 0; leftIdx < arr.length / 2; leftIdx++) {
            if (arr[leftIdx] < pivot) leftIdx += 1;
        }
        for (rightIdx = arr.length; rightIdx > arr.length / 2; rightIdx++) {
            if (arr[rightIdx] > pivot) rightIdx -= 1;
        }
//        if (arr[leftIdx] <= rightIdx) {
//
//        }
    }
}
