package com.beyond.lambda.practice;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class G_Predicate {
    /*
        Predicate
        - Predicate 표준 함수적 인터페이슨는 매개변수와 boolean 값을 리턴하는 test() 추상 메소드를 가짐
        - test() 추상 메소드는 매개값을 조사해서 true/false를 리턴하는 역할
     */
    public void method1(){
        // Predicate<T> : T 타입의 객체를 조사해서 true || false를 리턴
        Predicate<String> predicate = str -> str.equals("홍길동");
        System.out.println(predicate.test("이몽룡"));
        System.out.println(predicate.test("홍길동"));


        // BiPredicate<T, U> : T 타입의 객체와 U 타입의 객체를 조사해서 true || false를 리턴
        BiPredicate<String, String> biPredicate = (str1, str2) -> str1.equals(str2);

        System.out.println(biPredicate.test("test", "test"));
        System.out.println(biPredicate.test("test", "test."));



    }




}
