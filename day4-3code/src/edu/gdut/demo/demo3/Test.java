package edu.gdut.demo.demo3;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("001", "张三", 10000);
        e.work();
        e.eat();
        System.out.println(e);
        System.out.println("=====================================");

        Manager m = new Manager("002", "李四", 20000, 5000);
        m.work();
        m.eat();
        System.out.println(m);
        System.out.println("=====================================");

        Cook c = new Cook("003", "王五", 3000);
        c.work();
        c.eat();
        System.out.println(c);
        System.out.println("=====================================");
    }
}

