package com.beyond.linkedlist.practice;

public interface List<T> {
    void addFirst(T data);
    void addLast(T data);
    void add(int index, T data);
    int size();
    T get(int index);
    boolean contains(T data);
    void removeFirst();
    void removeLast();
    void remove(int index);
    void remove(T data);
}
