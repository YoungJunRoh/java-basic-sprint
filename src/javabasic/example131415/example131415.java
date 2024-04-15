package javabasic.example131415;
//Person 객체를 두 개 생성하고, 각 객체에 대한 정보를 출력하세요.
// 이어서 Book 객체를 생성하고, 그 정보를 출력하세요.

public class example131415 {
    public static void main(String[] args) {
        // 1. Person 객체를 두개 생성하기
        Person person1 = new Person("노영준", 24);
        Person person2 = new Person("김강훈", 21);
        // 2. Person 객체에 대한 정보를 출력하기
        person1.print();
        person2.print();

        // 3. Book 객체를 생성하기
        Book book = new Book("데미안", "헤르만 헤세", 7200);
        // 4. Book 객체의 정보를 출력하기
        book.print();
    }
}
