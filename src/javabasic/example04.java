package javabasic;

import java.util.Scanner;

public class example04 {
    public static void main(String[] args) {
        // 1.Scanner 선언
        // 2.입력 double 형으로 2개 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력해주세요 : ");
        double dNum1 = sc.nextDouble();
        System.out.print("두 번째 숫자를 입력해주세요 : ");
        double dNum2 = sc.nextDouble();
        // 3. +,-,*,/,% 메소드 사용
        // 4. 연산 결과를 출력 ( 0으로 나눈 것과 나머지는 구할 수 없다는 예외 처리)

        // + 연산 값 출력
        System.out.println(sum(dNum1, dNum2));
        // - 연산 값 출력
        System.out.println(sub(dNum1, dNum2));
        // * 연산 값 출력
        System.out.println(multiple(dNum1, dNum2));
        // /, % 연산 값을 출력
        // 0으로 나눈 것과 나머지는 구할 수 없다는 예외 처리
        if (dNum2 == 0) {
            System.out.println("0으로는 나눌 수 없습니다");
            System.out.println("0으로 나눈 것에 나머지를 구할 수 없습니다.");
        } else {
            System.out.println(divide(dNum1, dNum2));
            System.out.println(quotient(dNum1, dNum2));
        }
        sc.close();
    }

//    public static Double scanDouble(){
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextDouble();
//    }


    // +,-,*,/,% 연산을 메소드로 구현하기
    // + 연산 값 리턴
    public static double sum(double dNum1, double dNum2){
        return dNum1 + dNum2;
    }
    // - 연산 값 리턴
    public static double sub(double dNum1, double dNum2){
        return dNum1 - dNum2;
    }
    // * 연산 값 리턴
    public static double multiple(double dNum1, double dNum2){
        return dNum1 * dNum2;
    }
    // / 연산 값 리턴
    public static double divide(double dNum1, double dNum2){
        return dNum1 / dNum2;
    }
    // % 연산 값 리턴
    public static double quotient(double dNum1, double dNum2){
        return dNum1 % dNum2;
    }
}
