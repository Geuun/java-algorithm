package algorithm.programmers;

/**
 * 프로그래머스 - 소수찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12921
 *
 * 1. 소수를 구하는 로직을 먼저 구현해본다.
 *  - n 까지 1 증가시키면서 나누는 방식
 *  - n/2까지 나누어보는 방식
 *  - 루트 13까지 포함해서 나누어보는 방식
 * 2. 위 연산을 나머지 연산으로 만들고 나머지가 0이나오면 false
 */
public class PrimeNumber {

    public int solution(int n) {
        int answer = 0;
        return answer;
    }

    public boolean isPrime (int n) {
        for (int i=2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public boolean isPrimeSplitinHalf (int n) {
        for (int i=2; i < n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();

        System.out.println(primeNumber.isPrime(13));
        System.out.println(primeNumber.isPrime(17));
        System.out.println(primeNumber.isPrime(19));
        System.out.println(primeNumber.isPrime(23));

        System.out.println(primeNumber.isPrimeSplitinHalf(13));
    }
}
