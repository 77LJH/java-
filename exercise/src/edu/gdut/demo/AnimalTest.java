package edu.gdut.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<edu.gdut.demo.Animal> list = new ArrayList<>();

        list.add(new Cat("加菲猫", 3));
        list.add(new Dog("旺财", 2));
        Iterator<Animal> it = list.iterator();
        while(it.hasNext()){
            //多态
            Animal a = it.next();
            a.cry();
        }
    }
}
