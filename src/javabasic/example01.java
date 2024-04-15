package javabasic;

public class example01 {
    public static void main(String[] args) {
        int num = 10; //byte(8bit, 2의 8제곱) < short(2byte) < int(4byte) < long long(8바이트)
        Integer integerVariable = 210000000;
        double dnum = 3.14; //15개 자릿수
        char c = 'c'; //숫자가 들어갈 수 있다. UNICODE
        String str = "young jun"; //reference 타입 , 변경이 불가능 재할당은 가능
        boolean bool = false;

        num = Integer.MIN_VALUE;
        System.out.printf("%d\n", num);

        dnum = Double.MAX_VALUE;
        System.out.printf("%f\n", dnum);

        System.out.printf("%c",str.charAt(2));

    }
}