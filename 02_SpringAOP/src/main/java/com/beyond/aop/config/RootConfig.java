package com.beyond.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.beyond.aop") // ComponentScan을 통해 com.beyond.aop 하위 모든 componeent 어노테이션을 찾아서 bean으로 등록시켜줌
@EnableAspectJAutoProxy
public class RootConfig {


}
