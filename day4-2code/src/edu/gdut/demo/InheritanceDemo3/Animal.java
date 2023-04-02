package edu.gdut.demo.InheritanceDemo3;

public class Animal {

    //注意事项：
    //子类不能继承构造方法，无论私有或者非私有，否则违背了构造方法跟类名相同的原则
    //子类能继承和使用父类的非私有成员变量
    //子类可以继承父类的私有成员变量，但是不能使用或者说不能直接访问，可以通过父类的公共方法如get、set间接访问
    //子类可以继承父类虚方法表里的成员方法，虚方法表里的方法必须是没被private,static,final修饰的方法
    //子类不可以继承没有在父类虚方法表里的父类方法，但可以逐级往上找它，找到即可用，但记住可用不意味着继承下来了

    private String name;
    private int month;

    public Animal() {
    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public void eat() {
        System.out.println("动物吃东西");
    }

    //动物喝水
    public void drink() {
        System.out.println("动物喝水");
    }

    public void sleep() {
        System.out.println("动物睡觉");
    }

    public void show() {
        System.out.println("name=" + name + ", month=" + month);
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
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * 设置
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    public String toString() {
        return "Animal{name = " + name + ", month = " + month + "}";
    }
}
