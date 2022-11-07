package algorithm.programmers;

/**
 * 하샤드 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class HashadNum {

    public boolean solution(int x) {
        boolean answer = false;

        // 자릿수 합
        int sumOfDigit = 0;
        while (x > 0) {
            sumOfDigit += x % 10;
            x = x / 10;
        }
        System.out.println(sumOfDigit);

        // 자릿수 합으로 나누어 지는지
        if (x % sumOfDigit != 0) {
            return answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
