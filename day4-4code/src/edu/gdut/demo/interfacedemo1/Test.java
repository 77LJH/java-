package edu.gdut.demo.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        //抽象类和接口的区别
        //抽象类是单继承，接口是多实现的规则
        //抽象类是提取所有子类的共性，接口是提取部分子类的行为共性，对类行为的补充

        // 接口的特点
        // 1. 接口是一种引用数据类型，最重要的内容就是其中的：抽象方法
        // 2. 接口中的抽象方法，修饰符固定是：public abstract
        // 3. 接口中的成员变量，只能是常量，修饰符默认是：public static final

        //说明：接口中的成员变量，是被static修饰的，所以可以直接通过接口名调用
        System.out.println(Swim.a);
        //Swim.a = 20; //报错，因为接口中的成员变量，是被final修饰的，所以不能被修改

        //接口和类的关系
        //1. 类与类之间是继承关系，只能单继承，不能多继承，但是可以多层继承
        //2. 类与接口之间是实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口，但要对所有接口中的抽象方法全部重写
        //   可遇到的问题：一个类继承了另一个类，同时实现了多个接口，那么继承的类在前，接口在后
        //   可遇到的问题：一个类实现了多个接口，如果多个接口中有同名的抽象方法，那么只需要重写一次即可
        //3. 接口与接口之间是继承关系，可以单继承，也可以多继承
        //   但要注意：如果实现类实现了最下面的子接口，那么就需要重写所有的抽象方法，如果实现类实现了最上面的父接口，那么就只需要重写父接口中的抽象方法


        Rabbit r = new Rabbit("兔子", 1);
        r.eat();
        System.out.println(r);

        Frog f = new Frog("青蛙", 1);
        f.eat();
        f.swim();
        System.out.println(f);

        Dog d = new Dog("狗", 2);
        d.eat();
        d.swim();
        System.out.println(d);

        // Animal a = new Animal(); // 抽象类不能被实例化
        // a.eat();
        // a.swim();
        // System.out.println(a);

        // Swim s = new Swim(); // 接口不能被实例化
        // s.swim();
        // System.out.println(s);
    }
}
