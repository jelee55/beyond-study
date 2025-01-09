package com.byeond.staticmember.practice;

public class A_StaticField {
    // 정적 필드
    // 정적 필드는 객체들이 공유하면서 사용할 목적으로 성언
    // 정적 필드는 프로그램이 실행될 떄 해당 클래스가 로드되면서 생성되고 프로그램이 종료될 떄 소멸됨
    public static int number = 2;

    private static String message = "Hello World";

    // 정적 필드에 대한 Getter, Setter 메소드 또한 static 키워드가 붙어야 함
    public static String getMessage() {
        return message;
    }

    // 정적 메소드에서는 this를 사용할 수 없음
    public static void setMessage(String message) {
        A_StaticField.message = message;
    }
}
