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

@ExtendWith(SpringExtension.class)
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