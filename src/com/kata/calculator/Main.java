package com.kata.calculator;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String str = "3 5 10 200 394 23 -20 0 1";
        Node root = new Node();
        Stream.of(str.split(" ")).forEach(root::insert);

        System.out.println(root.toString());
    }
}