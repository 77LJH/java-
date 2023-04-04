package edu.gdut.demo.interfacedemo3;

public interface InterB {
    public default void method1() {
        System.out.println("接口中的默认方法");
    }
}
