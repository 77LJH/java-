package edu.gdut.collection;

import java.util.ArrayList;

public class ReinforceForCircle {
    public static void main(String[] args) {
        //集合的通用遍历方式二
        //增强for循环，本质还是迭代器
        //for(元素的数据类型 变量名 : 集合或者数组){
        //    System.out.println(变量名);
        //}
        //所有的单列集合和数组才使用增强for循环遍历
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("------------");
        for(int i : arr){
            System.out.println(i);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println("------------");
        for(String s : list){
            System.out.println(s);
            //本质还是迭代器，不能修改集合中的元素。s只是集合中元素的一个副本，第三方变量
            s="sssss";
        }
        System.out.println(list);
    }
}

