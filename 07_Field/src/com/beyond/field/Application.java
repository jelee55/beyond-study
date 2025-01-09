package com.beyond.field;

import com.beyond.field.practice.User;

public class Application {
    public static void main(String[] args) {
        // 1. 접근 제한자 테스트
        User user = new User();

        // 1) public : 어디서든 필드에 직접 접근이 가능하다.
        user.id = "hong123";

        System.out.println(user.id);

        // 2) protected : 같은 패키지, 자식 클래스에서만 직접 접근이 가능하다.
        // System.out.println(user.address);

        // 3) default : 같은 패키지 내에서만 직접 접근이 가능하다.
        // System.out.println(user.name);

        // 4) private : 클래스 내에서만 직접 접근이 가능하다.
        // System.out.println(user.password);

        // 2. 변수 구분 테스트
        // 1) 필드 (인스턴스 변수, 멤버 변수)
        //  - 클래스 영역에 선언하는 변수, 클래스 내에서 어디든지 사용이 가능하다.
        //  - 필드는 접근 제한자를 사용할 수 있다. (public, protected, default, private)
        //  - new 연산자를 통해서 객체(인스턴스) 생성 시 메모리(Heap)에 생성되고, 객체(인스턴스)가 소멸 시 함께 소멸된다.

        // 2) 지역 변수
        //  - 클래스 영역 안의 메소드, 생성자, 제어문 등에 선언하는 변수, 해당 구역에서만 사용이 가능하다.
        //  - 지역 변수는 접근 제한자를 사용할 수 없다.
        //  - 메소드, 생성자, 제어문 등 실행 시 메모리(Stack)에 생성되고, 메소드, 생성자, 제어문 등 종료 시 소멸된다.
        user.test(10);
    }
}
