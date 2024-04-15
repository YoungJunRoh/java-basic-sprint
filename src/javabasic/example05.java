package javabasic;

import java.util.Scanner;

public class example05 {
    public static void main(String[] args) {
        // 세 개의 정수에서 최대값을 구하느 방법
            // 최대값을 담을 변수 선언
            // 첫번재 입력값과 두번째 입력값을 비교해서 더 큰 값을 최대값을 담을 변수에 할당
                //두 수중 더 큰 값을 최대값을 담은 변수에 할당
        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();

        int[] numberArr = new int[3];

        for(int i =0; i< 3; i++){
            numberArr[i] = scanner.nextInt();
        }
        int maxNumber = numberArr[0], minNumber = numberArr[0];
        for(int i= 1; i < numberArr.length; i++){
//            if(numberArr[i] > maxNumber){
//                maxNumber = numberArr[i];
//            }
            maxNumber = Math.max(maxNumber, numberArr[i]);
//            if(numberArr[i] < minNumber){
//                minNumber= numberArr[i];
//            }
            minNumber = Math.min(minNumber, numberArr[i]);
        }
        System.out.printf("가장 큰 수는 %d 가장 작은 수는 %d", maxNumber, minNumber);

//        System.out.printf("가장 큰 수는 %d 가장 작은 수는 %d", maxNum(num1,num2,num3), minNum(num1,num2,num3));
    }
//    public static int maxNum(int num1, int num2, int num3){
//        int max;
//        if(num1 < num2){
//            max = num2;
//        }
//        else{
//            max = num1;
//        }
//        if(max < num3){
//            max = num3;
//        }
//        return max;
//    }
//    public static int minNum(int num1, int num2, int num3){
//       int min;
//       if(num1 < num2){
//           min = num1;
//       } else{
//           min = num2;
//       }
//       if(min > num3){
//           min = num3;
//       }
//       return min;
//    }
}
