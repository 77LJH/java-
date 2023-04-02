package edu.gdut.demo.InheritanceDemo3;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal("动物", 2);
        a.eat();
        a.drink();
        a.sleep();
        a.show();
        System.out.println("==================================");
        Dog d = new Dog("旺财", 3);
        d.eat();
        d.drink();
        d.sleep();
        d.show();
        d.lookDoor();
        System.out.println("==================================");
        Cat c = new Cat("加菲", 2);
        c.eat();
        c.drink();
        c.sleep();
        c.show();
        c.catchMouse();
    }
}
