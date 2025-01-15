package com.beyond.threadcontrol.practice;

public class Producer extends Thread {
    private final Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                storage.setProduct(i);
                
                // 스레드를 매개값으로 지정된 시간만큼 일시정지시키는 메소드
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

