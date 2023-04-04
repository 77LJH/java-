package edu.gdut.demo.abstractdemo2;

public class Test {
    public static void main(String[] args) {
        // Animal a = new Animal(); // 抽象类不能被实例化
        // a.eat();
        // System.out.println(a);

        //抽象类和抽象方法的意义：
        //强制子类必须按照这种格式进行重写来实现抽象方法，规范了子类的行为和代码

        Dog d = new Dog("旺财", 3);
        d.eat();
        d.drink();
        System.out.println(d);
        Sheep s = new Sheep("喜羊羊", 2);
        s.eat();
        s.drink();
        System.out.println(s);
        Frog f = new Frog("青蛙", 1);
        f.eat();
        f.drink();
        System.out.println(f);
    }
}
