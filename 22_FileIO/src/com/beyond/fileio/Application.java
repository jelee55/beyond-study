package com.beyond.fileio;

import com.beyond.fileio.practice.A_FileByteStream;
import com.beyond.fileio.practice.B_FileCharStream;

public class Application {
    public static void main(String[] args) {
        System.out.println("프로그램 실행");

        // new A_FileByteStream().fileSave();
        // new A_FileByteStream().fileRead();
        new B_FileCharStream().fileSave();
        new B_FileCharStream().fileRead();


        System.out.println("프로그램 종료");
    }
}
