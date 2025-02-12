package com.beyond.di.config;

import com.beyond.di.owner.Owner;
import com.beyond.di.pet.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class OwnerConfig {
    // @Bean // 빈 ID를 지정하지 않으면 메소드명으로 ID를 지정
    @Bean("hong")
    @Primary
    public Owner owner(@Autowired @Qualifier("dog") Pet pet){
        Owner owner = new Owner();

        owner.setName("홍길동");
        owner.setAge(23);
        owner.setPet(pet);

        return owner;
    }



    @Bean
    public Owner lee(Pet pet){
        return new Owner("이몽룡",28,pet);
    }
}
