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

    /*
        자동 형 변환
        - 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환
     */
    public void autoCasting(){
        byte bNum = 10;
        short sNum = 12;
        int iNum = sNum;    // short -> int 자동 형 변환된다
        long lNum = iNum;   // int -> long 자동 형 변환된다
        // float 타입이 long 타입보다 표현 가능한 수의 범위가 더 크기 때문에 자동 형 변환된다.
        float fNum = lNum;
        double dNum = fNum;

        System.out.println("bNum = " + bNum);
        System.out.println("sNum = " + sNum);
        System.out.println("lNum = " + lNum);
        System.out.println("iNum = " + iNum);
        System.out.println("fNum = " + fNum);
        System.out.println("dNum = " + dNum);
        System.out.println();

        char ch = 'A';
        iNum = ch;

        // char은 음수가 저장될 수 없기 때문에 byte울 char으로 지동 형 변환 시킬 수 없다
        // ch = bNum;


        System.out.println("ch = " + ch);
        System.out.println("iNum = " + iNum);
        System.out.println();


        double result = 12 + 3.3; // 12.0 + 3.3 = 15.3
        // byte, short 타입의 연산 시 무조건 int 타입으로 변환 후 처리
        // int result2 = sNum + sNum;
        byte result2 = 10 + 20;
        long result3 = 30 + 30; // 30 + 30 = 60,  60을 long 타입으로 형 변환 후 대입(60L)
        long result4 = 30 + 30L; // 30L + 30L = 60L

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println();
    }

    /*
        강제 형 변환
        - 데이터 표현 범위가 큰 자료형을 작은 자료형으로 변환

        [표현법]
            (자료형) 데이터;
     */
    public void casting(){
        double dNum = 4.234567893456789;
        float fNum = (float)dNum;
        int iNum = (int) fNum;

        System.out.println("dNum = " + dNum);
        System.out.println("fNum = " + fNum);
        System.out.println("iNum = " + iNum);
        System.out.println((byte)290);
        System.out.println();

        // int sum = (int) (iNum + dNum);
        int sum = iNum + (int)dNum;

        System.out.println("sum = " + sum);



    }

    /*
        실습 무제
        홍길동 국어 점수 60, 영어 점수 70점, 수학 점수 66점을 받았다
        이 학생의 총저모가 평균을 출력하세요

        예시)
        국어 점수 : 60점
        영어 점수 : 70점
        수학 점수 : 66점

        총점 : 196점
        평균 : 65점
     */

    public void practice(){
        int kor = 60;
        int eng = 70;
        int math = 66;
        int sum = kor + eng + math;
        int avg = sum/3;

        System.out.println("국어 점수 : " + kor + "점");
        System.out.println("영어 점수 : " + eng + "점");
        System.out.println("수학 점수 : " + math + "점");
        System.out.println();
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");

    }

}
