package edu.gdut.collection;

import java.util.ArrayList;

public class mygenericstest {
    public static void main(String[] args) {
        ArrayList<PersianCat> list = new ArrayList<>();
        list.add(new PersianCat());

        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        method1(list);
        method1(list2);

        method2(list3);
        method2(list4);

        method3(list);
        method3(list2);
        method3(list3);
        method3(list4);

    }

    public static void method1(ArrayList<? extends Cat> list) {
        for(Cat c : list) {
            c.eat();
        }
    }

    public static void method2(ArrayList<? extends Dog> list) {
        for(Dog d : list) {
            d.eat();
        }
    }

    public static void method3(ArrayList<? extends Animal> list) {
        for(Animal a : list) {
            a.eat();
        }
    }
}
