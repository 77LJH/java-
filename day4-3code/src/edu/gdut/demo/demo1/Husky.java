package edu.gdut.demo.demo1;

public class Husky extends Dog{

    @Override
    public void eat() {
        System.out.println("哈士奇在吃哈士奇的专属狗粮");
    }

    public void breakHome(){
        System.out.println("拆家");
    }
}
