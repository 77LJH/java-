package edu.gdut.demo.polymorphismDemo5;

public class Test {
    public static void main(String[] args) {
        //多态的英语：polymorphism
        Person p = new Person("张三", 20);
        Animal a = new Cat(2, "白色");
        Animal b = new Dog(3, "黑色");
        p.keepPet(a, "鱼");
        p.keepPet(b, "骨头");

        //什么是包？包就是文件夹，用来存放类的
        //包的命名规范，反向域名，比如：edu.gdut.demo
        //包的导入，import，import edu.gdut.demo.polymorphismDemo5.*;

        //final
        //final修饰的类不能被继承
        //final修饰的方法不能被重写,适用于什么情景:比如当前方法是一种规则，不希望被别人改变
        //final修饰的变量是常量，只能赋值一次，不能被修改
        //final修饰的变量必须赋值，否则编译报错
        //final修饰的变量是常量，常量的命名规范：所有字母大写，单词之间用下划线隔开
        //final修饰的变量是基本数据类型，变量里存储的值不能改变
        //final修饰的变量是引用数据类型，变量里存储的地址值不能改变，但是地址值指向的对象的属性可以改变
        //核心：final修饰的变量是常量，常量的值不能改变


        //权限修饰符
        //private:私有的，只能在本类中访问，比如私房钱，只能自己用
        //default:默认的，只能在本包中访问，比如家庭财产只能自己家里人用
        //protected:受保护的，本包中可以访问，其他包中的子类可以访问，比如钱还给给外面的私生子用
        //public:公共的，任何地方都可以访问，比如国家财产
    }
}
