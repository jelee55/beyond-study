package com.beyond.method;

import com.beyond.method.practice.A_Method;
import com.beyond.method.practice.User;

public class Appliaction {
    public static void main(String[] args) {
        A_Method m = new A_Method();

//        m.method1();
//        System.out.println();
//
//        String msg = m.method2();
//        System.out.println(msg);
//
//        m.method3(10, 2);
//        System.out.println();
//
//        int sum = m.method4(2,4);
//        System.out.println(sum);


        User u = new User("jelee", "1234", "lee");
        System.out.println(u.infomation());
        m.method5(u);
        System.out.println(u.infomation());
        System.out.println();


        System.out.println(m.method6(1,2));
        System.out.println(m.method6(1,2, 5, 5, 6));

    }

}
