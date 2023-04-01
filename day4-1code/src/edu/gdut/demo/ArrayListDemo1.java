package edu.gdut.demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        list.remove("hello");
        System.out.println(list);
    }
}
