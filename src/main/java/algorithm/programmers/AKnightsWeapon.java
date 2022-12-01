package algorithm.programmers;

public class AKnightsWeapon {
    static int numOfDivisor(int input) {                    // 약수 구하는 알고리즘
        int count = 0;

        for (int i = 1; i * i <= input; i++) {
            if (i * i == input) count += 1;                 // 제곱근 count +1
            else if (input % i == 0) count +=2;             // 약수라면 짝인 수까지 count +2
        }
        return count;
    }

    static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int num = numOfDivisor(i);
            if (num > limit) {
                answer += power;
            } else {
                answer += num;
            }
        }
        return answer;
    }
}
