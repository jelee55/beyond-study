package com.byeond.staticmember.practice;

import java.sql.SQLOutput;

public class B_StaticMethod {
    private static int num1 = 10;
    private static int num2 = 20;
    private int num3 = 30;

    // 1. 메게변수와 반환값이 없는 정적 메소드
    public static void method1() {
        System.out.println(num1 + num2++);

        // 정적 메소드에서 필드에 접근할 수 없음
        // 정적 메소드는 객체를 생성하지 않고 사용하기 때문에 필드에 접근할 수 없음
        // System.out.println(num3);
    }
    // 2. 매개변수가 없고 반환값이 있는 정적 메소드
    public static int method2() {
        // 지역 변수와 정적 변수의 이름이 같을 경우에는 정적 변수를 접근할 때는 this가 아닌 클래스 이름을으로
        int num1 = 30;
        int num2 = 40;
        return B_StaticMethod.num1 + B_StaticMethod.num2;
    }
    // 3. 매개변수가 있고 반환값이 없는 정적 메소드
    public static void method3(int num) {
        System.out.println(num1 + num2++);
    }

    // 4. 매개변수가 있고 반환값도 있는 정적 메소드
    public static int method4(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
