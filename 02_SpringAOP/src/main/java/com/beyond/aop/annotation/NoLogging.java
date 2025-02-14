package com.beyond.aop.annotation;

/*
    override -> 컴파일에게 정보를 주는거? -> 컴파일러에게 문법 체크를 하도록 알린
    어노테이션
        - JDK 1.5부터 추가된 기능으로 자바 코드에 추가적인 정보를 제공하는 메타 데이터
        - 비지니스 로직에 영향을 주지 않지만 컴파일 과정에서 유효성을 체크, 코드를 어떻게 컴파일하고 처리할지
          알려주는 정보를 제공
        - 어노테이션은 클래스, 메소드, 필드, 매개변수 등에 추가할 수 있음
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션을 적용할 위치 지정
@Target({ElementType.METHOD, ElementType.FIELD})
// 어노테이션의 유효 범위를 지정할 때 사용
// @Retention(RetentionPolicy.SOURCE) // 코드상에서만 유효
// @Retention(RetentionPolicy.CLASS) // 클래스를 참조할 떄까지 유효
@Retention(RetentionPolicy.RUNTIME) // JVM에 의해서 참조가 가능
//@Inherited // 부모 클래스에서 어노테이션을 선언하면 자식 클래스에도 상독됨
public @interface NoLogging {

}
