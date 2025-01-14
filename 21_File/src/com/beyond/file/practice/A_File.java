package com.beyond.file.practice;

import java.io.File;
import java.io.IOException;

public class A_File {
    /*
        File 클래스
        - 파일 크기, 속성, 이름 등의 정봊를 얻어내는 기능과 파일 생성 및 삭제 기능을 제공
        - 파일의 데이터를 읽고 쓰는 기능은 지원하지 않음
        - 파일의 데이터를 읽고 쓰기 위해서는 파일 관련 입출력 스트림을 사용해야 함
     */
    public void method1() {
        try {
            File file = new File("test.txt");
            // File file = new File("C:/Users/Playdata/develop/test.txt"); // 메모리상에만 존재하는 객체

            System.out.println("파일명: " + file.getName());
            System.out.println("파일 경로: " + file.getAbsolutePath());
            System.out.println("파일 용량: " + file.length());
            System.out.println("파일 존재 여부: " + file.exists());
            System.out.println("파일 여부: " + file.isFile());
            System.out.println("디렉터리 여부: " + file.isDirectory());

            if (file.exists()){
                file.delete(); // 파일 또는 디렉터리 삭제
            }else{
                file.createNewFile(); // 실제 파일이 만들어짐
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void method2() {
        try {
            // File file = new File("C:/Users/Playdata/develop/temp");
            File demo = new File("C:/Users/Playdata/develop/temp/demo");
            File file = new File("C:/Users/Playdata/develop/temp/demo/demo.txt");

            // 존재하지 않는 경로일 경우 디렉터리 생성
            if (!demo.exists()){
                // file.mkdir(); // 단일 디렉터리만 생성
                demo.mkdirs(); // 없는 디렉터리 모두 생성
            }

            if (!file.exists()){
                /*
                    파일을 생성
                    - 경로를 지정하면 해당 위치에 파일을 생성
                    - 존재하지 않는 경로를 제시하면 IOException이 발생
                 */
                 file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
