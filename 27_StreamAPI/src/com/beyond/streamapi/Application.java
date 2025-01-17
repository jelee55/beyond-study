package com.beyond.streamapi;

import practice.A_Create;
import practice.B_Filtering;
import practice.C_Sort;
import practice.D_Mapping;
import practice.E_Match;
import practice.F_Aggregate;
import practice.G_Collect;

public class Application {
    public static void main(String[] args) {
        // 스트림 생성 테스트
        // new A_Create().method1();
        // new A_Create().method2();
        // new A_Create().method3();

        // 중간 처리 메소드 테스트
        // new B_Filtering().method1();
        // new B_Filtering().method2();
        // new C_Sort().method1();
        // new C_Sort().method2();
        // new D_Mapping().method1();
        // new D_Mapping().method2();

        // 최종 처리 메소드 테스트
        // new E_Match().method1();
        // new E_Match().method2();
        // new F_Aggregate().method1();
        new G_Collect().method1();

    }
}
