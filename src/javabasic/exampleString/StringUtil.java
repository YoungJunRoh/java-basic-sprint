package javabasic.exampleString;
//StringUtil 클래스를 생성하세요.
//이 클래스는 문자열 처리와 관련된 다양한 기능을 제공하는 유틸리티 메서드를 포함할 것입니다.

import java.util.Arrays;

// reverse: 하나의 String을 매개변수로 받아 그 문자열을 뒤집은 결과를 반환합니다.
// concat: 두 개의 String을 매개변수로 받아 이를 연결한 결과를 반환합니다.
// contains: 하나의 String과 하나의 문자를 매개변수로 받아,
// 주어진 문자열이 해당 문자를 포함하는지 여부를 반환합니다.

// 0. StringUtil 클래스를 생성한다
public class StringUtil {

    // 1. reverse 메서드 작성하기
    public String reverse(String str1){
        // 1.1 길이가 str1인 배열 만들기
        char[] reverseStr = new char[str1.length()];
        // 1.2 i가 str1의 길이보다 작은 동안 반복
        for(int i = 0; i < str1.length(); i++){
            // 1.2.1 reverseStr[i]에 str1의 끝 자리부터 대입
            reverseStr[i] = str1.charAt(str1.length() -1);
        }
        // 1.3 char배열을 string을 변환해서 리턴
        return Arrays.toString(reverseStr);
    }


    // 2. 두 개의 String 변수를 연결하는 메소드
    public String concat(String str1, String str2){
        // 2.1 str1 + str2를 연결하여 리턴
        return str1 + str2;
    }

    // 3. 하나의 String과 하나의 문자를 받아서 String 안에 문자가 있는지 확인하는 것
    public boolean contains(String str1, char c){
        // 3.1 c1은 str1을 char 배열로 바꿔서 문자 하나 하나 순회해서 나오는 값이다.
        for(char c1 : str1.toCharArray()){
            // 3.1.1 c1과 입력받은 c가 값은 것이 있으면 true를 리턴
            if(c1 == c){
                return true;
            }
        }
        // 3.2 하나라도 같은 것이 없으면 false 리턴
        return false;
    }

    // 메소드 오버로딩
    // 4.concat 메서드를 오버로딩 , 세 개의 String을 모두 받아 연결
    // 4.1 concat 메서드 오버로딩
    public String concat(String str1, String str2, String str3){
        // 4.2 str1, str2, str3을 연결하여 리턴
        return str1 + str2 + str3;
    }

    // 5. contains 메서드를 오버로딩,
    // 두개의 String을 매개변수로 받아 첫 번째 문자열이 두 번째 문자열을 포함하는지
    // 5.1 contains 메서드를 오버로딩
    public static boolean contains(String str1, String str2) {
        // 5.2 str1.length - str2.length 길이만큼 반복문 안에 str2.length 만큼 반복하는 반복문으로 이중 for문 작성
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            // 5.3 str1가 str2를 포함하고 있는지 아닌지 확인할 bool형 선언
            // 5.3.1 첫번째 반복문이 시작할 때 마다 true로 초기화
            boolean isContain = true;
            // 5.4 str1.length 만큼 반복문 안에 str2.length 만큼 반복하는 반복문으로 이중 for문 작성
            for (int j = 0; j < str2.length(); j++) {
                //5.4.1 charAt을 이용하여 같지 않은 문자 조건식 작성
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    // 5.4.2 서로 같은 문자가 아니면 false로 하고 break 하여 빠져 나온다
                    isContain = false;
                    // 5.4.3 시작 문자가 같지 않으니 안쪽 반복문은 빠져 나온다
                    break;
                }
            }
            // 5.5 모든 반복문이 끝나고 isContain이 true이면 true를 리턴한다
            if(isContain){
                return true;
            }
        }
        return false;
    }
}
