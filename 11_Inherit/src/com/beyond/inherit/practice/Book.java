package com.beyond.inherit.practice;

import java.util.Objects;

// 모든 클래스는 Object 클래스를 상속함
// 즉, 모든 클래스의 최상위 클래스는 Object 클래스임
public class Book /*extends Object*/ {
    private String title;
    private String author;
    private int price;

    public Book(){

    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String information(){
        return String.format("title : %s, author : %s, price : %d", title, author, price) ;
    }
    
    // 1. Object 클래스의 toString() 메소드
    // - toString() 메소드는 객체의 문자열 정보를 리턴
    // - 기본적으로 Object 클래스에서는 "클래스명@16진수 해시코드"를 리턴
    // - 자식 클래스에서 객체에 대한 유용한 문자열 정보를 리턴하도록 재정의할 수 있음

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", price=" + price + '}';
    }
    
    // 2. Object 클래스의 equals() 메소드
    // - equals() 메소드는 매개값으로 전달받은 객체와 자신의 동일한 객체인지 확인하는 메소드
    // - 동일한 객체라면 true를 리턴하고 그렇지 않으면 false를 리턴
    // - 기본적으로 Object 클래스에서는 주소값을 비교하는데 자식 클래스에서 객체들이 가지고 있는 
    //   필드의 값들을 비교하도록 재정의할 수 있음
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    // 3. Object 클래스의 hashCode() 메소드
    // - 객체의 해시 코드란 객체를 식별할 수 있는 하나의 정수값을 의미함
    // - 기본적으로 Object 클래스의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 
    //   생성하기 때문에 객체마다 다른 값을 가지고 있음
    // - 자식 클래스에서 객체들이 가지고 있는 필드의 값들이 같으면 동일한 해시 코드를 리턴하도록 재정의할 수 있음
    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}
