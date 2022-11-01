package algorithm.programmers;

public class PrimeNumber {

    public boolean isPrime (int n) {
        for (int i=2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();

        System.out.println(primeNumber.isPrime(13));
        System.out.println(primeNumber.isPrime(17));
        System.out.println(primeNumber.isPrime(19));
        System.out.println(primeNumber.isPrime(23));
    }
}
