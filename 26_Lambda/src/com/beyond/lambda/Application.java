package com.beyond.lambda;

import com.beyond.lambda.practice.A_Lambda;
import com.beyond.lambda.practice.B_FunctionalInterface;
import com.beyond.lambda.practice.C_Consumer;
import com.beyond.lambda.practice.D_Supplier;
import com.beyond.lambda.practice.E_Function;
import com.beyond.lambda.practice.F_Operator;
import com.beyond.lambda.practice.G_Predicate;
import com.beyond.lambda.practice.H_MethodReference;
import com.beyond.lambda.practice.functional.B_Functional;

public class Application {
    /*
        람다식(Lambda Expressions)
        - 자바에서 함수적 프로그래밍을 위해서 자바 8부터 람다식을 지원
        - 람다식은 매개변수를 가지는 함수와 같은 코드 블록이지만 런타임 시에는 인터페이스의 익명 구현 객체를 생성

        [표현법]
        ([자료형 매개변수, ...]) -> {
           // 실행 코드

           [return 반환값;]
         };

         예시)
         - () -> { ... }
         - (int a) -> { System.out.println(a); }
         - (a) -> { System.out.println(a); } // 매개변수 자료형 생략가능
         - a -> { System.out.println(a); } // 매개변수가 1개일 떄 () 생략가능
         - a -> System.out.println(a); // 함수몸체가 단일 실행문이면  괄호{} 생략가능
         - (int a, int b) -> { return a + b; }
         - (a, b) -> { return a + b; }
         - (a, b) -> a + b; / 함수에 리턴문 한줄만 있을 경우 더욱 더 단축 시킬 수 있다. (중괄호, return 생략)

        tip. 타입을 생략을 해도 컴파일러가 에러를 띄우지않는 이유는,
              컴파일러 나름대로 생략된 타입 위치를 추론하여 동작하게 해주기 때문 !!
     */
    public static void main(String[] args) {
        // 람다식 테스트
        // new A_Lambda().method1();
        
        // 함수적 인터페이스 테스트
        // new B_FunctionalInterface().method1();
        // new B_FunctionalInterface().method2();
        // new B_FunctionalInterface().method3();
        // new B_FunctionalInterface().method4(300);

        // 표준 함수적 인터페이스 테스트
        // new C_Consumer().method1();
        // new D_Supplier().method1();
        // new E_Function().method1();
        // new F_Operator().method1();
        // new G_Predicate().method1();
        
        // 메소드 참조 테스트
        new H_MethodReference().method1();

    }


}
