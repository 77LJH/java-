package edu.gdut.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationDemo1 {
    public static void main(String[] args) {
        //1.Collection是单列集合的根接口，List和Set都是Collection的子接口
        //2.常见成员方法：add,remove,clear,contains,isEmpty,size
        //  其中contains方法底层调用的是equals方法，所以如果集合中存储的是自定义类对象，那么在JavaBean中要重写equals方法
        //3.三种通用遍历方式：
        //  1.迭代器遍历：Iterator，hasNext(),next(),remove()
        //  2.增强for循环遍历，本质还是迭代器，不能修改集合中的元素
        //  3.Lambda表达式遍历，forEach()

        //List接口：有序（指存取的顺序是不变的），可重复，有索引
        //Set接口：无序，不可重复，没有索引
        //List接口的实现类：ArrayList，LinkedList，Vector(不用)
        //Set接口的实现类：HashSet，LinkedHashSet，TreeSet


        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //集合的通用遍历方式一
        //迭代器遍历集合
        Iterator<String> it = list.iterator();
        //hasNext()判断集合中是否有元素,如果有返回true,没有返回false
        while(it.hasNext()){
            //next()取出集合中的元素，指针向后移动一位
            String s = it.next();
            if(s.equals("world"))
                //remove()删除集合中的元素，指针向后移动一位
                it.remove();
            System.out.println(s);
        }
        System.out.println(list);
        //注意细节点：
        //迭代器遍历完毕，指针已经指向了集合的最后一个元素的后面，不会复位，再次调用next()方法会报错
        //NoSuchElementException，指针指向的是元素，不依赖索引
        //循环中只能调用一次next()方法，如果调用多次，指针会向后移动多次，会跳过元素
        //迭代过程中是不能用集合的方法增删元素的，否则会报错，ConcurrentModificationException，并发修改异常
        //如果要再次遍历集合，需要重新获取迭代器

        //什么是并发修改异常？
        //当多个线程操作同一个集合时，有可能会出现并发修改异常
    }
}
