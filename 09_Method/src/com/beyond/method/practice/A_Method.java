package com.beyond.method.practice;

public class A_Method {

    public void method1() {
        System.out.println("매개변수와 반환값이 둘 다 없는 메소드임");


        return;
    }

    public String method2() {
        String str = null;

        str = "매개변수가 없지만 변환값은 있는 메소드";
        return str;

    }


    public void method3(int number1, int number2) {
        System.out.printf("입력받은 매개변수의 합은 : %d\n", number1 + number2);
    }

    public int method4(int number1, int number2) {
        return number1 + number2;
    }

    // 매개변수가  user객체를 전달받는 메소드
    public void method5(User user) {
        user.setId("user1");
        user.setPassword("password1");
        user.setName("jelee");
    }

    public int method6(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
