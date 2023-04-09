package edu.gdut.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //LinkedHashSet集合底层是哈希表+链表（记录元素的存储顺序）
        //多了一条链表（记录元素的存储顺序），保证元素有序
        //底层原理：哈希表+双向链表，每个元素都有两个引用，一个指向下一个元素，一个指向上一个元素
        LinkedHashSet<Student> set = new LinkedHashSet<>();

        Student s1 = new Student("张三", 23);
        Student s2 = new Student("张三", 23);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("赵六", 26);
        Student s5 = new Student("赵六", 26);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        System.out.println(set);
    }
}
