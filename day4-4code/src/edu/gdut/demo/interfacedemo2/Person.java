package edu.gdut.demo.interfacedemo2;


//为什么我把这个类定义为抽象类？
//因为我不想让这个类被实例化，不想被外界直接拿去创建人的对象，而是想让其他类继承这个类，然后创建对象
//所以我把这个类定义为抽象类
public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void show() {
        System.out.println("我叫" + name + ",今年" + age + "岁");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
