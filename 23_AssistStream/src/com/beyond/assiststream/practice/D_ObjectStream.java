package com.beyond.assiststream.practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class D_ObjectStream {
    public void fileSave(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c_object.dat"))){

            oos.writeObject(new Member("hong123", "1234", "홍길동", 30, '남', 3456.789));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileRead(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c_object.dat"))) {

            Member member = (Member) ois.readObject();

            System.out.println(member);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void objectsSave() {
        List<Member> members = new ArrayList<>();

        members.add(new Member("hong123", "1234", "홍길동", 30, '남', 345.67));
        members.add(new Member("kim123", "5678", "김철수", 25, '남', 678.98));
        members.add(new Member("sung123", "9012", "성춘향", 20, '여', 543.12));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_objects.dat"))) {

            for (Member member : members) {
                oos.writeObject(member);

                System.out.printf("%s 객체 저장 완료\n", member.getId());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void objectsRead() {
        List<Member> members = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_objects.dat"))) {
            try {
                while (true) {
                    members.add((Member) ois.readObject());
                }
            } catch (EOFException e) {
                System.out.println("파일 읽기 완료");
            }

            for (Member member : members) {
                System.out.println(member);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
