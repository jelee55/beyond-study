package com.beyond.set.practice;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class B_TreeSet {

    public void method1() {
        // 중복제거, 정렬, null(compareTo?)은 저장 불가
        TreeSet<String> ts = new TreeSet();
        ts.add("하하하");
        ts.add("나나나");
        ts.add("가가가");
        ts.add("다다다");
        ts.add("다다다");
        ts.add("하하하");
        // ts.add(null);

        System.out.println(ts);
        // TreeSet 클래스에서 제공하는 메소드
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println();
    }

    public void method2() {
        
        // TreeSet()를 사용하려면 compareTo()등 재정의 해줘야함
        Set<Music> musics = new TreeSet<>();

        musics.add(new Music("Whiplash","aesp", 1));
        musics.add(new Music("Whiplash","aesp", 1));
        musics.add(new Music("Hug","RIIZE", 3));
        musics.add(new Music("HOME SWEET HOME","G-DRAGON", 6));
        musics.add(new Music("HOME SWEET HOME","G-DRAGON", 6));
        musics.add(new Music("APT","로제", 5));
        musics.add(new Music("Who","지민", 4));
        musics.add(new Music("HAPPY","데이식스", 2));
        musics.add(new Music("HAPPY","데이식스", 2));

        for (Music music : musics) {
            System.out.println(music);
        }
    }

}
