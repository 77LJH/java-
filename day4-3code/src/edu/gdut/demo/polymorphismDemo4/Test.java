package edu.gdut.demo.polymorphismDemo4;

public class Test {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("张三");
        p.setAge(20);
        p.show();

        Student s = new Student();
        s.setName("李四");
        s.setAge(21);
        s.show();

        Teacher t = new Teacher();
        t.setName("王五");
        t.setAge(22);
        t.show();

        Administrator a = new Administrator();
        a.setName("赵六");
        a.setAge(23);
        a.show();

        //多态,用于提高代码的扩展性，降低代码的耦合性，提高代码的维护性，提高代码的可读性
        Person p1 = new Student();
        p1.setName("李四");
        p1.setAge(21);
        register(p1);

        Person p2 = new Teacher();
        p2.setName("王五");
        p2.setAge(22);
        register(p2);

        Person p3 = new Administrator();
        p3.setName("赵六");
        p3.setAge(23);
        register(p3);

    }

    //这个方法能接受老师，学生和管理员
    //只能把参数写出这三个类型的父类
    public static void register(Person p){
        p.show();
    }
}
