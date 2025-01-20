package com.beyond.stack.practice;

public interface Stack<E> {
    void push(E value);
    int size();
    boolean isEmpty();
    E pop();
    boolean contains(E value);
    E peek();

}
