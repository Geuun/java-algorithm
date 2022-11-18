package algorithm.programmers;


/**
 * 시저암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 */
public class CaesarCipher {

    public String solution(String s, int n) {
        String answer = "";

        char[] chs = s.toCharArray();
        // 아스키코드
        for (char ch : chs) {
            if (ch != 32) { //아스키코드 32번 공백
                if(ch == 90 || ch == 122) { // 90:Z -> 65:A 122:z -> 97:a
                    ch -= 26;
                }
                ch += n;
                answer += ch;
            } else answer += " ";
        }


        return answer;
    }

    public static void main(String[] args) {

    }

}
