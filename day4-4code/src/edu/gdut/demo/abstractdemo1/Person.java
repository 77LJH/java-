package edu.gdut.demo.abstractdemo1;

public abstract class Person {
    private String name;
    private int age;

    // 抽象类和抽象方法的注意事项：
    // 1. 抽象类不能被实例化，只能被继承。可以有构造方法，但是不能被实例化
    // 2. 抽象类中不一定有抽象方法，但是有抽象方法的类一定是抽象类
    // 3. 抽象类中的抽象方法只是声明，不包含方法体，就是不完整的方法，必须由子类重写该方法
    // 4. 抽象类的子类，必须重写抽象类中的所有抽象方法，否则，该子类也是一个抽象类
    // 5. 抽象类的子类，重写抽象类中的所有抽象方法后，子类就可以实例化了

    public Person() {
        System.out.println("Person类的构造方法");
    }

    //作用：给子类初始化
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void work();

    public abstract void role();

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
