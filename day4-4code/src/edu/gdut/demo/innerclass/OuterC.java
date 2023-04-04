package edu.gdut.demo.innerclass;

public class OuterC {
    int b=20;
    public void show(){
        int a=10;
        //局部内部类
        class InnerC{
            String name;
            int age;
            public void show1(){
                System.out.println("a: "+a);
                System.out.println("b: "+b);
                System.out.println("局部内部类的非静态方法");
            }

            public static void show2(){
                System.out.println("局部内部类的静态方法");
            }
        }
        InnerC innerC=new InnerC();
        System.out.println("innerC.name: "+ innerC.name);
        System.out.println("innerC.age: "+ innerC.age);
        innerC.show1();
        InnerC.show2();
    }
}
