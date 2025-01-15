package com.beyond.assiststream.practice;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_DataStream {
    public void fileSaveAndRead(){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("b_data.txt"));
            DataInputStream dis = new DataInputStream(new FileInputStream(("b_data.txt")))) {


            // 파일의 데이터 출력
            dos.writeUTF("홍길동");
            dos.writeInt(30);
            dos.writeDouble(100.0);
            dos.writeChar('남');
            dos.writeBoolean(false);

            // 파일에서 데이터를 읽어오기
            System.out.printf("이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %c, 결혼 여부는 %b입니다.\n"
                    , dis.readUTF(), dis.readInt(), dis.readDouble(), dis.readChar(), dis.readBoolean() );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
