package javabasic;
import java.util.Scanner;

public class example07 {
    public static void main(String[] args) {
        //사용자로부터 숫자를 하나 입력받아, 이 숫자가 양수인지, 음수인지, 아니면 0인지를 판단하여 출력하는 프로그램을 작성하세요.
        // 먼저 입력 받을 메소드 작성 double형을 받기
        // double형 변수 선언
        // 양수 음수 0 판단 메소드 작성
        // 결과값 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = sc.nextInt();
        isPositiveNegativeZero(num);
    }
    public static void isPositiveNegativeZero(int num) { //양수 음수 0 판단할 수 있는 메소드
        if (num < 0) { // num이 음수일 때
            System.out.println("음수 입니다.");
        } else if (num > 0) { // num 양수일 때
            System.out.println("양수 입니다.");
        } else { // num이 0일 때
            System.out.println("0 입니다.");
        }
    }
    // 입력받을 때 int형을 보장할 수 있게
//    public static int scanInt(){ // 정수를 입력받는 메소드
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextInt();
//    }
}
