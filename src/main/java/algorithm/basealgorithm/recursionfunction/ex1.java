package algorithm.basealgorithm.recursionfunction;

public class ex1 {
    public void print1To100 (int num) {
        if (num > 100) {
            return;
        }

        System.out.println(num);
        print1To100(num + 1);
    }

    public static void main(String[] args) {
        ex1 ex = new ex1();
        ex.print1To100(1);
    }
}
