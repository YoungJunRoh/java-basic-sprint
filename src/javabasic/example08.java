package javabasic;

public class example08 {
    public static void main(String[] args) {
        //1부터 100까지의 정수 중에서 짝수만 출력하는 프로그램을 작성하세요.
        // 짝수인지 아닌지 판단하는 메소드를 작성
        // 반복문을 통해 isEven이 true인 것에 값만 출력
        for(int i = 1; i <= 100; i++){
            if(isEven(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isEven(int num){ // 짝수인지 아닌지 판단하는 메소드
        return num % 2 == 0;
    }
}
