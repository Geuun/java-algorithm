package algorithm.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Hash 사용해서 같은 문자열을 포함하고 있는지 확인하기.
 * 1.Hashset 선언
 * 2.이중 for문을 통해 첫번째는 배열의 길이만큼
 * 3.두번째는 전화번호의 길이만큼 반복
 * 4. 문자열 길이만큼 반복할 때 마다 해시에 포함하고 있는지 찾아내기
 */
public class PhoneNumList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Set<String> set = new HashSet<>(Arrays.asList(phone_book));

        for (int i = 0; i < set.size(); i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if(set.contains(phone_book[i].substring(0,j))) {
                    return false;
                }
            }
        }

        return answer;
    }


//    public static void main(String[] args) {
//        PhoneNumList phoneNumList = new PhoneNumList();
//
//        String[] phoneBook = {"119", "97674223", "1195524421"};
//        System.out.println(Arrays.toString(phoneBook));
//
//        Arrays.sort(phoneBook);
//        System.out.println(Arrays.toString(phoneBook));
//    }
}
