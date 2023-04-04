package edu.gdut.demo.abstractdemo1;

public class Student extends Person {
    public Student() {
        System.out.println("Student类的构造方法");
    }

    public Student(String name, int age) {
        super(name, age);
    }


    @Override
    public void work() {
        System.out.println("学生要学习");
    }

    @Override
    public void role() {
        System.out.println("我是学生");
    }

    public String toString() {
        return "Student [name=" + getName() + ", age=" + getAge() + "]";
    }
}

