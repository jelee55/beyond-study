package com.beyond.variable;

import com.beyond.variable.practice.A_Variable;
import com.beyond.variable.practice.B_ConsoleOutput;
import com.beyond.variable.practice.C_KeyBoardInput;

/*
    주석(Comment)
    - 소스 코드와는 무관하고 코드로 인식되지 않는다
    - 주로 코드에 대한 설명을 작성할 때 사용
 */

// 한줄 주석
// 추가로 주석 추가

// 클래스 이름은 자바 파일의 이름과 동일해아 함
public class Application {
    // main 메소드는 프로그램의 시작점으로
    // java.exe가 Application.class를 실행시킬 때 제일 먼저 실행되는 메소드
    public static void main(String[] args) {
        // 1) 실행할 메소드가 있는 클래스를 생성(new)해야 한다
        //  [표현법]
        //      클래스명 변수명 = new 클래스명();

        // 1-1) import 문을 사용하지 않고 클래스 생성
        // com.beyond.variable.practice.A_Variable variable = new com.beyond.variable.practice.A_Variable();
        A_Variable variable = new A_Variable();
        B_ConsoleOutput output = new B_ConsoleOutput();
        C_KeyBoardInput input = new C_KeyBoardInput();
        // 2. 생성한 클래스로 메소드를 실행(호출)
        //  [표현법]
        //      변수명.메소드명();
        // variable.variableTest();
        // variable.autoCasting();
        // variable.casting();
        // variable.practice();
        // output.valuePrint();
        input.inputByScanner();

    }


}
