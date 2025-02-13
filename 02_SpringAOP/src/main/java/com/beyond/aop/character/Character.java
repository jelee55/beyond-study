package com.beyond.aop.character;

import com.beyond.aop.weapon.Weapon;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
    properties 파일의 값을 읽어오는 방법

    1. @PropertySource을 사용하는 방법
        - Environment 객체를 사용해 properties 파일에 설정된 값을 읽어옴
        - 스프링 프로퍼티 플레잇스 홀더를 사용해서 properties 파일에 설정된 값을 읽어옴 (${키:기본값})

    2. @PropertySource을 생략하는 방법
        - xml 설정 파일을 사용하는 경우에는  <context:property-placeholder /> 요소를 추가함
        - JAVA 설정 파일을 사용하는 경우에는 PropertySourcesPlaceholderConfigurer 빈을 등록
 */

@Data
@Component
public class Character {
     @Value("홍길동")
    private String name;

     @Value("78")
    private int level;

    @Autowired
    @Qualifier("sword")
    private Weapon weapon;

    // AOP 메소드 호출되는 런타임에만 적용???
    public void quest(String questName){

        System.out.printf("%s 퀘스트 진행 중...\n" , questName);

    }


}