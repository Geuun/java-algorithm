package algorithm.programmers.primenumber;

import java.util.Arrays;
import java.util.Enumeration;

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
            arr[i] = i; // 2부터 n 까지의 수를 배열에 담기
        }

        for (int i = 2; i * i < n; i++) {
//            System.out.println("i: "+ i);
            if (arr[i] == 0) continue;
            for (int j = 2 * i; j <= n; j += i) {
//                System.out.println("j: " + j);
                arr[j] = 0;
//                System.out.println("arr: " + Arrays.toString(arr));
            }
        }

//        System.out.println("arr: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) answer++;
        }
//        System.out.println("result: " +answer);
        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();

        primeNumber.solution(5);
        System.out.println("========================");
        primeNumber.solution(10);
        System.out.println("========================");
        primeNumber.solution(21);
    }
}
