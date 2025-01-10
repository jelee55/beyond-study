package com.beyond.abstractclass.practice;

public class FootBall extends Sports{

    public FootBall(int numberOfPlayers) {
        super(numberOfPlayers);
    }

    @Override
    public void rule() {
        System.out.printf("FootBall의 선수의 수는 %d명, 손이 아닌 발로 공을 차야함\n", numberOfPlayers);
    }
}
