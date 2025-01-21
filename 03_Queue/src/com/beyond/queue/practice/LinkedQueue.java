package com.beyond.queue.practice;

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    @Override
    public void enqueue(E value) {
        Node<E> newNode = new Node<>(value);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new RuntimeException("큐가 비어 있음");
        }

        Node<E> tempNode = front;
        E value = tempNode.data;

        front = tempNode.next;

        tempNode.data = null;
        tempNode.next = null;

        size--;
        return value;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new RuntimeException("큐가 비어 있음");
        }

        Node<E> tempNode = front;
        E value = tempNode.data;
        return value;
    }

    @Override
    public boolean contains(E value) {
        boolean result = false;
        Node<E> currentNode = front;

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
    public String toString() {
        Node<E> current = front;
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        while (current != null) {
            sb.append(current.data + ", ");

            current = current.next;
        }

        if(sb.lastIndexOf(",") != -1){
            sb.replace(sb.lastIndexOf(","), sb.length(), "]");
        }else{
            sb.append("]");
        }


        return sb.toString();
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data){
            this.data = data;
            this.next = null;
        }
    }


}
