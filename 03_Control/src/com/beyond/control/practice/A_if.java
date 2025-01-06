package com.beyond.control.practice;

import java.util.Scanner;
import java.util.Stack;

public class A_if {
    /*
        if 문
            [표현법]
                if (조건식){
                    .. 실행 코드 ..
                }else if(){
                    .. 실행 코드 ..
                }[else{
                    .. 실행 코드 ..
                }]
     */

    // 사용자에게 입력받은 정수값이 홀수인지 짝수인지 확인하기
    public void method1(){
        int number = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력: ");

        number = scanner.nextInt();
        if (number%2 == 0){
            System.out.printf("%d은(는) 짝수이다.\n", number);
        }else {
            System.out.printf("%d은(는) 홀수이다.\n", number);
        }
    }
    
    // 사용자에게 이름을 받아서 "홍길동"이 맞는지 확인하기
    public void method2(){
        Scanner scanner = new Scanner(System.in);
        String name = null;

        System.out.print("이름 입력: ");
        name = scanner.nextLine();

//        if (name.equals("홍길동")){
        if ("홍길동".equals(name)){
            System.out.printf("%s은(는) 홍길동이 맞음\n", name);
        }else {
            System.out.printf("%s은(는) 홍길동이 아님\n", name);
        }

                
    }

    // 사용자로부터 알파벳 하나를 입력받아 대문자인지 소문자인지 확인하기
    public void method3(){
        Scanner scanner = new Scanner(System.in);
        char alphabet= '\u0000';
        System.out.print("알바벳 입력: ");
        alphabet = scanner.next().charAt(0);
        if (alphabet >= 'A' && alphabet <= 'Z'){
            System.out.printf("%c은(는) 알파벳 대문자이다\n", alphabet);
        } else if (alphabet >= 'a' && alphabet <= 'z') {
            System.out.printf("%c은(는) 알파벳 소문자이다\n", alphabet);
        }else {
            System.out.printf("%c은(는) 알파벳이 아니다\n", alphabet);
            
        }
    }


    /*
        실습문제
        사용자에게 점수 (0~100)를 입력받아서 점수별로 등급을 출력하기
        - 90점 이상은 A 등급
        - 90점 미만 80점 이상은 B 등급
        - 80점 미만 70점 이상은 C 등급
        - 70점 미만 60점 이상은 D 등급
        - 60점 미만 F등급
     */
    public void practice(){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        char grade = '\u0000';

        System.out.print("점수를 입력: ");
        score = scanner.nextInt();

        if (score >=90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        }else {
            grade = 'F';
        }
            System.out.printf("당신의 점수는 %d이고 등급은 %c입니다\n", score, grade);
    }
}
