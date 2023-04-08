package edu.gdut.collection;

import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args) {
        //集合的通用遍历方式三

        //Lambda表达式
        //格式：(参数列表) -> {代码块}
        //参数列表：可以省略参数类型，如果只有一个参数，小括号可以省略
        //代码块：如果代码块中只有一条语句，大括号可以省略，如果是return语句，return和大括号都可以省略
        //Lambda表达式的本质是一个匿名内部类
        //Lambda表达式的前提是接口中只有一个抽象方法
        //Lambda表达式的参数列表和返回值类型，必须与接口中的抽象方法的参数列表和返回值类型保持一致

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //利用Lambda表达式遍历集合
        //forEach()方法，参数是一个Consumer接口，Consumer接口中有一个抽象方法accept()
        //自己去遍历，依次得到元素，把元素传递给accept()方法
        list.forEach(s -> System.out.println(s));
    }
}
