package algorithm.basealgorithm.dynamic;

public class Fibonacci {


    static long fibo(int n) {
        long[] arr = new long[n + 1];

        if (n == 1 || n == 2) return 1;

        if (arr[n] != 0) return arr[n];


        arr[n] = fibo(n - 1) + fibo(n - 2);

        return arr[n];
    }

    public static void main(String[] args) {
        int n = 5;

        var r = fibo(n);  // 5 --> 0, 1, 2, 3, 4

        System.out.println(r);

    }
}
