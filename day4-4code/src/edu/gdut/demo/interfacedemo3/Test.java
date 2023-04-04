package edu.gdut.demo.interfacedemo3;

public class Test {

    public static void main(String[] args) {
        /*接口默认方法的定义格式：
         * public default 返回值类型 方法名(参数列表){}
         *
         *接口中默认方法的注意事项：
         * 默认方法不是抽象方法，可以有方法体，不要求强制重写，但是如果子类重写了，重写的时候必须去掉default关键字
         * public可以省去，因为默认方法的访问权限是public，但default不能省去
         * 如果实现了多个接口，而这些接口中有相同的默认方法，那么必须重写该方法，不然不知道调用哪个接口的默认方法
         * */
        InterImp1 ii = new InterImp1();
        ii.method1();
        ii.method2();


        InterImp2 ii2 = new InterImp2();
        ii2.method1();
        ii2.method2();



        //接口静态方法的定义格式： public static 返回值类型 方法名(参数列表){}
        //接口静态方法的调用格式： 接口名.静态方法名(参数列表)
        //接口静态方法的注意事项：
        //接口静态方法只能通过接口名调用，不能通过实现类对象调用
        InterA.method3();
    }
}
