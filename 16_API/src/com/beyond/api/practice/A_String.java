package com.beyond.api.practice;

import java.util.Arrays;

public class A_String {
    // String 클래스에서 제공하는 메소드 사용
    public void method1(){
        String str = "Hello World";
        // 1. concat(String) 메소드는 전달받은 문자열과 원본 문자열을 하나로 합친 새로운 문자열을 리턴
        String concat = str.concat("!!!!");
        // String concat = str + "!!!!"; // concat 메소드를 사용하는 것과 동일한 결과를 만들어 냄
        
        System.out.println(concat);
        System.out.println(str);
        System.out.println();
        
        // 2. substring(int) 메소드는 매개값으로 전달된 위치에서부터 끝까지의 문자열을 새로 생성해서 리턴
        //    substring(beginIndex, endIndex) 메소드는 매개값의 beginIndex 위치에서부터 endIndex-1 까지의 새로운 문자열
        String substring = str.substring(5);
        String substring2 = str.substring(2, 6);
        System.out.println(substring);
        System.out.println(substring2);
        System.out.println(str);
        System.out.println();
        
        // 3. indexOf() 전달받은 문자열의 시작 인덱스를 리턴
        //    indexOf(char) 메소드는 전달받은 문자의 시작 인덱스를 리턴

        // int index = str.indexOf("World");
        // 주어진 문자열이 포함되어 있지 않으면 -1 리턴
        // int index = str.indexOf("World",7);
        // int index = str.indexOf("o");
        // int index = str.indexOf("o", 6);
        // 주어진 문자열이 포함되어 있지 않으면 -1 리턴
        int index = str.indexOf("o", 8);
        System.out.println(index);
        System.out.println();

        // 4. replace(oldChar, newChar) 메소드는 문자열에서 oldChar를 newChar로 변경해서 새로운 문자열을 생성해서 리턴
        // String replace = str.replace("l", "*");
        String replace = str.replace("World", "~");
        System.out.println(replace);
        System.out.println();

        // 5. trim() 메소드는 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성해서 리턴
        str = " java ";
        
        System.out.println(str.trim());
        System.out.println(str);
        System.out.println();
        
        // 6. split(String) 메소드는 입력받은 구분자로 문자열을 분리해서 배열에 담아서 리턴  
        str = "java,mariadb,spring,html,css,vue.js,docker,kubernetes,jenkins";
        String[] strings = str.split(",");
        System.out.println(strings.length);
        System.out.println(Arrays.toString(strings));
        System.out.println(str);
        System.out.println();
        
        // 7. valueOf(...) 정적 메소드는 매개값으로 전달받은 값들을 문자열로 변경해서 리턴
        // String value = String.valueOf(12345);
        // String value = String.valueOf('A');
        // String value = String.valueOf(false);
        String value = String.valueOf(3.141592F);

        System.out.println(value);
        System.out.println();

    }

    // StringBuffer, StringBuilder 클래스
    // String 클래스와 다르게 내부의 문자열을 수정할 수 있음
    // 내부 버퍼에 문자열을 저장해 두고 그 안에서 추가, 수정, 삭제 작업을 할 수 있도록 설계되어 있음
    public void method2(){
        // 1. StringBuilder 객체 생성
        // 기본 생성자를 통해서 객체를 생성하면 16개의 문자를 저장할 수 있는 버퍼가 생성됨
        // StringBuilder sb = new StringBuilder();
        // 생성자에 정수값을 전달해 주면 해당 크기만큼의 내부 버퍼가 생성됨
        // StringBuilder sb = new StringBuilder(30);
        // 생성자에 문자열을 전달해 주면 문자열 크기 + 16 만큼의 내부 버퍼가 생성됨
        StringBuilder sb = new StringBuilder("안녕하세요.");

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        // 2. StringBuilder 클래스에서 제공하는 메소드 사용
        // 1) append(...) 메소드는 기존 문자열 뒤에 문자열을 추가
        sb.append("저는 홍길동입니다.");

        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        // 2) insert(offset, String) 메소드는 문자열의 offset 위치부터 전달받은 문자열을 추가함
        sb.insert(6, "$$$$$$$");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        // 3) delete(start, end) 메소드는 start에서 end-1까지의 인덱스에 해당하는 문자열을 삭제
        sb.delete(6,13);

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();
        
        // 4) reverse() 메소드는 문자열의 순서를 역으로 바꿈
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        // 3. 메소드 체이닝
        sb = new StringBuilder("Java Programming");
        
        // 메소드 수행 결과 해당 객체의 참조를 반환하기 때문에 아래와 같이 메소드를 이어서 쓸 수 있음
        // 이렇게 메소드를 이어서 사용할 수 있는 것을 메소드 체이닝이라고 함
        sb.append("API").delete(5, 16).reverse();

        System.out.println(sb);
        System.out.println();

    }
}
