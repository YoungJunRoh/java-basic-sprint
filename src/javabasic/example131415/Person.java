package javabasic.example131415;

// 자바 성취도 확인 문제 5-1
//Person 클래스를 생성하고, 이름(name)과 나이(age)를 필드로 가지게 하세요.
// 해당 클래스에는 이름과 나이를 설정할 수 있는 생성자와,
// 이를 출력할 수 있는 메서드를 포함하세요.

public class Person {
    // 1. 클래스 생성하기
    // 2. 이름과 나이 필드로 만들기
    String name;
    int age;

    // 3. 이름과 나이를 설정할 수 있는 생성자 생성
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 4. 출력할 수 있는 메서드를 포함하세요
    public void print(){
        // 4.1 출력문 작성
        System.out.println("이름은 " + name + " 나이는 " + age);
    }
}
