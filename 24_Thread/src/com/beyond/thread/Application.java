package com.beyond.thread;

import com.beyond.thread.practicce.LoopRunnable;
import com.beyond.thread.practicce.LoopThread;

import java.util.concurrent.ThreadLocalRandom;

public class Application {
    public static void main(String[] args) {

        System.out.println("메인 스레드 실행");
        System.out.printf("%s : %d\n", Thread.currentThread().getName(), Thread.currentThread().getPriority());

        // 스레드 생성 방법
        // 1. Thread 클래스 상속받는 방법
        LoopThread loopThread = new LoopThread();

        loopThread.setName("Thread-1");
        // loopThread.run();
        // loopThread.setPriority(Thread.MIN_PRIORITY); // = 1
        loopThread.setPriority(Thread.MAX_PRIORITY);
        loopThread.start();


        // 2. Runnable 인터페이스를 구현하는 방법
        Thread thread = new Thread(new LoopRunnable());

        thread.setName("Thread-2");
        // loopThread.run();
        thread.start();


        // 3. 익명 구현 객체로 Runnable 인터페이스의 구현 객체를 생성하는 방법
        Thread anonymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.printf("%s[%d]\n", Thread.currentThread().getName(), i);
                }
            }
        });

        anonymousThread.setName("Thread-3");
        anonymousThread.start();

        // 4. 람다식 Runnable 인터페이스의 구현 객체를 생성하는 방법
        Thread lambdaThread = new Thread(()-> {
            for (int i = 1; i <= 100; i++) {
                System.out.printf("%s[%d]\n", Thread.currentThread().getName(), i);
            }
        });


        lambdaThread.setName("deamon-thread");
        /*
            데몬 스레드 
            - 보조적인 역할을 수행하는 스레드
            - 모든 작업 스레드가 종료되면 데몬 스레드는 강제로 종료
         */
        lambdaThread.setDaemon(true);
        lambdaThread.start();

        try {
            /*
                join() 메소드
                - join()를 호출한 스레드는 해당 스레드가 종료될 때까지 기다렸다가
                  스레드가 종료되면 join() 호출한 스레드를 다시 실행
             */
            loopThread.join();
            thread.join();
            anonymousThread.join();
            // lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("메인 스레드 종료");
    }
}
