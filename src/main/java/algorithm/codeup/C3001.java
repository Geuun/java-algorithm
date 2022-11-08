package algorithm.codeup;

import java.util.Scanner;

public class C3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input1 = sc.next();
//        String input2 = sc.next();
//        String input3 = sc.next();

//        String [] input2Arr = input2.split(" ");

        int input1 = sc.nextInt();


        int[] arr= new int[input1];
        for(int i =0;i<input1;i++){
            arr[i] = sc.nextInt();
        }

        int input3 = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input3) System.out.println(i + 1);
            else System.out.println(-1);
        }


    }
}
