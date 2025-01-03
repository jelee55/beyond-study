package com.beyond.variable.practice;

import java.util.Scanner;

public class C_KeyBoardInput {
    public void inputByScanner() {
        /*
            Scanner 클래스
            - 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
         */
        Scanner scanner = new Scanner(System.in);
        String name = null;

        System.out.print("Please enter your name:");
        name = scanner.nextLine();

        System.out.printf("당신의 이름은 %s 입니다.\n", name);
    }

}
