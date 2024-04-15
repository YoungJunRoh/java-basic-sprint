package javabasic;

public class example02 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        System.out.printf("%d\n", sum(num1 ,num2));
        System.out.printf("%d\n",  sub(num1 ,num2));
        System.out.printf("%d\n",  multiply(num1 ,num2));
        System.out.printf("%d\n",  divide(num1 ,num2));
    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static int sub(int num1, int num2){
        return num1 - num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static int divide(int num1, int num2){
        return num1 / num2;
    }
}


