package com.beyond.control.practice;

import java.util.Scanner;

public class E_Branch {

    // 1~ 랜덤값(1~10)까지의 합계를 반복문을 통해서 계속 출력
    // 단, 랜덤값이 숫자 5가 나오면 프로그램 종료
    public void method1() {
        int random = 0;
        int sum;

        for (;;) {// while(true) == for(;;)

            sum = 0;
            random = (int) (Math.random() * 10 + 1);

            if (random == 5) {
                break;
            }

            for (int i = 1; i <= random; i++) {
                sum += i;
            }

            System.out.printf("1부터 %d까지의 합계: %d  \n", random, sum);
        }

        System.out.printf("랜덤값이 %d이므로 프로그램 종료\n", random);
    }


    // 구구단 2~9단 출력
    //단, 홀수단을 빼고 출력
    public void method2() {

        for (int i = 2; i <= 9; i++){
            if ((i % 2) != 0) {
                continue;
            }

            System.out.printf("======%d단======\n", i);

            for (int j = 1; j <= 9; j++){

                System.out.printf("%d X %d = %d\n", i, j, (i*j));
            }

            System.out.println();

        }

    }


}