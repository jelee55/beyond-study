package com.beyond.threadcontrol;

import com.beyond.threadcontrol.practice.Consumer;
import com.beyond.threadcontrol.practice.Producer;
import com.beyond.threadcontrol.practice.Storage;

public class Application {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Producer producer = new Producer(storage);
        Thread consumer = new Thread(new Consumer(storage));

        producer.start();
        consumer.start();

    }
}
