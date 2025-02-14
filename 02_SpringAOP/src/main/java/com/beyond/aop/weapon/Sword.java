package com.beyond.aop.weapon;

import com.beyond.aop.annotation.NoLogging;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sword extends Weapon {
    public Sword(@Value("크리스탈 소드") String name) {
        super(name);
    }

    @NoLogging // attack() 호출을 막아줌?
    @Override
    public String attack() {
        return "검을 휘두른다.";
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                '}';
    }
}