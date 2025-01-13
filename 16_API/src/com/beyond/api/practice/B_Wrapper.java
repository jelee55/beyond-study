package com.beyond.api.practice;

public class B_Wrapper {
    /*
        Wrapper 클래스
        - 기본 자료형을 객체로 포장해 주는 클래스
        - 프로그램에 따라서 기본 타입을 객체로 취급해서 처리해야 하는 경우에 사용
        - 기본 자료형을 Wrapper 클래스로 포장해주는 것을 Boxing라고 함
        - Wrapper 클래스를 기본 자료형으로 변경해 주는 것을 Unboxing이라고 함
     */
    public void method1(){
        // 1. Boxing(기본 타입 -> Wrapper 객체)
        // 1) Wrapper 클래스로 객체를 생성하는 방법 (@Deprecated)
        // Integer integer = new Integer(10);
        // Double double1 = new Double(3.14);
        // Double double2 = new Double(3.14);
        
        // 2) 정적 메소드를 통해서 생성하는 방법
        // Integer integer = Integer.valueOf(10);
        // Double double1 = Double.valueOf(3.14);
        // Double double2 = Double.valueOf(3.14);

        // 3) Auto Boxing (1.5부터 지원)
        Integer integer = 5;
        Double double1 = 1.23456678;
        Double double2 = 1.23456678;

        System.out.println(integer);
        System.out.println(double1);
        System.out.println(double2);
        // System.out.println(double1 == double2);
        System.out.println(double1.equals(double2)); // 객체 타입 비교 equals
        System.out.println();
        
        
        // 2. Unboxing(Wrapper 객체 -> 기본 타입)
        // 1) Wrapper 객체의 메소드를 이용하는 방법
        // int number = integer.byteValue();
        // double dNumber1 = double1.byteValue();
        // double dNumber2 = double2.byteValue();


        // 2) Auto Unboxing
        int number = integer;
        double dNumber1 = double1;
        double dNumber2 = double2;


        System.out.println(number);
        System.out.println(dNumber1);
        System.out.println(dNumber2);
        System.out.println(dNumber1 == dNumber2);
        System.out.println();

        System.out.println(integer * 2);
        System.out.println(double1 + double2);
        System.out.println();


        
    }
}
