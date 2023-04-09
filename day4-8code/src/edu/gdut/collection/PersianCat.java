package edu.gdut.collection;

public class PersianCat extends Cat{

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的波斯猫"+getName()+"正在吃鱼");
    }
}
