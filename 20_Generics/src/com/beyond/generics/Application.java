package com.beyond.generics;

import com.beyond.generics.practice.ArrayToListConverter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String[] names = {"홍길동", "성춘향", "이몽령", "김철수", "김영희"};
        Integer[] numbers = {31, 28, 31, 28, 31, 28};
        Double[] dNumbers = {1.1, 2.2, 3.3, 4.4};

        // 객체를 생성하는 시점에 타입이 정해짐

//        ArrayToListConverter converter = new ArrayToListConverter(names);
//        ArrayToListConverter converter = new ArrayToListConverter(numbers);

//        ArrayToListConverter<String> converter = new ArrayToListConverter<>(names);
//        ArrayToListConverter<Integer> converter = new ArrayToListConverter<>(numbers);
        ArrayToListConverter<Double> converter = new ArrayToListConverter<>(dNumbers);

        converter.print();
        System.out.println();


        System.out.println(converter.toList());
        System.out.println();
    }
}
