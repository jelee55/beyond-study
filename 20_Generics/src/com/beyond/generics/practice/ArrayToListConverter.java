package com.beyond.generics.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
    타입 파라미터는 대문자 알파벳 한 글자로 표현함
    E - Element
    K - Key
    V - Value
    T - Type
    N - Number
    R - Result
 */

//public class ArrayToListConverter<T> {
public class ArrayToListConverter<T extends Number> {
    private final T[] values;

    public ArrayToListConverter(T[] values) {
        this.values = values;
    }

    public void print(){
        // Arrays.stream(values).forEach(System.out::println);
        for (T value : values) {
            System.out.println(value);
        }

    }

    public List<T> toList() {
        List<T> list = new ArrayList<>();

        for (T value : values) {
            list.add(value);
        }

        return list;
//        return  Arrays.stream(values).toList();
    }
}
