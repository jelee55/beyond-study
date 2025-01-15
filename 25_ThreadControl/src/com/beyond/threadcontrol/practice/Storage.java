package com.beyond.threadcontrol.practice;

public class Storage {
    private int product;

    // 플래그 변수
    // 객체의 상태를 저장하고 흐름을 제어하기 위한 변수(필드)
    private boolean isEmpty = true;

    public synchronized void getProduct() {
        while (isEmpty) {
            try {
                // 객체의 잠금을 풀고 스레드를 일시 정지 상태로 만듦
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("소비자가 %d번 상품을 소비하였습니다.\n", product);
        this.isEmpty = true;
        notify(); // wait()에 의해서 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만듦.
    }

    public synchronized void setProduct(int product) throws InterruptedException {
        while (!isEmpty) {
            wait();
        }
        this.product = product;
        this.isEmpty = false;

        System.out.printf("생산자가 %d번 상품을 생산하였습니다.\n", product);
        notify();
    }
}
