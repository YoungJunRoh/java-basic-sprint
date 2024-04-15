package javabasic;
import java.util.Scanner;

public class example03 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isTrue = false;
        while(!isTrue) {
            System.out.print("이름을 입력해주세요 : ");
            String name = getLine();

//            String digit ="123456789";
//            for(int i = 0; i< name.length(); i++){
//                char currentChar = name.charAt(i);
//                if(digit.indexOf(currentChar) != -1){
//                    System.out.println("이름에 숫자가 포함되어있습니다.");
//                    return;
//                }
//            }

            System.out.print("나이를 입력해주세요 : ");
            String age = getLine();
//
//            for(int i = 0; i < age.length(); i++){
//                if(digit.indexOf(age.charAt(i)) ==-1){
//                    System.out.println("나이는 숫자만 입력해야합니다.");
//                    return;
//                }
//            }
            if (isValidDigitString(age) && isValidStringDigit(name)) {
                System.out.printf("이름은 %s, 나이는 %s", name, age);
                isTrue = true;
            } else {
                System.out.println("잘못 입력했습니다");
            }
        }
        scanner.close();
    }
    public static String getLine(){
        return scanner.nextLine();
    }
    public static boolean isValidDigitString(String str){ //나이에 문자가 있는지 검사하는 메소드
        String digit = "123456789"; // 룩업테이블
        for(char c : str.toCharArray()){
            if(digit.indexOf(c) == -1){
                //indexOf()는 특정문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반화 찾지 못하면 -1을 반환
                //조건식은 str의 한 문자마다 digit의 문자열 중 일치하는 인덱스를 찾는 것
                //즉 -1은 str 중 하나라도 문자가 들어간 것 -> false를 반환
                return false;
            }
        }
        return true;
    }
    public static boolean isValidStringDigit(String str){ // 이름에 숫자가 있는지 검사하는 메소드
        String digit = "123456789"; //룩업 테이블
        for(char c : str.toCharArray()){
            if(digit.indexOf(c) > -1){
                //조건식은 str의 한 문자마다 digit의 문자열 중 일치하는 인덱스를 찾는 것
                //즉 -1보다 크다는 것은 str 중 하나라도 숫자가 들어간 것 -> false를 반환
                return false;
            }
        }
        return true;
    }

}
