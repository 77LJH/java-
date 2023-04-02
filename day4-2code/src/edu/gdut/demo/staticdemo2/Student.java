package edu.gdut.demo.staticdemo2;

//javabean类，封装数据，提供get/set方法，提供无参构造器，提供有参构造器，提供toString方法，方便打印输出
//javabean类中的属性都是私有的，提供get/set方法，方便外界访问。为什么属性要私有化？因为属性是类的私有数据，外界不需要知道，所以要私有化
public class Student {
    //介绍private关键字
    //private关键字可以修饰成员变量和成员方法
    //private修饰的成员变量只能在本类中访问，不能在本类的外部访问
    //private修饰的成员方法只能在本类中访问，不能在本类的外部访问

    //介绍pubilc关键字
    //public关键字可以修饰成员变量和成员方法
    //public修饰的成员变量可以在本类中访问，也可以在本类的外部访问
    //public修饰的成员方法可以在本类中访问，也可以在本类的外部访问

    //static关键字跟上面两个关键字的不同点：
    //static修饰的成员变量是属于类的，不属于对象，所以static修饰的成员变量可以在本类的外部访问
    //static修饰的成员方法是属于类的，不属于对象，所以static修饰的成员方法可以在本类的外部访问
    //static修饰的成员变量和成员方法都可以通过类名直接访问，也可以通过对象名访问

    //介绍final关键字
    //final关键字可以修饰成员变量和成员方法
    //final修饰的成员变量是常量，只能赋值一次，不能修改
    //final修饰的成员方法是最终方法，不能被重写
    //final修饰的类是最终类，不能被继承
    //final修饰的方法参数是最终参数，不能被修改
    //final修饰的局部变量是最终变量，不能被修改

    //介绍this关键字
    //this关键字的作用：区分成员变量和局部变量同名的情况，如果成员变量和局部变量同名，可以使用this关键字区分
    //this关键字的使用：this.成员变量名，this.成员方法名
    //this关键字的注意事项：this关键字只能在成员方法中使用，不能在静态方法中使用，因为静态方法是属于类的，而this关键字是属于对象的，所以静态方法中不能使用this关键字
    //什么是this关键字？this关键字是当前对象的引用，this关键字可以省略，但是不建议省略，因为省略之后，代码可读性变差了

    //静态跟内存的关系
    //静态成员变量是属于类的，不属于对象，所以静态成员变量在内存中只有一份，所有对象共享一份
    //静态随着类的加载而加载，随着类的消失而消失，所以静态成员变量的生命周期最长
    //静态成员变量的加载时机：当类被加载的时候，静态成员变量就会被加载，静态成员变量的加载时机早于对象的创建
    //静态成员变量的内存位置：静态成员变量的内存位置是方法区
    //而非静态成员变量是属于对象的，所以非静态成员变量在内存中有多少个对象就有多少个，每个对象都有一份
    //非静态随着对象的创建而创建，随着对象的消失而消失，所以非静态成员变量的生命周期最短
    //非静态成员变量的加载时机：当对象被创建的时候，非静态成员变量就会被创建，非静态成员变量的加载时机晚于对象的创建
    //非静态成员变量的内存位置：非静态成员变量的内存位置是堆内存

    //内存位置：方法区、堆内存、栈内存
    //方法区：存储.class文件信息，包括类的信息、方法的信息、静态成员变量的信息
    //堆内存：存储对象的信息，包括对象的属性信息、对象的方法信息
    //栈内存：存储局部变量的信息，包括基本数据类型的变量信息、引用数据类型的变量信息
    //栈内存中的局部变量是属于方法的，当方法执行完毕之后，该方法对应的栈内存就会被释放，所以栈内存中的局部变量的生命周期和方法的生命周期是一致的
    //堆内存中的对象是属于类的，当类被卸载之后，该类对应的堆内存就会被释放，所以堆内存中的对象的生命周期和类的生命周期是一致的


    //

    private String name;
    private int age;
    private String gender;


    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }
}
