package edu.gdut.demo.demo2;

public class Person {
    String name;
    int age;

    public Person(){
        //调用本类的其他构造方法，需求：默认这个人name是zhangsan
        this("zhangsan",0);
        System.out.println("父类的无参构造方法");

    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    //员工的英语单词是：employee
}
