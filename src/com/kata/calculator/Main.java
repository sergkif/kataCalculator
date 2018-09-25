package com.kata.calculator;
import com.kata.calculator.Node;

public class Main {

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

    public static void main(String[] args) {
        Node root = null;
        root = Insert(root, 15);
        root = Insert(root, 10);
        root = Insert(root, 20);
        root = Insert(root, 30);
        root = Insert(root, 5);
        root = Insert(root, 100);
        root = Insert(root, 0);
        root = Insert(root, -10);
        print(root);
    }
}
