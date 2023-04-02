package edu.gdut.demo.staticdemo2;

import java.util.ArrayList;

// 工具类，有几点需要注意的：
// 1. 工具类中的方法都是静态的，所以不需要创建对象，直接使用类名调用即可

//static的注意事项：
//1. 静态方法只能访问静态成员变量和静态方法，怎么理解？
// 静态方法中不能使用非静态成员变量和非静态方法，因为非静态成员变量和非静态方法都是属于对象的，而静态方法是属于类的，所以静态方法中不能使用非静态成员变量和非静态方法
//2. 静态方法中不能使用this和super关键字，为什么？
// 因为静态方法是属于类的，而this和super都是属于对象的，所以静态方法中不能使用this和super关键字
//3. 非静态方法中可以使用静态成员变量和静态方法，也可以使用非静态成员变量和非静态方法

public class StudentUtil {
    // 私有化构造器，防止创建对象，因为工具类中的方法都是静态的，不需要创建对象，直接使用类名调用即可，所以私有化构造器
    private StudentUtil() {
    }

    // 获取最大年龄
      public static int getMaxAge(ArrayList<Student> list) {
        if(list == null || list.size() == 0) {
            return -1;
        }
        int maxAge = 0;
        for (Student student : list) {
            int age = student.getAge();
            if (age > maxAge) {
                maxAge = age;
            }
        }
        return maxAge;
    }

    // 获取最小年龄
    public static int getMinAge(ArrayList<Student> list) {
        // 判断集合是否为空
        if(list == null || list.size() == 0) {
            return -1;
        }
        // 获取第一个元素的年龄
        int minAge = list.get(0).getAge();
        for (Student student : list) {
            int age = student.getAge();
            if (age < minAge) {
                minAge = age;
            }
        }
        return minAge;
    }
}
