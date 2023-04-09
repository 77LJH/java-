package edu.gdut.set;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //TreeSet的特点：
        //1.可排序，不可重复，无索引
        //2.可排序的原理：元素必须实现Comparable接口，重写compareTo方法，默认是升序
        //3.如果元素不实现Comparable接口，或者实现了Comparable接口，但是compareTo方法返回0，那么就会抛出异常
        //底层是基于红黑树实现的排序，是一个有序的集合，增删改查性能都比较好

        TreeSet<Integer> ts = new TreeSet();

        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(1);
        System.out.println(ts);
        System.out.println("--------");

        //迭代器
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
        System.out.println("--------");

        //增强for
        for (Integer i : ts) {
            System.out.println(i);
        }
        System.out.println("--------");

        //forEach lambda表达式
        ts.forEach(i -> System.out.println(i));
    }
}
