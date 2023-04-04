package edu.gdut.demo.innerclass;

public class OuterA {
    private int a=10;
    class InnerA {
        private int a=20;
        public void show(){
            int a=30;
            System.out.println("a: "+a);
            System.out.println("this.a: "+this.a);
            //获取外部类对象的地址值,Inner字节码文件中有一个指向Outer字节码文件的地址值
            System.out.println("OuterA.this.a: "+OuterA.this.a);
        }
    }
}
