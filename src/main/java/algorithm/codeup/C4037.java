package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C4037 {

    static void primeFactorization(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.printf("%d ", i);
                n /= i;
            }
        }
        if (n != 1) System.out.printf("%d", n);
    }

    static void findPrimeFactor(int n) {
        for(int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d", i);
                findPrimeFactor(n / i);
                break;
            }
        }
        if (n != 1) System.out.printf("%d", n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int n = Integer.parseInt(input[0]);

        System.out.println("print primeFactorization(n):");
        primeFactorization(n);
        System.out.println();
        System.out.println("print findPrimeFactor(n):");
        findPrimeFactor(n);
    }
}
