package edu.gdut.demo.interfacedemo4;

public interface InterA {
    //默认方法的意义：可以在接口中定义一些方法的实现，那么实现类就可以直接使用这些方法的实现，而不需要自己去实现
    //没用引进默认方法的话，每次父类新增一个方法，所有子类都要去实现，这样就会造成子类代码的冗余甚至报错

    // 静态方法的意义：接口中的静态方法，只能通过接口名调用，不能通过实现类对象调用

    public default void show1() {
        System.out.println("show1方法开始执行了");
        show3();
    }

    public default void show2() {
        System.out.println("show2方法开始执行了");
        show3();
    }

    // 普通的私有方法，给默认方法使用
    private void show3() {
        System.out.println("记录日志，这里隐藏了很多代码");
    }

    public static void show4() {
        System.out.println("show4方法开始执行了");
        show6();
    }

    public default void show5() {
        System.out.println("show5方法开始执行了");
        //可见，静态的私有方法，还可以给默认方法使用
        show6();
    }

    // 静态的私有方法，给静态方法使用
    private static void show6() {
        System.out.println("记录日志，这里隐藏了很多代码");
    }
}
