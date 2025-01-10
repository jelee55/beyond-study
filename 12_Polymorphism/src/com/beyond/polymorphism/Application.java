package com.beyond.polymorphism;

import com.beyond.polymorphism.practice.Desktop;
import com.beyond.polymorphism.practice.Product;
import com.beyond.polymorphism.practice.SmartPhone;
import com.beyond.polymorphism.practice.Television;

public class Application {
    public static void main(String[] args) {
        // 1. 부모 타입의 참조 변수로 부모 객체를 다루는 경우
        Product product = new Product();

        // product 참조 변수로 product 클래스의 멤버만 접근 가능
        System.out.println(product);
        System.out.println();


        // 2. 자식 타입의 참조 변수로 자식 객체를 다루는 경우
        Desktop desktop = new Desktop();

        // desktop 참조 변수로 Product, Desktop 클래스의 멤버에 접근 가능
        System.out.println(desktop);
        System.out.println();


        // 3. 부모 타입의 참조 변수로 자식 객체를 다루는 경우
        Product television = /*(Product)*/ new Television(); // 업 캐스팅

        // television 참조 변수로 Product 클래스의 멤버만 접근 가능
        System.out.println(television);
        // 다시 Television 클래스의 멤버에 접근하고 싶은면 형 변환을 해야 함
        System.out.println(((Television)television).getInch()); //다운 캐스팅
        System.out.println();


        // 4. 배열과 다형성
        // 1) 다형성을 적용하기 전
        Desktop[] desktops = new Desktop[2];

        desktops[0] = new Desktop();
        desktops[1] = new Desktop();

        SmartPhone[] smartPhones = {
                new SmartPhone()
                ,new SmartPhone()
        };

        // 2) 다형성을 적용한 후
        Product[] products = {
                new Desktop()
                , new Desktop()
                , new SmartPhone()
                , new SmartPhone()
        };

        for(Product p:products){

            System.out.println(p);

            if(p instanceof Desktop){
                System.out.println(((Desktop)p).isAllInOne());
            } else if (p instanceof SmartPhone) {
                System.out.println(((SmartPhone)p).getModelAgench());
            }else if(p instanceof Television){
                System.out.println(((Television)p).getInch());
            }

        }


        // 5. 매개변수의 다형성
        productinfo(new Desktop());
        productinfo(new SmartPhone());
        productinfo(new Television());


    }

   /* public static void productinfo(Desktop desktop) {
        System.out.println(desktop);
    }
    public static void productinfo(SmartPhone desktop) {
        System.out.println(desktop);
    }
    public static void productinfo(Television desktop) {
        System.out.println(desktop);
    }*/

    public static void productinfo(Product product) {
        System.out.println(product + "====");
    }
}
