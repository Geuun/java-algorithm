package algorithm.basealgorithm.dynamic;

public class Fibonacci {


    static long fibo(int n) {
        long[] arr = new long[n + 1];

        if (n == 1 || n == 2) return 1;

        if (arr[n] != 0) return arr[n];

        arr[n] = fibo(n - 1) + fibo(n - 2);

        return arr[n];
    }

    static long fiboDP(int n) {
        long[] arr = new long[n + 1];

        arr[1] = 1; // idx = 0
        arr[2] = 1; // idx = 1

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static void main(String[] args) {
        int n = 5; // arr.lengh = 6

        var r = fibo(n);  // 5 ->> arr[5] --> [1, 1, 2, 3, 4, 5]
        var r1 = fiboDP(n);

        System.out.println(r);
        System.out.println(r1);
    }
}