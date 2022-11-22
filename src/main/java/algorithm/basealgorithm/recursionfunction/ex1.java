package algorithm.basealgorithm.recursionfunction;

public class ex1 {
    public void print1To100 (int n) {
        System.out.println(n);
        print1To100(n);
    }

    public static void main(String[] args) {
        ex1 ex = new ex1();
        ex.print1To100(1);
    }
}
