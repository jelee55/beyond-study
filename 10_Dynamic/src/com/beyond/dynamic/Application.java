package com.beyond.dynamic;

import com.beyond.dynamic.practice.DynamicExample;

public class Application {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long n = 70;
        System.out.printf("피보나치 수열의 %d번째 항의 값은 %d입니다\n", n, DynamicExample.fibonacci(n));
        System.out.printf("피보나치 수열의 %d번째 항의 값은 %d입니다\n", n, DynamicExample.fibonacci(n));

        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000);
    }
}
