package edu.gdut.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //哈希特点：无序，不可重复，无索引
        //HashSet集合底层采用哈希表实现，是Set接口的一个实现类
        //哈希表是一种对于增删改查都很快的数据结构

        //哈希表的组成
        //JDK8之前：数组+链表
        //JDK8之后：数组+链表/红黑树（当链表长度超过8且数组长度超过64时，转化为红黑树）

        //哈希值：
        //根据hashCode()方法计算出来的一个int类型的值，是一个十进制的整数
        //在Object类中有一个hashCode()方法，默认使用对象的地址值计算
        //一般情况下，需要重写hashCode()方法，利用对象的属性计算哈希值
        //如果集合中存储自定义类型的元素，需要重写hashCode()方法和equals()方法


        Student s1 = new Student("张三", 23);
        Student s2 = new Student("张三", 23);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("赵六", 26);
        Student s5 = new Student("赵六", 26);

        //如果没有重写hashCode()方法，哈希值是对象的地址值
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());

        //如果自定义类没有重写了hashCode()和equals()方法，就没法去重了
        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        System.out.println(set);
    }
}
