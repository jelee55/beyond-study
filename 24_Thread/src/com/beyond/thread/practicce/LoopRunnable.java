package com.beyond.thread.practicce;

public class LoopRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%s[%d] : %d\n"
                    , Thread.currentThread().getName(), i, Thread.currentThread().getPriority());
        }
    }
}
