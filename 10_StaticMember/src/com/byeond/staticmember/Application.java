package com.byeond.staticmember;

import com.byeond.staticmember.practice.A_StaticField;
import com.byeond.staticmember.practice.B_StaticMethod;
import com.byeond.staticmember.practice.C_StaticFinalField;

public class Application {
    public static void main(String[] args) {

        // 정적 메소드 테스트
        // 1.정적 필스 생성 및 출력
        System.out.println(A_StaticField.number);
        System.out.println();

        // 2.객체의 필드 공유
        A_StaticField staticField1 = new A_StaticField();
        A_StaticField staticField2 = new A_StaticField();

        System.out.println(staticField1.number);
        System.out.println(staticField2.number);
        System.out.println();

        A_StaticField.number++;
        System.out.println(staticField1.number);
        System.out.println(staticField2.number);
        System.out.println();

        // 3.정적 필드의 Getter, Setter 메소드
        System.out.println(A_StaticField.getMessage());
        A_StaticField.setMessage("메시지 변경!!");
        System.out.println(A_StaticField.getMessage());
        System.out.println();

        // 정적 메소드 호출
        // 1. 매개변수와 반환값이 없는 메소드 호출
        B_StaticMethod.method1();
        B_StaticMethod.method1();
        System.out.println();

        // 2. 매개변수가 없고 반환값이 있는 메소드 호출
        int value = A_StaticField.number;
        System.out.println(value); // value 안에서ㅓ ctrl + alt + n 아래와 같이 나옴
        System.out.println(B_StaticMethod.method2());
        System.out.println();
        
        // 3. 매개변수가 있고 반환값이 없는 적정 메소드 호출
        B_StaticMethod.method3(30);
        System.out.println();

        // 4. 매개변수가 있고 반환값도 있는 정적 메소드 호출
        System.out.println(B_StaticMethod.method4());
        System.out.println(B_StaticMethod.method4(4,5));
        System.out.println(B_StaticMethod.method4(4,5,20,40));
        System.out.println();


        // final 필드 테스트
        C_StaticFinalField staticFinal1 = new C_StaticFinalField("남자");
        C_StaticFinalField staticFinal2 = new C_StaticFinalField("여자");

        System.out.println(staticFinal1.getGender());
        System.out.println(staticFinal2.getGender());
        System.out.println();

        // 상수 필드 테스트
        System.out.println(C_StaticFinalField.MAX_LEVEL);
        System.out.println(Math.PI);
        System.out.printf("byte의 표현 범위는 %d ~ %d 입니다\n", Byte.MAX_VALUE, Byte.MIN_VALUE);
        System.out.printf("int의 표현 범위는 %d ~ %d 입니다\n", Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.printf("char의 표현 범위는 %d ~ %d 입니다\n", (int)Character.MAX_VALUE, (int) Character.MIN_VALUE);

        // final 키워드로 인해서 값을 변경할 수 없음

    }
}
