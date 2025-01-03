package com.beyond.variable.practice;

public class B_ConsoleOutput {
    public void valuePrint(){
        // () 안의 값을 콘솔에 출려해 주는 메소드
        System.out.print("안녕하세요");
        System.out.print(12345);
        System.out.print(false);
        System.out.println();

        // print 메소드와 동일하게 출력하는 메소드로 출력 후 자동으로 줄바꿈 해주는 메소드이다
        System.out.println("안녕하세요");
        System.out.println(12345);
        System.out.println(false);
        System.out.println();

        // 정해져 있는 서식에 맞춰서 그 서식에 맞는 값을 줄바꿈하지 않고 출력해 주는 메소드

        // 서식 지정자
        // %d : 정수형, %f : 실수형, %b : 논리형, %c : 문자형, %s : 문자열

        // escape 문자
        // \n : 줄 바꿈, \t : 수평 탭, \" : 큰 따옴표 출력, \' : 작은 따옴표 출력

        System.out.printf("%d\n", 10);
        System.out.printf("%d + %d = %d\n", 10, 20, (10 + 20));
        System.out.printf("%f\t%f\n", 3.141592, 4.23456789);
        System.out.printf("%.2f\t%.3f\n", 3.141592, 4.23456789);
        System.out.printf("%c %s\n", 'A', "\"Hello World\"");




    }
}
