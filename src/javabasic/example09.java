package javabasic;

import java.util.Scanner;

public class example09 {
    public static void main(String[] args) {
        //사용자로부터 숫자 n을 입력받아, 1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요.
        // 숫자 n을 입력받는 메소드를 작성하기
        // 1부터 n까지를 반복문을 메소드로 작성
        // n이 1보다 큰 값인지 확인
        // sum 변수를 선언하여 계속하여 값 더해가기
        // sum값을 리턴
        // 계산 끝난 sum을 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = sc.nextInt();
        if(isPositive(num)){ // 1보다 클 때 sum 메소드를 실행
            System.out.println("1부터 n까지의 합 : " + sum(num));
        }
        else{ // n이 1보다 적을 때 계산 하지 않고 경고 문 출력
            System.out.println("n은 1보다 커야합니다.");
        }

    }
    // n이 큰 값인지를 확인하는 메소드
    public static boolean isPositive(int num) {
        return num > 1;
    }

    // 1부터 n까지의 합 메소드
    public static int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;

        }
        return sum;
    }
}
