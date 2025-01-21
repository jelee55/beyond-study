package com.beyond.hashtable.practice;

import java.util.LinkedList;

public class Hashtable<K, V> {
    private int maxSize;
    private LinkedList<HashNode<K, V>>[] buckets;

    public Hashtable(){
        this(16);
    }

    public Hashtable(int maxSize){
        this.maxSize = maxSize;
        this.buckets = new LinkedList[this.maxSize];

        for (int i = 0; i < this.maxSize; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    public V get(K key) {
        int index = hash(key);

        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }

    public void put(K key, V value) {
        int index = hash(key);
        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value; // 기존 노트 변경
                return;
            }
        }
        buckets[index].add(new HashNode<>(key, value));
    }

    public boolean contains(K key) {
        boolean result = false;
        int index = hash(key);
        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public V remove(K key) {
        V value = null;
        int index = hash(key);

        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                value = node.value;
                
                // HashNode를 제거
                buckets[index].remove(node);

                break;
            }
        }
        return value;
    }

    public int size(){
        int size = 0;

        for (LinkedList<HashNode<K, V>> bucket : buckets) {
            size += bucket.size();
        }

        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % this.maxSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < buckets.length; i++){
            LinkedList<HashNode<K, V>> bucket = buckets[i];

            sb.append(i).append(": ").append(bucket).append("\n");
        }

        return sb.toString();
    }




    private static class HashNode<K, V> {
        private K key;
        private V value;

        private HashNode(K key, V value){
        this.key = key;
        this.value = value;
        }

        @Override
        public String toString() {
            return "{ key=" + key + ", value=" + value + "}";
        }
    }
}
