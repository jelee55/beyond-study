package com.beyond.exception.practice;

import java.io.IOException;

public class B_Throws {
    public void method1() throws IOException, ClassNotFoundException {
        System.out.println("method1 호출");
        method2();
        System.out.println("method1 종료");
    }

    private void method2() throws IOException, ClassNotFoundException {
        System.out.println("method2 호출");
        method3();
        System.out.println("method2 종료");
    }

    private void method3() throws ClassNotFoundException, IOException {
        System.out.println("method3 호출");

        int random = (int) (Math.random() * 3 + 1);

        if (random == 1) {
            throw new ClassNotFoundException();
        } else if (random == 2) {
            throw new IOException();
        }

        System.out.println("method3 종료");
    }

}
