package com.beyond.linkedlist;

import com.beyond.linkedlist.practice.SinglyLinkedList;



public class Application {
    public static void main(String[] args) {
//        // 자바에서 제공하는 Linked List 테스트
//        List<String> list = new LinkedList<>();
//
//        // addFirst() 메소드 테스트 (Java 21부터 지원)
//        list.addFirst("사과");
//        list.addFirst("딸기");
//
//        System.out.println(list);
//        System.out.println();
//
//        // addLast() 메소드 테스트 (Java 21부터 지원)
//        list.addLast("포도");
//        list.addLast("키위");
//
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println();
//
//        // add()메소드 테스트
//        list.add(3, "수박");
//
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println();
//
//        // get(), contains() 메소드 테스트
//        System.out.println(list.get(0));
//        System.out.println(list.contains("딸기"));
//        System.out.println(list.contains("체리"));
//
//        // removeFirst(), removeLast(), remove() 메소드 테스트
//        list.removeFirst();
//        System.out.println(list);
//        System.out.println();
//
//        list.removeLast();
//
//        System.out.println(list);
//        System.out.println();
//
//        list.remove(1);
//
//        System.out.println(list);
//        System.out.println();
//
//
//        list.remove("사과");
//
//        System.out.println(list);
//        System.out.println();
        
        // SinglyLinkedList
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.addFirst("사과");
        list.addFirst("딸기");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.addLast("포도");
        list.addLast("키위");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.add(0, "수박");
        list.add(3, "바나나");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
        
        
        // get(), contains() 메소드 구현
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(3));
//        System.out.println(list.get(6));
        System.out.println();

        System.out.println(list.contains("키위"));
        System.out.println(list.contains("두리안"));
        System.out.println(list.contains("바나나"));
        System.out.println(list.contains("참외"));


        // removeFirst(), removeLast(), remove() 메소드 테스트
        list.removeFirst();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.remove(1);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.remove("포도");
        // list.remove("딸기");
        // list.remove("바나나");
        // list.remove("체리");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

    }
    
}
