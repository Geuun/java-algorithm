package algorithm.basealgorithm.dynamic;

import java.util.Arrays;

public class LCS {

    public static void main(String[] args) {
        String a = "ABCDCBA"; // 7 -> 안쪽 loop
        String b = "DCABDC"; // 6 ->

        int aLength = a.length();
        int bLength = b.length();

        char[]aArr = new char[aLength + 2]; // length + 1 + 1 => 마진 설정 때문에 1을 더 더해줌
        char[]bArr = new char[bLength + 2];

        int[][] lcsArr = new int[aArr.length][bArr.length]; //[a] x [b] 2차원배열 생성

        /**
         * lcsArr[aArr][bArr]
         * - - A B C D C B A
         * - 0 0 0 0 0 0 0 0
         * D 0 0 0 0 1 1 1 1
         * C 0 0 0 1 2 2 2 2
         * A 0 1 1 1 2 2 2 3
         * B 0 1 2 2 2 2 3 3
         * D 0 1 2 2 3 3 3 3
         * C 0 1 2 3 3 4 4 4
         */

        for (int i = 0; i < aArr.length ; i++) { // aArr 반복
            for (int j = 0; j < bArr.length ; j++) { // bArr 반복
                if (i == 0 || j == 0) lcsArr[i][j] = 0; // 마진 설정
                else if (aArr[i] == bArr[j]) lcsArr[i][j] = lcsArr[i - 1][j - 1] + 1; // i * j 의 문자가 같은지 확인하고 같다면 + 1
                else lcsArr[i][j] = Math.max(lcsArr[i - 1][j], lcsArr[i][j - 1]); // 같지 않을 때 둘 중 큰값이 들어가게
            }
        }
    }
}
