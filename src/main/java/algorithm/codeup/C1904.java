package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1904 {

    static void pritnOddNum(int x, int y) {

        // 나눗셈 연산 2, 7
        if (x > y) { return; }
        if (x % 2 != 0) {
            System.out.printf("%d ", x);
        }
        pritnOddNum(x + 1, y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        pritnOddNum(x, y);
    }
}
