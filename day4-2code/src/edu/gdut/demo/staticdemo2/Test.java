package edu.gdut.demo.staticdemo2;

import java.util.ArrayList;

//测试类，含有main方法，程序的入口，我们可以在测试类中调用工具类的方法，测试代码是否正确

//继承的英语单词是：inheritance
public class Test {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 添加元素
        list.add(new Student("张三", 18, "男"));
        list.add(new Student("李四", 19, "男"));
        list.add(new Student("王五", 20, "男"));

        // 调用工具类的方法获取最大年龄
        System.out.println(StudentUtil.getMaxAge(list));
    }
}
