package edu.gdut.demo.demo2;

public class Student extends Person{
    //子类构造方法中隐藏的super（）去访问父类的无参构造
    public Student(){
        //默认super();
        System.out.println("这是子类的无参构造方法");
    }

    public Student(String name,int age){
        //如果想调用父类的有参构造来给对象成员变量赋值的话，需要手动调用父类的有参构造方法
        super(name,age);
    }
}
