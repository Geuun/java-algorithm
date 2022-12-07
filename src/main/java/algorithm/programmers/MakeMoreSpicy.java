package algorithm.programmers;

import java.util.PriorityQueue;

public class MakeMoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        // 오름차
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            heap.add(scoville[i]);
        }

        while (heap.peek() < K) {
            // 제일 작은 값 1 2 꺼내기
            int minScoville1 = heap.poll();
            int minScoville2 = heap.poll();

            heap.add(minScoville1 + minScoville2 * 2);
            answer++;

            // Limit K
            if (heap.peek() >= K) {
                break;
            }

            if (heap.peek() < K && heap.size() == 1) {
                answer = -1;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        MakeMoreSpicy makeMoreSpicy = new MakeMoreSpicy();
        //5 -> 11 (2)
        System.out.println(makeMoreSpicy.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
        // (0)
        System.out.println(makeMoreSpicy.solution(new int[]{7, 7, 7, 7, 7, 7, 7}, 7));
        // 5-> 9-> 17 (-1)
        System.out.println(makeMoreSpicy.solution(new int[]{1, 2, 2, 4}, 28));
        // 3-> 5-> 9-> 13 (4)
        System.out.println(makeMoreSpicy.solution(new int[]{1, 2, 1, 7, 5, 6, 1, 2}, 11));
        // 0
        System.out.println(makeMoreSpicy.solution(new int[]{7}, 7));
        // -1
        System.out.println(makeMoreSpicy.solution(new int[]{1}, 7));
        // -1
        System.out.println(makeMoreSpicy.solution(new int[]{}, 7));
        //3->5->7: 3번
        System.out.println(makeMoreSpicy.solution(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}, 7));
    }
}