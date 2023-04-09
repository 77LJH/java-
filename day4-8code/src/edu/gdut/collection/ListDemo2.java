package edu.gdut.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        //五种迭代方法对比：
        //在遍历过程中要增加元素，使用ListIterator
        //在遍历过程中要删除和修改元素，使用Iterator
        //仅仅遍历，使用增强for循环或者Lambda表达式
        //如果要在遍历过程中操作索引，使用普通for循环



        //Colletion的遍历方法List都继承了，List集合的特有方法：
        //列表迭代器的遍历方法：

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //listIterator()方法，返回一个ListIterator接口的实现类对象
        //ListIterator接口是Iterator接口的子接口，所以ListIterator接口中有hasNext()和next()方法
        //ListIterator接口中有hasPrevious()和previous()方法，可以实现逆向遍历
        //ListIterator接口中有add()方法，可以在迭代的过程中，向集合中添加元素
        //ListIterator接口中有set()方法，可以在迭代的过程中，修改集合中的元素
        //ListIterator接口中有remove()方法，可以在迭代的过程中，删除集合中的元素
        //ListIterator接口中有nextIndex()方法，可以获取迭代器指针指向的元素的索引
        //ListIterator接口中有previousIndex()方法，可以获取迭代器指针指向的元素的前一个元素的索引

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
            if(s.equals("world"))
                //在遍历时，不能使用集合的方法增删元素，否则会抛出异常
                listIterator.add("javaee");
            System.out.println(s);
        }
        System.out.println(list);
    }
}
