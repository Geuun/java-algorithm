package algorithm.programmers.primenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/**
 * 프로그래머스 - 소수찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12921
 * <p>
 * 1. 소수를 구하는 로직을 먼저 구현해본다.
 * - n 까지 1 증가시키면서 나누는 방식
 * - n/2까지 나누어보는 방식
 * - 루트 13까지 포함해서 나누어보는 방식
 * 2. 위 연산을 나머지 연산으로 만들고 나머지가 0이나오면 false
 */
public class PrimeNumber {

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean isPrimeSplitinHalf(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean isPrimeSplitinRoot(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }// 2부터 n 까지의 수를 배열에 담기
        for (int i = 2; i * i < n; i++) {
            if (arr[i] == 0) continue; // 이미 0으로 바뀐 인덱스는 넘어간다.
            for (int j= i * i ; j<n+1; j+=i) arr[j] = 0;
        }// 소수의 배수들을 배열에서 0으로 변경 but 이미 0이라면 continue한다.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) answer++;
        }// 반복문을 배열의 길이만큼 돌면서 0이 아닌 수를 answer에 카운트한다.

        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        n = 50;
        List<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= n; i++) arr.add(i);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0 && arr.get(i) > 2) arr.remove(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();


    }
}
