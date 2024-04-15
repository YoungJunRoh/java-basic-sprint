package javabasic.exampleString;

public class Main {
    public static void main(String[] args) {
        String str1 = "stringbuf";
        String str2 = "str";

        System.out.println(contains(str1, str2));

    }
    public static boolean contains(String str1, String str2) {
        // 5.2 str1.length - str2.length 길이만큼 반복문 안에 str2.length 만큼 반복하는 반복문으로 이중 for문 작성
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            // 5.3 str1가 str2를 포함하고 있는지 아닌지 확인할 bool형 선언
            // 5.3.1 반복문 처음 시작할 때 마다 true로 초기화하여 확인한다
            boolean isContain = true;
            // 5.4 str1.length 만큼 반복문 안에 str2.length 만큼 반복하는 반복문으로 이중 for문 작성
            for (int j = 0; j < str2.length(); j++) {
                //5.4.1 charAt을 이용하여 같지 않은 문자 조건식 작성
                if (str1.charAt(i+j) != str2.charAt(j)) {
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
