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
            if (ch == 32) { //아스키코드 32번 공백
                answer += " "; // 32번이면 공백추가
            } else {
                if (ch <= 90) {
                    ch += n;
                    if (ch > 90) ch -= 26; //90:Z -> 65:A
                } else {
                    ch += n;
                    if (ch > 122) ch -= 26; //122:z -> 97:a
                }
                answer += ch;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher cp = new CaesarCipher();
        String s1 = "AB";
        String s2 = "z";
        String s3 = "a B z";

        System.out.println(cp.solution(s1, 1));
        System.out.println(cp.solution(s2, 1));
        System.out.println(cp.solution(s3, 4));
    }
}
