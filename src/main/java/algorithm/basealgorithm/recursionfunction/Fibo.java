package algorithm.basealgorithm.recursionfunction;

public class Fibo {
    public static void main(String[] args) {
        // 피보나치
        // 0 1 1 2 3 5 8 13 21 34
        // a b c

        long a, b, c;
        long arrNum[] = new long [30];

        int w = 0;
        a = 0;
        b = 1;

        arrNum[0] = a;
        arrNum[1] = b;

        while( w < 28) {
            c = a + b;
            arrNum[w+2] = c;
            a = b;
            b = c;
            w++;
        }

        for (int i = 0; i < arrNum.length; i++) {
            System.out.println("피보나치 수열 " + (i+1) + " 항 = " + arrNum[i]);
        }
    }
}
