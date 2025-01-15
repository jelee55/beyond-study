package com.beyond.thread.practicce;

public class LoopThread extends Thread {
    @Override
    public void run() {
        // 작업하고자 하는 코드 작성
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%s[%d] : %d\n"
                    , Thread.currentThread().getName(), i, Thread.currentThread().getPriority());
        }
    }
}
