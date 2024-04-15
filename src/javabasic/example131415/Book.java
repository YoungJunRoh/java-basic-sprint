package javabasic.example131415;
// 자바 성취도 확인 문제 5-2
//Book 클래스를 만들고,
// 제목(title), 저자(author),가격(price)을 필드로 정의하세요.
// 모든 필드를 초기화하는 생성자와, 필드 값을 출력하는 메서드를 포함하세요.
public class Book {
    // 1. 클래스 생성
    // 2. 제목, 저자 ,가격 필드 정의
    String title;
    String author;
    int price;
    // 3. 모든 필드를 초기화하는 생성자 만들기

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // 4. 필드값을 출력하는 메서드 작성
    public void print(){
        System.out.println("책 제목은 " + title + " 저자는 " + author + " 가격은 " + price);
    }
}
