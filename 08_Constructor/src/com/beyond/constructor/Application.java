package com.beyond.constructor;

import com.beyond.constructor.practice.User;

public class Application {
    public static void main(String[] args) {
        User user;

        // 기본 생성자로 객체 생성
        user = new User();

        System.out.println(user.information());
        System.out.println();

        // 매개변수가 있는 생성자로 객체 생성 (3개의 값을 생성자로 전달)
        user = new User("jelee", "1234", "홍길동");

        System.out.println(user.information());
        System.out.println();

        user = new User("kim123", "5678", "김철수", 24, '남');

        System.out.println(user.information());
        System.out.println();
    }
}
