package com.beyond.assiststream.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_BufferdStream {
    public void fileSave() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("a_buffer.txt"))) {
            bw.write("This is a BufferdStream");
            bw.newLine(); // BufferdWriter가 제공하는 메소드, 개행할 때 사용
            bw.write("줄바꿈이 적용되었나요??");
            bw.newLine();
            bw.write("줄바꿈이 적용되었나요??");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void fileRead() {
        try (BufferedReader br = new BufferedReader(new FileReader("a_buffer.txt"))){
            String line = null;

            // BufferdReader에서 제공하는 메소드. 파일에서 한 줄을 읽어올 때 사용
            // 더 이상 읽어올 데이터가 없을 때 null을 리턴
            // line = br.readLine();
            // System.out.println(line);

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
