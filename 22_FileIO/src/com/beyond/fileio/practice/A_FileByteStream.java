package com.beyond.fileio.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class A_FileByteStream {

    public void fileSave() {

        FileOutputStream fos = null;
        byte[] values = {99, 100, 101, 102, 103};

        try {
            fos = new FileOutputStream("a_byte.dat", true);

            fos.write(97); // a
            fos.write('b');
            fos.write(10); // 줄바꿈 문자가 저장
            fos.write('c');
            fos.write(10);
            fos.write('한'); // 한글은 2byte로 표현되기 때문에 바이트 단위 스트림으로는 출력에 제한이 있음
            fos.write(10);
            fos.write(values);
            fos.write(10);
            fos.write(values, 1, 2);

            fos.flush();
            // write() 메소드에서 IOException이 발생했을 경우 close()가 실행되지 않음
            // 따라서 finally 블록 안에서 close() apthemfmf tlfgodgodi gka
            // fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void fileRead() {
        FileInputStream fis = null;
        byte[] buffer = new byte[50];

        try {
            // 파일이 존재하지 않으면 FileNotFoundException 예외를 발생
            fis = new FileInputStream("a_byte.dat");

//            System.out.print((char) fis.read());
//            System.out.print((char) fis.read());
//            System.out.print((char) fis.read());
//            System.out.println(fis.read(buffer));
//            // System.out.println(fis.read(buffer, 10, 10));
//            System.out.println(Arrays.toString(buffer));
//            System.out.println(fis.read());
            
            // read() 메소드가 2번 실행되기 때문에 정상적으로 값을 출력함
            // while (fis.read() != -1) {
            //     System.out.println((char) fis.read());
            // }

            int value = 0;

            while ((value = fis.read()) != -1) {
                System.out.print((char) value);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
