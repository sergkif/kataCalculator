package com.kata.calculator;

public class calculator {

    public static class Node{
        public Integer token;
        public Node left;
        public Node right;
    }

    public static Node createNewNode (Integer token) {
        Node newNode = new Node();
        newNode.token = token;
        newNode.left = newNode.right = null;
        return newNode;
    }

    public static Node Insert (Node root, Integer token) {
        if(root == null) {
                root = createNewNode(token);
        } else if (token <= root.token) {
            root.left = Insert(root.left, token);
        } else {
            root.right = Insert(root.right, token);
        }
        return root;
    }

    public static void print (Node root) {
        if (root == null) return;
        Node leftNode = root.left;
        print (leftNode);
        System.out.print(root.token + " ");
        Node rightNode = root.right;
        print(rightNode);
    }


    public static Double evaluate (String str) {

        return 0.0;
    }

    public static void main(String[] args) {
        Node root = null;
        root = Insert(root, 15);
        root = Insert(root, 10);
        root = Insert(root, 20);
        root = Insert(root, 30);
        root = Insert(root, 5);
        print(root);
    }
}
