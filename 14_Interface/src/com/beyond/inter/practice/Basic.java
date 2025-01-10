package com.beyond.inter.practice;

public interface Basic {
    // 인터페이스에서 필드는 무조건 상수 필드임
    /*public static final*/ int NUM = 0;
    
    // 인터페이스에서 메소드는 무조건 추상 메소드임
    /*public abstract*/ void turnOn();
    public abstract void turnOff();


    
}
