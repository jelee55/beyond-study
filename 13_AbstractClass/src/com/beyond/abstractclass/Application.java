package com.beyond.abstractclass;

import com.beyond.abstractclass.practice.BasketBall;
import com.beyond.abstractclass.practice.FootBall;
import com.beyond.abstractclass.practice.Sports;

public class Application {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성이 불가능
        // Sports sports = new Sports(5);

        // 추상 클래스는 참조 변수로 사용이 가능
        // 즉, 다형성을 적용해서 자식 객체를 참조할 수 있음
        Sports basketBall = new BasketBall(5);
        Sports footBall = new FootBall(11);

        Sports[] sports = {basketBall, footBall};

        for (Sports s: sports) {
            printRule(s);
        }
    }

    private static void printRule(Sports sports){
        sports.rule();
    }
}
