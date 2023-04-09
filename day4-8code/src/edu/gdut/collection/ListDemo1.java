package edu.gdut.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //Colletion的方法List都继承了，List集合的特有方法：
        //add(int index, E element)：在指定位置添加元素
        //remove(int index)：删除指定位置的元素
        //set(int index, E element)：修改指定位置的元素
        //get(int index)：获取指定位置的元素

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);

        list.add(1, "javaee");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(1, "javaee");
        System.out.println(list);

        String s = list.get(1);
        System.out.println(s);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        //请问是此时删除的是1这个元素，还是索引为1的元素
        //为什么？
        //因为在调用方法的时候，如果出现了方法重载，编译器会根据传递的参数类型，自动选择对应的方法
        //优先调用参数类型为int的方法，如果没有，才会调用参数类型为Object的方法
        list2.remove(1);
        System.out.println(list2);

        //手动装箱，把基本数据类型转换为包装类，包装类是引用类型
        Integer i = Integer.valueOf(1);
        list2.remove(i);
        System.out.println(list2);
    }
}
