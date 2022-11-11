package algorithm.programmers;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * 비밀지도
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681
 * 1. 10진수를 2진수로 변환
 * 2.
 */
public class SecretMap {
    String getBinaryString(int decNum) {
        String answer = "";
        while (decNum > 0) {
            answer += decNum % 2;
            decNum /= 2;
        }
        return answer;
    }


    String solution1(int n, int[] arr1, int[] arr2) {
        String answer = "";
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];

        for (int i = 0; i < n; i++) {
            // arr1
            for (int j = 0; j < n; j++) {
                String binStr1 = getBinaryString(arr1[i]);
                String binStr2 = getBinaryString(arr2[i]);
                sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;
                sArr2[i] = "0".repeat(n - binStr2.length()) + getBinaryString(arr2[i]);
            }
        }
        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));

        return answer;
    }

    String solution2(int n, int[] arr1, int[] arr2) {
        String answer = "";
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];
        for (int i = 0; i < n; i++) {
            // arr1
            int move1 = (int) (n-1 - Math.floor(Math.log(arr1[i])/Math.log(2)));
            int move2 = (int) (n-1 - Math.floor(Math.log(arr2[i])/Math.log(2)));
            String binStr1 = getBinaryString(arr1[i]<<move1);
            String binStr2 = getBinaryString(arr2[i]<<move2);
            sArr1[i] = binStr1;
            sArr2[i] = binStr2;
        }
        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));

        return answer;
    }

    String[] solution3(int n, int[] arr1, int[] arr2) {
        var answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1","#").replace("0", " ");
            // 자릿수 맞춰주는 연산
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();

        int[] arr1 = new int[]{9,20,28,18,11};
        int[] arr2 = new int[]{30,1,21,17,28};

        System.out.println(secretMap.solution1(5, arr1, arr2));
        System.out.println(secretMap.solution2(5, arr1, arr2));
        System.out.println(Arrays.toString(secretMap.solution3(5, arr1, arr2)));
    }
}
