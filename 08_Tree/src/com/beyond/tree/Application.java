package com.beyond.tree;

import com.beyond.tree.practice.BinarySearchTree;

public class Application {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        
        // insert() 메소드
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // preorder() 메소드 (전위 순회)
        tree.order();

        // search() 메소드
        System.out.println(tree.search(40));
        System.out.println(tree.search(90));

        // delete() 메소드
        tree.delete(20);
        tree.order();
        System.out.println();

        tree.delete(30);
        tree.order();
        System.out.println();

        tree.delete(50);
        tree.order();
        System.out.println();



    }
}
