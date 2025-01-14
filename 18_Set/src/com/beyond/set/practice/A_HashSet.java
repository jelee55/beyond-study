package com.beyond.set.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A_HashSet {
    public void method1(){
        Set<String> set = new HashSet<>();

        set.add(null);
        set.add("반갑습니다.");
        set.add(new String("반갑습니다."));
        set.add("여러분");
        set.add("안녕하세요.");
        set.add("여러분");
        set.add(null);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println();
        
        // Set에 저장된 객체에 접근하는 방법
        // 1. 향상된 for문을 사용
        // set.forEach(s -> System.out.println(s)); // 람다식
        // set.forEach(System.out::println); //메소드 참조 활용

        for (String str : set) {
            System.out.println(str);
        }

        System.out.println();

        // 2. HashSet에 저장된 객체들을 ArrayList에 담아서 사용하는 방법
        List<String> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();


        // 3. Iterator 반복자를 사용하는 빙밥
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        // iterator.forEachRemaining(System.out::println); // 메소드 참조 활용
        // iterator.forEachRemaining(s -> System.out.println(s)); // 람다식





    }

    public void method2(){

        Set<Music> musics = new HashSet<>();

        // 참조형으로 비교를 하기때문에 set은 같은 객체인지 비교 불가 equals, hashcode를 재정의를 해줘야 중복제거 가능
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

        System.out.println();



    }

}
