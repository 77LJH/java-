package edu.gdut.demo.innerclass;

public class OuterB {
    int a=10;
    static int b=20;

    //静态内部类
    static class InnerB{
        public void show1(){
            //System.out.println("a: "+a);//报错
            System.out.println("new OuterB().a: "+new OuterB().a);
            System.out.println("b: "+b);
            System.out.println("静态内部类的非静态方法");
        }

        public static void show2(){
            //System.out.println("a: "+a);//报错
            System.out.println("new OuterB().a: "+new OuterB().a);
            System.out.println("b: "+b);
            System.out.println("静态内部类的静态方法");
        }
    }
}
