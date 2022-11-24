package algorithm.codeup;

import java.util.Scanner;

public class C1861 {
    static void printNum(int num) {

        if (num == 0) { return; }
        printNum(num - 1);
        System.out.print(num + " ");
    }

    static void printTriangle(int n) {
        if (n == 0) { return; }
        printTriangle(n - 1);
        printNum(n);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printTriangle(num);
    }
}
