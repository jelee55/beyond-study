package com.beyond.exception.practice;

import java.util.Scanner;

public class C_RuntimeException {
    public void method1(){
        int size = 0;
        int[] numbers;
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 길이 > ");
        size = scanner.nextInt();

        if (size <= 0){
            System.out.println("0보다 큰 값을 입력해");
            return;
        }

        numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i] + " ");
        }


    }
}
