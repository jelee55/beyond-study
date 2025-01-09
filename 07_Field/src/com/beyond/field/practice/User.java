package com.beyond.field.practice;

public class User {
    // 필드 선언
    public String id = "hong";
    protected String address;
    String name = "홍길동";
    private String password;

    // 메소드 선언
    // 매개변수도 지역변수 메소드 영역에서 사용이 가능하다.
    public void test(int number) {
        // 지역변수에는 접근 제한자를 붙이지 않는다.
        int num = 20;

        // 지역변수는 반드시 사용하기 전에 초기화해야 한다.
        System.out.println(num);

        // 매개변수는 메소드 호출 시 반드시 값이 전달되어 오기 때문에 출력이 가능하다.
        System.out.println(number);

        // 필드는 클래스 전역에서 사용이 가능하다. (생성자, 메소드)
        // 미 초기화 시 JVM이 기본값으로 초기화한다.
        System.out.println(password);

        password = "123456789";

        System.out.println(password);
    }
}
