package com.beyond.exception;

import com.beyond.exception.practice.A_TryCatchFinally;
import com.beyond.exception.practice.B_Throws;
import com.beyond.exception.practice.C_RuntimeException;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("프로그램 시작");

        // new A_TryCatchFinally().method1();
//        try {
//            new B_Throws().method1();
//        } catch (IOException e) {
//            System.out.println("IOException 예외 발생");
//        } catch (ClassNotFoundException e) {
//            System.out.println("ClassNotFoundException 예외 발생");
//        }
//        new B_Throws().method1();

        new C_RuntimeException().method1();

        System.out.println("프로그램 종료");

    }
}
