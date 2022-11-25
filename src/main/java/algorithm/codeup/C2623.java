package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2623 {
    static int gcd(int x, int y) {
        if (y == 0) { return x; }

        if (x > y) {
            return gcd(y, x % y);
        } else {
            return gcd(x, y % x);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        System.out.println(gcd(x, y));
    }
}
