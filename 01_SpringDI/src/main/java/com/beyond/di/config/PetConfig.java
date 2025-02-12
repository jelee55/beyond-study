package com.beyond.di.config;

import com.beyond.di.pet.Cat;
import com.beyond.di.pet.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PetConfig {
    @Bean
    @Primary
    public Dog dog(){
        Dog dog = new Dog();
        dog.setName("미니피그");
        return dog;
    }

    @Bean
    public Cat cat(){
        return new Cat("바삭쿠키");
    }

}
