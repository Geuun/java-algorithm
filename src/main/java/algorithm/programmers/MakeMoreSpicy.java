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

            heap.add(minScoville1 + (minScoville2 * 2));
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
    }
}