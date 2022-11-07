package algorithm.programmers;

public class HashadNum {

    public boolean solution(int x) {

        // 자릿수 합
        int sumOfDigit = 0;
        while (x > 0) {
            sumOfDigit += x % 10;
            x = x / 10;
        }
        System.out.println(sumOfDigit);

        // 자릿수 합으로 나누어 지는지
        return false;
    }

    public static void main(String[] args) {
        
    }
}
