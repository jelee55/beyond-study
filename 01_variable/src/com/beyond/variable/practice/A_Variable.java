package com.beyond.variable.practice;

public class A_Variable {
    public void variableTest(){
        // 논리형
        boolean isTrue;

        //정수형
        byte bNum;
        short sNum;
        int iNum;
        long lNum;

        //실수형
        float fNum;
        double dNum;

        // 문자형
        // char ch = 'A';
        // char ch = 97;
        // char ch = -90; //0 ~65,535(유티코드)
        // char ch = 3021;
        char ch = '\u0000';

        System.out.println("ch : " + ch);
        System.out.println();

        // 문자열
        // String name;    // 문자열을 가리킬 수 있는 참조 변수 선언
        // String name = "";    // 빈 문자열로 초기화
        //String name = "홍길동";
        String name = new String("홍길동");
        //String name = null;

        System.out.println("name : " + name.charAt(1));
        System.out.println();

        //지역 변수를 선언 후 초기화가 되지 않은 경우 에러가 발생함
        //System.out.println("isTrue = " + isTrue);

        isTrue = true;

        System.out.println("isTrue = " + isTrue);
        System.out.println();

        // bNum = 128; //에러발생
        bNum = 127;
        sNum = 32767;
        iNum = 34567890;
        // lNum = 34567890;
        // long 타입의 리터럴은 숫자 뒤에 L 또는 l을 입력해야 함
        lNum = 345678903456345L;

        System.out.println("bNum = " + bNum);
        System.out.println("sNum = " + sNum);
        System.out.println("iNum = " + iNum);
        System.out.println("lNum = " + lNum);
        System.out.println();

        // float 타입의 리터럴은 숫자 뒤에 F 또는 f를 입력해야 함
        fNum = 3.14159f;
        // dNum = 3.14159d;
        dNum = 3.14159;
        System.out.println("fNum = " + fNum);
        System.out.println("dNum = " + dNum);
        System.out.println();

        // final 변수
        //  [표현법
        //      final 자료형 변수명;
        // - 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용
        // - 초기화 이후에는 값을 변경할 수 없음

        int age = 20;
        final int AGE = 30;
        System.out.println("age = " + age);
        System.out.println("AGE = " + AGE);

        age = 30;
        //AGE = 40; // 에러 발생
        System.out.println("age = " + age);


        // 변수의 명명 규칙

        // 1) 대소문자 구분
        int number;
        // String number;
        int NUMBER; // ctrl + shift + u 소문자 -> 대문자로 변환
        int numBer;

        // 2) 숫자로 시작 X
        // int 1page;
        int pla2g3e4;

        // 3) 특수 문자 '_', '$' 제외 사용 X
        int _age;
        int a_g_e;
        int age_;
        int a$g$e$;
        // int %age;
        // int age@;

        // 4) 예약어 X
        // int void;
        // int double;
        // int class;
        // int public;
        

    }
}
