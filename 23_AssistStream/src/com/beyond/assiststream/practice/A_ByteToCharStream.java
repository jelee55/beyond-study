package com.beyond.assiststream.practice;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A_ByteToCharStream {
    // InputStreamReader 테스트
    public void method1() {
        try {
//            char[] buffer = new char[50];
//            InputStreamReader isr = new InputStreamReader(System.in);z
//
//            System.out.print("문자열 입력 > ");
//
//            isr.read(buffer);
//
//            for (char c : buffer) {
//                System.out.print(c);
//            }
            String line = null;
            // 여러 개의 보조 스트림을 연결해서 사용할 수 있음
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("문자열 입력 > ");

            line = br.readLine();
            
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // OutputStreamWrite 테스트
    public void method2(){
//        try {
//            OutputStreamWriter osw = new OutputStreamWriter(System.out);
//
//            osw.write("안녕하세요. 저는 이몽룡입니다.\n");
//            osw.write("만나서 반가워요. 힘내세요..^^\n");
//            osw.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            bw.write("안녕하세요. 저는 이몽룡입니다.");
            bw.newLine();
            bw.write("만나서반갑..");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
