package javabasic;

import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {
        //사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음, 평균 점수를 계산하여 출력하세요.
        // 1. 5명의 학생의 점수를 입력 받기
        // 1-1. Scanner 사용
        Scanner sc = new Scanner(System.in);
        // 1-2. 5명의 학생 점수를 입력받을 배열 선언 및 초기화
        int[] scores = new int[5];
        // 1-3. 점수를 입력받기
        for(int i = 0; i < scores.length; i++){ // 향상된 for문은 인덱스를 사용할 때 사용할 수 없다
            scores[i] = sc.nextInt();
            sc.nextLine();
        }
        // 2. 5명의 점수를 평균 계산 (메소드로 만들기)
        // 3. 평균값을 출력하기
        System.out.println("학생들의 평균 점수는 : " + avgScores(scores));
        // 4. Scanner 종료
        sc.close();
    }
    public static int avgScores(int[] scores){
        // 2-1. 리턴할 평균 변수 선언과 학생들의 점수의 합 변수 선언
        int avg = 0;
        int sum = 0;
        // 2-2. 반복문으로 학생들의 총 점수 구하기
        for (int score : scores) {
            sum += score;
        }
        // 2-3. 총 점수 / scores길이 를 연산하여 avg 값 구하기
        avg = sum / scores.length;
        return avg;
    }

}
