package edu.gdut.mathdemo;

import java.util.Random;

public class MathDemo1 {
    //Math类中的方法都是静态的,所以可以直接通过类名调用,属于工具类
    public static void main(String[] args) {
        //abs()取绝对值
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(10.5));
        System.out.println(Math.abs(-10.5));
        System.out.println(Math.abs(0.0));
        System.out.println("===============");
        //bug:
        //以int为例，取值范围是-2147483648~2147483647
        //如果传入的是-2147483648，那么就会出现bug
//        System.out.println(Math.abs(-2147483648));
//        System.out.println(Math.absExact(-2147483648));

        //ceil()向上取整
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.9));
        System.out.println(Math.ceil(10.0));
        System.out.println(Math.ceil(-10.1));
        System.out.println(Math.ceil(-10.9));
        System.out.println(Math.ceil(-10.0));
        System.out.println("===============");

        //floor()向下取整
        System.out.println(Math.floor(10.1));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.0));
        System.out.println(Math.floor(-10.1));
        System.out.println(Math.floor(-10.9));
        System.out.println(Math.floor(-10.0));
        System.out.println("===============");

        //rint()四舍五入，返回double
        System.out.println(Math.rint(10.1));
        System.out.println(Math.rint(10.9));
        System.out.println(Math.rint(10.0));
        System.out.println(Math.rint(-10.1));
        System.out.println(Math.rint(-10.9));
        System.out.println(Math.rint(-10.0));
        System.out.println("===============");

        //round()四舍五入,取long
        System.out.println(Math.round(10.1));
        System.out.println(Math.round(10.9));
        System.out.println(Math.round(10.0));
        System.out.println(Math.round(-10.1));
        System.out.println(Math.round(-10.9));
        System.out.println(Math.round(-10.0));
        System.out.println("===============");

        //取随机数
        //取0~1之间的随机数[0,1)
        System.out.println(Math.random());

        Random r = new Random();
        //取0~10之间的随机数[0,10],是左闭右开区间
        System.out.println(r.nextInt(10));
    }
}
