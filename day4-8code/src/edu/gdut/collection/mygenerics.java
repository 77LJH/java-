package edu.gdut.collection;

import java.util.ArrayList;

public class mygenerics {
    public static void main(String[] args) {
        //什么是泛型？
        //JDK5.0之后，出现了一个新特性：泛型，在编译阶段对类型进行检查，保证数据的安全
        //泛型的好处：
        //1.将运行时期的问题，提前到了编译时期
        //2.统一数据类型避免了强制类型转换的麻烦
        //泛型的细节：
        //1.泛型只在编译阶段有效，编译之后会被擦除
        //2.泛型不能使用基本数据类型，只能使用引用数据类型
        //3.如果不定义泛型，默认类型为Object类型
        //在哪里使用泛型？
        //1.方法中使用泛型：在修饰符后面定义泛型
        //2.类中使用泛型：在类名后面定义泛型
        //3.接口中使用泛型：在接口名后面定义泛型，实现类确定泛型，实现类延续泛型

        //泛型不具备继承性,但数据具备继承性
        ArrayList<ye> list = new ArrayList<>();
        ArrayList<fu> list2 = new ArrayList<>();
        ArrayList<zi> list3 = new ArrayList<>();


//        method(list);
//        method(list2);
//        method(list3);

        list.add(new ye());
        list.add(new fu());
        list.add(new zi());
    }
    /*
    * 此时，泛型里面写什么类型，就只能往里面添加什么类型的数据。
    * 弊端：有时候本方法虽然不确定类型，但是以后我只希望传递ye或者ye的子类
    * 解决方案：泛型的通配符
    * ？：代表任意的数据类型
    * 使用方式：不能创建对象使用，只能作为方法的参数使用
    * ? extends ye：代表使用的泛型只能是ye类型或者ye的子类
    * ? super ye：代表使用的泛型只能是ye类型或者ye的父类
    *
    * 应用场景：
    * 1.如果我们在定义类，方法，接口的时候，不确定具体的数据类型，可以使用泛型类，泛型方法，泛型接口
    * 2.如果不确定具体的数据类型，但知道以后只能传递某个继承体系的数据，可以使用泛型的通配符
    */

    public static void method(ArrayList<ye> list) {
    }

    public static void method1(ArrayList<? extends ye> list) {
    }
    public static void method2(ArrayList<? super ye> list) {
    }
}


class ye {
}

class fu extends ye {
}

class zi extends fu {
}