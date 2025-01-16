package com.beyond.lambda.practice;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class E_Function {
    /*
        Function
        - Function 표준 함수적 인터페이스는 매개값과 리턴 값이 있는 apply() 추상 메소드를 가짐
        - apply() 추상 메소드는 주로 매개값을 리턴값으로 매팽(탕닙 변환)하는 역할
     */
    public void method1() {
        Student student = new Student("홍길동", 30, "남자", 60, 80);

        // Function<T, R> : T 타입의 객체를 R 타입의 객체로 맴핑(타입 변화)
        Function<String, Integer> function = str -> Integer.parseInt(str);
        System.out.println(function.apply("34567"));


        // BiFunction<T, U, R> : T 타입의 객체와 U 타입의 객체를 R 타입의 객체로 매핑(타입 변환)
        BiFunction<Integer, Double, String> biFunction = (i, d) -> String.format("%d + %.1f = %.1f\n", i, d, (i + d));
        System.out.println(biFunction.apply(10, 3.15));


        BiFunction<String, Integer, Student> studentBiFunction;
        // studentBiFunction = ( name,  age) -> new Student(name, age);
        studentBiFunction = Student::new;

        System.out.println(studentBiFunction.apply("홍길동", 35));


        // ToIntFunction<T> : T 타입의 객체를 int 타입으로 값으로 매핑(타입 변환)
        // ToIntFunction<Student> studentToIntFunction = s -> (s.getMath() + s.getEnglish()) / 2;
        // ToIntFunction<Student> studentToIntFunction = s -> s.getSum();
        ToIntFunction<Student> studentToIntFunction = Student::getAvg;

        System.out.println(studentToIntFunction.applyAsInt(student));







    }
}
