package com.beyond.stack.practice;

public class SinglyLinkedStack<E> implements Stack<E> {
    private Node<E> top;
    private int size;

    public SinglyLinkedStack() {
        this.top = null;
        this.size = 0;
    }


    @Override
    public void push(E value) {
        Node<E> newNode = new Node<>(value);

        newNode.next = top;
        top = newNode;

        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public E pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }else{

            Node<E> tempNode = top;
            E data = tempNode.data;

            top = tempNode.next;
            tempNode.data = null;
            tempNode.next = null;

            size--;

            return data;

        }

    }

    @Override
    public boolean contains(E value) {
        Boolean result = false;
        Node<E> currentNode = top;

        while (currentNode != null) {
            if (currentNode.data.equals(value)) {
                result = true;
                break;
            }
            currentNode = currentNode.next;
        }
        return result;
    }

    @Override
    public E peek() {
//        if(isEmpty()) {
//            throw new RuntimeException("Stack is empty");
//        }

        return top == null ? null : top.data;
    }

    @Override
    public String toString() {
        Node<E> currentNode = top;
        StringBuilder sb = new StringBuilder();
        sb.append("]");
        while (currentNode != null) {
            sb.insert(0, currentNode.data + ", ");

            currentNode = currentNode.next;
        }

        sb.insert(0, "[");

        if (sb.lastIndexOf(",") != - 1) {
            sb.replace(sb.lastIndexOf(","), sb.length(), "]");
        }

        return sb.toString();
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
