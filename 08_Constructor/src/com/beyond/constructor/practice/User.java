package com.beyond.constructor.practice;

public class User {
    // 필드 선언
    private String id;
    private String password;
    private String name;
    private int age;
    private char gender;

    // 생성자 선언
    // 기본 생성자
    // 객체 생성만을 목적으로 사용
    public User(){

    }
//    생성자를 private으로 선언하면 외부에서 절대로 객체를 생성할 수 없다.
//    클래스 내부에서만 생성자를 호출해서 객체를 생성할 수 있다.
//    private User() {
//    }


    // 매개변수가 있는 생성자(아이디, 패스워드. 이름)
    // 객체 생성과 동시에 전달된 값들을 매개변수로 받아서 필드를 초기화하는 목적으로 사용
    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
        // 나머지 필드( age, gender)는 JVM이 초기값을 설정해 줌
    }

    // 매개변수가 있는 생성자 (아이디, 패스워드, 이름, 나이, 성별)
    public User(String id, String password, String name, int age, char gender) {
        // 클래스 내에서 문자열 매개변수 3개를 가지는 생성자를 호출
        this(id, password,name);
        this.age = age;
        this.gender = gender;
    }

    public String information(){
        // 메소드 내부에서는 this()를 사용해서 생성자를 호출할 수 있음
        // this(id, password, name;
        return String.format("%s, %s, %s, %d, %c\n", this.id, this.password, this.name, this.age, this.gender);
    }
}
