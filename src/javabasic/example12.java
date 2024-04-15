package javabasic;

public class example12 {
    public static void main(String[] args) {
        //주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요.
        // 1. 정수 배열을 선언 및 초기화
        int[] numArray;
        // 1.1 선언된 정수 배열에 정수 값 넣기
        numArray = new int[]{57,78,15,34,80};
        // 2. 최댓값, 최솟값을 구하기
        // 2.1 maxNumber, minNumber 선언 및 numArray[0]을 대입
        int maxNumber = numArray[0];
        int minNumber = numArray[0];
        //2.2 maxNumber, minNumber을 구하기 위해 numArray 배열을 순회하며 비교
        for(int i = 1; i < numArray.length; i++){
            // 최댓값은 maxNumber에 저장, 최솟값은 minNumber에 저장
            maxNumber = Math.max(maxNumber, numArray[i]);
            minNumber = Math.min(minNumber, numArray[i]);
        }
        // 3. 최댓값과 최솟값을 출력하기
        System.out.println("최댓값은 " + maxNumber + " 최솟값은 " + minNumber);

    }
       public static void findMaxMinNumber(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
    }
}
