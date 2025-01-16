package com.beyond.lambda.practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class H_MethodReference {
    /*
        메소드 참조
        - 자바 8부터 도입되어 기존 메소드나 생성자를 참조해서 함수적 인터페이스의 구현 객체를 생성
        - 람다식에서 불필요한 매개 변수를 제거하는 것이 메서드 참조의 목적
     */
    public void method1(){
        Student student1 = new Student("사람1", 22);
        Student student2 = new Student("사람2", 27);
        // 정적 메소드를 참조
        // - 클래스 이름 뒤에 :: 붙이고 정적 메소드 이름을 기술하면 됨
        // IntBinaryOperator intBinaryOperator = (a, b) -> Math.max(a,b);
        IntBinaryOperator intBinaryOperator = Math::max;

        System.out.println(intBinaryOperator.applyAsInt(1,2));
        
        
        // 객체의 메소드를 참조
        // - 참조변수 뒤에 :: 붙이고 메소드 이름을 기술하면 됨
        //Consumer<String> consumer = (str) -> System.out.println(str);  // out이라는 객체를 사용
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello World");


        // 매개변수의 메소드 참조
        // - 매개변수의 클래스 이름 뒤에 :: 붙이고 메소드 이름을 기술하면 됨
        // Function<Student, String> function = student-> student.getName();
        Function<Student, String> function = Student::getName;
        System.out.println(function.apply(new Student("임꺽정", 30)));

        // 생성자 참조
        // -
        // Supplier<Student> supplier = () -> new Student();
        Supplier<Student> supplier = Student::new;
        System.out.println(supplier.get());


    }
}
