package edu.gdut.demo.codeblockdemo;

public class Student {
    private String name;
    private int age;

    //静态代码块：在类加载时执行，只执行一次，用于加载驱动和数据初始化
    //为什么要用静态代码块？而不是直接在main方法中写？
    //因为静态代码块只会执行一次，而main方法会执行多次，如果在main方法中写，每次执行main方法都会创建一个新的用户
    static {
        System.out.println("这是静态代码块，开始加载Student类");
    }


    //构造代码块：不够灵活，慢慢被构造方法替代
    //1.构造代码块在创建对象时，每次都会执行，可以把构造方法中重复的代码提取出来
    //2.构造代码块在构造方法之前执行
//    {
//        System.out.println("开始创建一个Student对象");
//    }
//
//    public Student() {
//        System.out.println("开始创建一个Student对象");
//    }
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//        System.out.println("有参构造方法：开始创建一个Student对象");
//    }


    //取代构造代码块
    public Student() {
        this(null, 0);
    }
    public Student(String name, int age) {
        System.out.println("开始创建一个Student对象");
        this.name = name;
        this.age = age;
    }
    //    pubilc Student() {
//        调用方法（）
//        System.out.println("无参构造方法：开始创建一个Student对象");
//    }
//    public Student(String name, int age) {
//        调用方法（）
//        this.name = name;
//        this.age = age;
//        System.out.println("有参构造方法：开始创建一个Student对象");
//    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
