package edu.gdut.demo.interfacedemo5;

public abstract class InterAdapter implements Inter {

    //这是一个适配器类，为了方便我们使用接口中的抽象方法，我们可以使用适配器类，这样我们就不需要重写接口中的所有抽象方法了
    //什么时候使用适配器设计模式呢？当一个接口的抽象方法很多，但是我们只需要使用其中的几个方法时，我们可以使用适配器设计模式

    //书写步骤
    //1.定义一个适配器类，实现接口
    //2.在适配器类中对接口的所有抽象方法进行空实现
    //3.让真正的实现类去继承适配器类，重写我们需要的方法即可
    //4.为了避免其他类创建适配器类的对象，我们可以将适配器类定义为抽象类

    //提出一个问题：如果真正的实现类有父类要继承，那该怎么办呢？
    //解决方案：让适配器类去继承真正的实现类的父类，这样就可以同时继承父类和实现接口了


    @Override
    public void method1() {
    }

    @Override
    public void method2() {
    }

    @Override
    public void method3() {
    }

    @Override
    public void method4() {
    }

    @Override
    public void method5() {
    }

    @Override
    public void method6() {
    }
}

