package com.beyond.aop.character;

import static org.assertj.core.api.Assertions.*;

import com.beyond.aop.config.RootConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

// 단위 테스트에 공통적으로 사용할 확장 기능을 선언해주는 역할
@ExtendWith(SpringExtension.class)
// 생성된 스프링 컨테이너에 스프링 빈을 추가하기 위해서는 application-context.xml 파일과 같은 설정 파일을 읽어야 하는데, 이런 설정파일을 로드하는 어노테이션
@ContextConfiguration(classes = RootConfig.class)
class CharacterTest {

    @Autowired
    private Character character;

    @Test
    @Disabled
    void test() {
    }

    @Test
    void create(){
        // System.out.println(character);

        Assertions.assertThat(character).isNotNull();
        Assertions.assertThat(character.getWeapon()).isNotNull();
    }
    
    @Test
    void questTest(){
        character.quest("도토리 줍기");
    }

}