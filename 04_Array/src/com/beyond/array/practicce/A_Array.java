package com.beyond.array.practicce;

import java.util.Arrays;

public class A_Array {
    // 배열의 선언 및 생성, 초기화 ( new 연산자 사용)
    public void method1(){
        // 1) 배열의 선언 및 생성
        int[] iArray1 = new int[5];
        int iArray2[];

        iArray2 = new int[10];

        // 2) 배열 변수와 인덱스를 이용한 초기화
        iArray1[0] = 2;
        iArray1[1] = 4;
        iArray1[2] = 6;
        iArray1[3] = 8;
        iArray1[4] = 10;


        // 3) 배열 변수와 인텍스를 이용한 출력
        System.out.println(iArray1[0]);
        System.out.println(iArray1[1]);
        System.out.println(iArray1[2]);
        System.out.println(iArray1[3]);
        System.out.println(iArray1[4]);


        // 4) 반복문을 이용한 출력
        // 배열변수.length를 통해서 배열의 길이를 알 수 있음
//        for(int i = 0 ; i < iArray1.length; i++){
//            System.out.println(iArray1[i]);
//        }

        for (int value : iArray1) {
            System.out.println(value);
        }

        System.out.println();

        // Arrays 클래스의  toString() 메소드를 이용한 출력
        System.out.println(Arrays.toString(iArray1));

        // 배열을 생성하고 초기화하지 않는다면, JVM이 지정한 기본값으로 배열이 초기화됨
        // (정수형 : 0, 실수형 : 0.0, 문자형 : \u0000, 논리형 : false, 참조형 : null)
        System.out.println(Arrays.toString(iArray2));




    }
}
