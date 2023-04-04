package edu.gdut.demo.interfacedemo3;

public interface InterA {
    public default void method1() {
        System.out.println("接口中的默认方法");
    }

    public abstract void method2();

    //接口静态方法的定义格式： public static 返回值类型 方法名(参数列表){}
    public static void method3() {
        System.out.println("接口中的静态方法");
    }
}
