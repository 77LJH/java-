package edu.gdut.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //set集合的特点： 无序，不可重复 无索引  ,set集合的方法和Collection一样
        Set<String> set = new HashSet<>();

        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java"); // 重复元素不会被添加

        System.out.println(set); // 无序，不可重复
        System.out.println("--------");

        //迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");

        //增强for
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("--------");

        //forEach lambda表达式
        set.forEach(s -> System.out.println(s));
        System.out.println("--------");
    }
}
