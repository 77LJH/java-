package edu.gdut.demo.abstractdemo1;

public class Test {
    public static void main(String[] args) {
        // Person p = new Person(); // 抽象类不能被实例化
        // p.work();
        Student s = new Student("张三", 20);
        s.work();
        System.out.println(s);
    }
}
