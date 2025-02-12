package com.beyond.di.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // 해당 클래스가 자바 설정 파일임을 선언
@Import(value = {OwnerConfig.class, PetConfig.class})
public class RootConfig {


    

}
