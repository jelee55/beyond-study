package com.beyond.list.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class A_ArrayList {
    public void method1(){
        List list = new ArrayList();
        // List list = new Vector();
        // List list = new LinkedList();

        //객체를 저장할 떄는 add() 메소드를 사용
        list.add("안녕하세요");
        list.add(LocalDateTime.now());
        // 오토 박싱이 적용됨
        list.add(3.14);
        list.add(false);
        list.add('a');

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        //
        String str = (String) list.get(0);
        LocalDateTime now = (LocalDateTime) list.get(1);
        Double number = (Double) list.get(2);

        System.out.println(str);
        System.out.println(now);
        System.out.println(number);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        // 객체의 중복 저장을 허용
        list.add("안녕하세요");
        list.add(null);
        list.add(null);

        System.out.println(list);
        System.out.println();

        // 원하는 인덱스 위치에 객체를 추가할 수 있음
        list.add(2, 10000);
        // 원하는 인덱스 위치에 객체를
        list.add(2, false);

        System.out.println(list);
        System.out.println();

        // 저장된 객체를 삭제할 때는 remove() 메소드를 사용
        list.remove(2);
        list.remove("안녕하세요");
        // list.remove("안녕하세요");
        list.remove(null);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
        System.out.println();

        // List가 비어있는지 확인 메소드
        System.out.println(list.isEmpty());

        // List가 저장된 객체를 모두 삭제하는 메소드
        list.clear();

        System.out.println(list.isEmpty());
        System.out.println(list);
        System.out.println();





    }

    public void method2(){

        /*
            컬렉션에서 제네릭스를 사용하는 이유
            - 명시된 타입의 객체만 저장하도록 제한을 두기 위해서 사용함
            - 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형 변환을 하지 않아도 됨
         */
        List<String> fruits = new ArrayList<>();
        // List<int> number;
        List<Integer> numbers = new ArrayList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("grape");

        numbers.add(Integer.valueOf(8));
        numbers.add(Integer.valueOf(1));
        numbers.add(7);
        numbers.add(10);
        numbers.add(3);
        numbers.add(2);

        numbers.remove(Integer.valueOf(8));

        System.out.println(fruits);
        System.out.println(numbers);
        System.out.println();

        // 오름차순 정렬
        Collections.sort(fruits);
        Collections.sort(numbers);

        System.out.println(fruits);
        System.out.println(numbers);
        System.out.println();

        // 내림차순 정렬
        // Collections.reverse(fruits);
        // Collections.reverse(numbers);
        Collections.sort(fruits, Collections.reverseOrder());
        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println(fruits);
        System.out.println(numbers);
        System.out.println();



    }

    public void method3(){
        List<Music> musics = new ArrayList<>();

        musics.add(new Music("Whiplash","aesp", 1));
        musics.add(new Music("Hug","RIIZE", 3));
        musics.add(new Music("HOME SWEET HOME","G-DRAGON", 6));
        musics.add(new Music("APT","로제", 5));
        musics.add(new Music("Who","지민", 4));
        musics.add(new Music("HAPPY","데이식스", 2));

        for (Music music : musics) {
            System.out.println(music);
        }

        System.out.println();

        // 오름차순 정렬
        Collections.sort(musics);

        for (Music music : musics) {
            System.out.println(music);
        }

        System.out.println();


        // 아티스트순으로 리스트를 오름차순 정렬
        Collections.sort(musics, new ArtistAscending());

        for (Music music : musics) {
            System.out.println(music);
        }

        System.out.println();

        // 타이틀순으로 리스트를 오름차순 정렬
//        Collections.sort(musics, new Comparator<>(){
//            @Override
//            public int compare(Music music1, Music music2) {
//                return music1.getTitle().compareTo(music2.getTitle());
//            }
//        });

        for (Music music : musics) {
            System.out.println(music);
        }

        System.out.println();






    }
}
