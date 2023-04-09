package edu.gdut.collection;

public class TeddyDog extends Dog{

        @Override
        public void eat() {
            System.out.println(getAge()+"岁的泰迪狗"+getName()+"正在吃骨头, 边吃边蹭");
        }
}
