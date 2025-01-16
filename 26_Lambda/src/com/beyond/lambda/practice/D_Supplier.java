package com.beyond.lambda.practice;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class D_Supplier {
    /*
        Supplier
        - Supplier 표준 함수적 인터페이스는 매개값이 없고 리턴 값이 있는 get() 추상 메소드를 가짐
        - get() 추상 메소드는 호출한 곳으로 데어터를 공급(return)하는 역할을 함
     */
    public void method1(){
        // Supplier<T> : T 타입의 객체를 리턴
        Supplier<String> supplier = () -> "Supplier는 T 타입의 객체를 리턴";
        System.out.println(supplier.get());


        // BooleanSupplier : boolean 타입의 값을 리턴
        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean()); //기본형은 getAs




    }
}
