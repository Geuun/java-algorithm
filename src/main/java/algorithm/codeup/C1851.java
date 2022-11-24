package algorithm.codeup;

import java.util.Scanner;

public class C1851 {
    // 하향식
    public static void printStar(int num) {

        if (num <= 0) { return; }
        System.out.printf("*");;
        printStar(num - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printStar(num);
    }
}
