package com.beyond.hashtable;

import com.beyond.hashtable.practice.Hashtable;

public class Application {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>(5);
        System.out.println(hashtable);
        System.out.println(hashtable.size());
        System.out.println(hashtable.isEmpty());
        System.out.println();

        // put() 메소드
        hashtable.put("strawberry","딸기");
        hashtable.put("apple","사과");
        hashtable.put("grape","포도");
        hashtable.put("banana","바나나");
        hashtable.put("banana","몽키바나나");
        hashtable.put("peach","복숭아");
        hashtable.put("orange","오렌지");

        System.out.println(hashtable);
        System.out.println(hashtable.size());
        System.out.println(hashtable.isEmpty());
        System.out.println();

        // get() 메소드
        System.out.println(hashtable.get("banana"));
        System.out.println(hashtable.get("melon"));
        System.out.println();

        // contains() 메소드
        System.out.println(hashtable.contains("banana"));
        System.out.println(hashtable.contains("melon"));
        System.out.println(hashtable.contains("apple"));
        System.out.println();

        // remove() 메소드
        System.out.println(hashtable.remove("banana"));
        System.out.println(hashtable.remove("strawberry"));
        System.out.println(hashtable.remove("melon"));

        System.out.println(hashtable);
        System.out.println(hashtable.size());
        System.out.println(hashtable.isEmpty());
        System.out.println();

    }
}
