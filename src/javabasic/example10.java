package javabasic;

public class example10 {
    public static void main(String[] args) {
        //10개의 정수 값을 저장할 수 있는 배열을 생성하고, 1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
        // 1. 배열 길이가 10인 int형 배열 선언 및 초기화
        int[] numArray = new int[10];
        // 2. 배열 값을 1부터 10까지의 값을 저장
        for(int i = 0; i < 10; i++){
            numArray[i] = i+1;
        // 3. 저장된 배열값을 출력
            System.out.print(numArray[i] + " ");
        }
    }
}
