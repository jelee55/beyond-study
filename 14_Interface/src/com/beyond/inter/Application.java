package com.beyond.inter;

import com.beyond.inter.practice.Basic;
import com.beyond.inter.practice.Desktop;
import com.beyond.inter.practice.SmartPhone;
import com.beyond.inter.practice.Television;

public class Application {
    public static void main(String[] args) {
        // 인터페이스는 객체 생성이 불가능
        // 인터페이스를 구현하는 클래스를 통해서 객체를 생성해야 함
        // Basic basic = new Basic();

        // 인테페이스는 참조 변수로 사용이 가능
        // 다형성을 적용해서 인터페이스를 구현하는 객체들을 참조할 수 있음
        Basic basic = new SmartPhone();

        basic.turnOn();
        basic.turnOff();
        System.out.println();

        // 배열의 다형성
        Basic[] products = new Basic[4];

        products[0] = new Desktop();
        products[1] = new Desktop();
        products[2] = new SmartPhone();
        products[3] = new Television();

        for (Basic product : products) {
            product.turnOn();
            product.turnOff();
        }
    }
}
