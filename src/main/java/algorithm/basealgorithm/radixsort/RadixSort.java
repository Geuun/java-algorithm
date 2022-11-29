package algorithm.basealgorithm.radixsort;

import java.util.*;

public class RadixSort {
    static int[] radixSort(int[] arr) {
        // Queue 10개 생성
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }
        // 일의 자리가 맞는 곳에 넣는다
        for (var i : arr) {
            queueArr[i % 10].add(i); // i % 10해서 일의 자리를 구함
        }

        // 꺼내서 arr에 다시 넣는다
        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) {
            while(!queueArr[i].isEmpty()){
                arr[idx++] = queueArr[i].poll();
            }
        }

        return arr;
    }

    static int[] getDigits(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // 중복제거 하여 자릿수 구하기
            if (arr[i] == 0) set.add(1);
            else set.add((int)(Math.log10(arr[i])+1));
        }

        // 중복 제거된 자릿수를 arr에 담기
        int[] answer = new int[set.size()];
        int idx = 0;
        for (Integer num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer); //정렬
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 18, 13, 1, 7, 16, 7, 0, 14};
//        String result = Arrays.toString(radixSort(arr));
        String result = Arrays.toString(getDigits(arr));
        System.out.println(result);
    }
}
