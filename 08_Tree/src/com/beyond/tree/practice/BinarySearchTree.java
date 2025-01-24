package com.beyond.tree.practice;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int value) {
        this.root = insert(this.root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (node.value > value) {
            node.left = insert(node.left, value);
        }else if(node.value < value){
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void order() {
        // 전위 순회
        // preordeer(this.root);
        // System.out.println();


        // 중위 순회
        inorder(this.root);
        System.out.println();

        // 후위 순회
        // postorder(this.root);
        // System.out.println();
    }


    private void preordeer(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preordeer(node.left);
            preordeer(node.right);
        }
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }

    }

    public boolean search(int value) {
        System.out.println();
        return search(this.root, value) != null;
    }

    private Node search(Node node, int value) {
        if (node == null || node.value == value) {
            return node;
        }else if(node.value > value){
            return search(node.left, value);
        }else{
            return search(node.right, value);
        }

    }

    public void delete(int value) {
        this.root = delete(this.root, value);


    }

    private Node delete(Node node, int value) {
        if (node == null) {
            return node;
        } else if (node.value > value) {
            node.left = delete(node.left, value);
        }else if(node.value < value){
            node.right = delete(node.right, value);
        }else{
            // node 1개 일때()
            if (node.left == null) {
                return node.right;
            }else if (node.right == null) {
                return node.left;
            }

            node.value = minValue(node.right);
            node.right = delete(node.right, node.value);
        }
        return node;
    }

    private int minValue(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }


    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
