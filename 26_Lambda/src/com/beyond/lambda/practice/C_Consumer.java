package com.beyond.lambda.practice;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class C_Consumer {
    /*
        Consumer
        - Consumer 표준 함수적 인터페이스는 리턴 값이 없는 accept() 추상 메소드를 가짐
        - accept() 추상 메소드는 단지 매개값을 소비한는 역할을 함
     */
    public void method1(){
        // IntStream.range(1, 10).forEach((int a) -> System.out.println(a));
        
        // Consumer<T> : T 타입의 객체를 받아서 소비함
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Consumer는 한 개의 매개값을 받아서 소비함");


        // BiConsumer<T, U> : T,U 타입의 객체를 받아서 소비
        BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + str2);
        biConsumer.accept("biConsumer는", " 2개의 매개값을 받아서 소비함") ;


        // DoubleConsumer : double 타입의 값을 받아서 소비함
        // DoubleConsumer dConsumer = number -> System.out.println(number);
        DoubleConsumer dConsumer = System.out::println; // 메소드 참조
        dConsumer.accept(3.14);


        // ObjIntConsumer<T> : T 타입의 객체와 int 타압의 값을 받아서 소비함
        ObjIntConsumer<String> objIntConsumer = (str, number) -> {
            System.out.println("objIntConsumer");
            System.out.printf("%s %d \n", str, number);
        };
        objIntConsumer.accept("java", 21);
        
    }

}
