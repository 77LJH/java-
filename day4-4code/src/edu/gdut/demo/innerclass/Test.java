package edu.gdut.demo.innerclass;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //类的五大成员：属性，方法，构造方法，代码块，内部类

        //内部类的访问特点：
        //1.内部类可以直接访问外部类的成员，包括私有。
        //2.外部类要访问内部类的成员，必须创建对象。

        //什么时候用到内部类？
        //当B类是A类的一个部分，而且B类只在A类中使用，那么B类就可以定义为内部类。
        //比如：汽车和发动机的关系，发动机是汽车的一个部分，而且发动机只在汽车中使用，那么发动机就可以定义为内部类。
        //比如：arrylist和iterator的关系，iterator是arrylist的一个部分，而且iterator只在arrylist中使用，那么iterator就可以定义为内部类。


        Car c = new Car("奔驰", 5, "黑色");
        c.show();
        System.out.println("====================================");

        Car.Engine e = c.new Engine("奔驰发动机", 5, "黑色");
        e.start();
        e.stop();
        System.out.println(e);


        //内部类的分类：最重要的是匿名内部类

        //1.成员内部类，定义在类中的成员位置，属于外部类的成员
        //获取成员内部类对象的两种方法：
        //1.当成员内部类被非私有类修饰时，外部类名.内部类名 对象名=new 外部类名().new 内部类名();   外部类名.内部类名 对象名=外部类对象.new 内部类名();
        //   outer.inner oi=new outer().new inner();   outer.inner oi=outerobject.new inner();
        //2.当成员内部类被private修饰时，在外部类中编写方法，对外提供内部对象
        //  public inner getInner(){  return new inner() //返回值类型为内部类}

        //成员内部类如何访问外部类的成员？
        System.out.println("====================================");
        OuterA.InnerA oi=new OuterA().new InnerA();
        oi.show();


        //2.局部内部类，定义在方法中的类，只能在方法中使用，类似于方法里面的局部变量。
        //外界无法直接访问局部内部类，只能在方法中创建对象，然后调用方法。比如你无法直接使用show方法的局部变量a，只能在show方法中创建对象，然后调用方法。
        //该类可以访问外部类的成员，包括私有，也可以访问方法内的局部变量
        System.out.println("====================================");
        OuterC oc=new OuterC();
        oc.show();


        //3.静态内部类,也是成员内部类中的一种，定义在类中的静态位置，属于外部类的静态成员，只能访问外部类的静态成员，如果要访问外部类的非静态成员，必须创建外部类对象。
        //获取静态内部类对象的格式：外部类名.内部类名 对象名=new 外部类名.内部类名();
        //调用非静态方法：先创建对象，用对象调用，对象名.方法名();
        //调用静态方法：外部类名.内部名.方法名();
        //只要是静态的，就可以直接用类名调用，不需要创建对象。
        System.out.println("====================================");
        OuterB.InnerB oi2=new OuterB.InnerB();
        oi2.show1();
        OuterB.InnerB.show2();


        //4.匿名内部类    可以写在成员位置，也可以写在局部位置
        // 1、实现或者继承关系 2、方法的重写 3、创建对象
        //{ }就是一个没有名字的类--匿名内部类，它实现了Swim这个接口，或者说它继承了Animal这个抽象类，重写了该接口/抽象类所有的方法
        // 然后做了相当于 new Studnet()这个操作，用无参构造方法new了一个匿名内部类的对象
        /*
        * 内部类的格式：
        *   new 类目或者接口名(){
        *     重写方法;
        *  };
        */
        System.out.println("====================================");
        //接口多态
        Swim s=new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };
        s.swim();//编译看左边，运行看右边
        new Animal(){
            @Override
            public void eat(){
                System.out.println("重写了吃的方法");
            }
        }.eat();//编译看左边，运行看右边
        //在测试类中调用下面的method方法？
        //以前的方式如何调用？
        //要自己写一个子类继承Animal类
        //在创建子类的对象，传递给method方法
//        Dog dog=new Dog();
//        method(dog);
        //如果Dog类我只要用一次，那么还需要单独定义一个类太麻烦啦
        method(
                new Animal(){
                    @Override
                    public void eat(){
                        System.out.println("狗🐕吃骨头");
                    }
                }
        );


        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=sc.nextInt();
    }
    public static  void method(Animal a){//Animal a=子类对象 多态
        a.eat();//编译看左边，运行看右边
    }
}
