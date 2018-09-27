package com.kata.calculator;

public class Node {
    public String token;
    public Node left;
    public Node right;

    public Node() {
    }

    @Override
    public String toString() {
        String left = this.left==null?"":this.left.toString();
        String right = this.right==null?"":this.right.toString();
        return String.valueOf(left) + " "  + this.token + " "  + right;
    }

    public void insert(String token) {
        if (this.token == null) this.token = token;
        if (Integer.valueOf(token) <= Integer.valueOf(this.token)) this.left = checkNode(this.left, token);
        else this.right = checkNode(this.right, token);
    }

    public Node checkNode(Node node, String token) {
        if (node == null) {
            node = new Node();
            node.token = token;
        } else node.insert(token);
        return node;
    }
}