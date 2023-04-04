package edu.gdut.demo.interfacedemo3;

public class InterImp2 implements InterA {
    @Override
    public void method1() {
        System.out.println("interimp2 重写了接口中的默认方法");
    }

    @Override
    public void method2() {
        System.out.println("interimp2 重写了接口中的抽象方法");
    }
}

