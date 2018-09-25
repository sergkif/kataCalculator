package com.kata.calculator;

class Node {
    public Integer token;
    public com.kata.calculator.Node left;
    public com.kata.calculator.Node right;


    public static com.kata.calculator.Node createNewNode(Integer token) {
        com.kata.calculator.Node newNode = new com.kata.calculator.Node();
        newNode.token = token;
        newNode.left = newNode.right = null;
        return newNode;
    }

    public static com.kata.calculator.Node Insert(com.kata.calculator.Node root, Integer token) {
        if (root == null) {
            root = createNewNode(token);
        } else if (token <= root.token) {
            root.left = Insert(root.left, token);
        } else {
            root.right = Insert(root.right, token);
        }
        return root;
    }

    public static void print(com.kata.calculator.Node root) {
        if (root == null) return;
        com.kata.calculator.Node leftNode = root.left;
        print(leftNode);
        System.out.print(root.token + " ");
        com.kata.calculator.Node rightNode = root.right;
        print(rightNode);
    }
}

public class Main {
    public static void main(String[] args) {
        Node root = null;
        root = Node.Insert(root, 15);
        root = Node.Insert(root, 10);
        root = Node.Insert(root, 20);
        root = Node.Insert(root, 30);
        root = Node.Insert(root, 5);
        root = Node.Insert(root, 100);
        root = Node.Insert(root, 0);
        root = Node.Insert(root, -10);
        Node.print(root);
    }
}
