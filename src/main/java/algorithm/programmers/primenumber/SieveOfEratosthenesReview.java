package algorithm.programmers.primenumber;

public class SieveOfEratosthenesReview {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }// 2부터 n 까지의 수를 배열에 담기
        // [2, 3, 4, 5, 6, ..., n-1, n


        for (int i = 2; i * i < n; i++) {
            if (arr[i] == 0) continue; // 이미 0으로 바뀐 인덱스는 넘어간다.
            for (int j = i * i; j < n + 1; j += i) arr[j] = 0;
        }// 소수의 배수들을 배열에서 0으로 변경 but 이미 0이라면 continue

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) answer++;
        }// 반복문을 배열의 길이만큼 돌면서 0이 아닌 수를 answer에 카운트한다.
        
        return answer;
    }
}
