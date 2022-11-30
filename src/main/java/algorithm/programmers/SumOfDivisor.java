package algorithm.programmers;

public class SumOfDivisor {
    public int solution(int num) {
        int answer = 0;

        for (int i = 1; i <= num; i++) {
            if (Math.floorMod(num, i) == 0) {
                answer += 1;
            }
        }

        return answer;
    }
}
