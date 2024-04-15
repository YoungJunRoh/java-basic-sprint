package javabasic;

import java.util.Scanner;

public class example06 {
    public static void main(String[] args) {
        //Scanner 생성
        //boolean형 2개 생성
        //And, Or , 부정 연산 메소드 생성
        //출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("False는 거짓 True는 참입니다 둘 중 하나를 b1의 값을 입력해주세요 : ");
        boolean b1 = scanner.nextBoolean();
        System.out.print("False는 거짓 True는 참입니다 둘 중 하나를 b2의 값을 입력해주세요 : ");
        boolean b2 = scanner.nextBoolean();

        System.out.println(operateAnd(b1,b2));
        System.out.println(operateOr(b1,b2));
        System.out.println("NOT 연산 : b1의 값은 " + operateNot(b1) + " b2의 값은 "+  operateNot(b2));

        scanner.close();
    }
    public static boolean operateAnd(boolean b1, boolean b2){
        return b1 && b2;
    }
    public static boolean operateOr(boolean b1, boolean b2){
        return b1 || b2;
    }
    public static boolean operateNot(boolean b1){
        return !b1;
    }
}
