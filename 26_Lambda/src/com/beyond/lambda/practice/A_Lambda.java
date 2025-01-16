package com.beyond.lambda.practice;

public class A_Lambda {
    public void method1(){
        // 익명 클래스 : 클래스 정의와 객체화를 동시에. 일회성으로 사용
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 구현 객체를 사용한 Runnable 인터페이스의 구현 객체 생성 ");
            }
        }; // 단 익명 클래스는 끝에 세미콜론을 반드시 붙여 줘야 함
        runnable = () -> {
            System.out.println("람다식을 사용한 Runnable 생성 1");
        };

        runnable = () -> System.out.println("람다식을 사용한 Runnable 생성 2");

        // 익명 클래스 객체 사용
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
