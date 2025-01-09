package com.byeond.staticmember.practice;

public class C_StaticFinalField {// shift + f6 이름변경(한번에)
    // final 필드를 초기화하는 방법
    // 1) 선언 시 명시적으로 지정하는 방법
    // private final String gender = "남자";

    // 2) 생성자를 통해서 지정하는 방법
    private final String gender;

    // 상수 필드 (static final) 선언
    public static final int MAX_LEVEL = 99;

    public C_StaticFinalField(String gender) {
        this.gender = gender;
    }

    // final 필드에 초기값이 저장되면 프로그램 실행 도중에 수정할 수 없음
    // public void setGender(String gender) {
    //     this.gender = gender;
    // }

    public String getGender() {
        return gender;
    }

    
    

}
