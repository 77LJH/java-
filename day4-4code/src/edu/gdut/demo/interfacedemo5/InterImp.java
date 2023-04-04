package edu.gdut.demo.interfacedemo5;

public class InterImp extends InterAdapter {
    //我只想重写接口Inter中的抽象方法method6

    //这里我们只需要重写我们需要的方法即可
    @Override
    public void method6() {
        System.out.println("重写了接口中的抽象方法method6");
    }
}
