package com.beyond.method.practice;

public class B_Overloading {
    public void method1() {
        // 메소드 오버로딩의 대표적인 메소드
        System.out.println();
    }
    public void test(int a) {}
    
    public void test(int a,String s) {

    }

    public void test(String s,int a ) {

    }

    public void test(int a, int b) {

    }
//    매개변수의 이름이 다르다고 오버로딩이 정용되지 않음
//    public void test(int c, int b) {
//    }
    
//    접근 제한자가 다르다고 오버로딩이 적용되지 않음
//    private void test(int a, int b){
//        
//    }

//    반환형이 다르다고 오버로딩이 적용되지 않음
//    public int test(int a, int b){
//
//    }

}
