package edu.gdut.collection;

public class HuskyDog extends Dog{

            @Override
            public void eat() {
                System.out.println(getAge()+"岁的哈士奇狗"+getName()+"正在吃骨头, 边吃边拆家");
            }
}
