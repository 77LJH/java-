package edu.gdut.demo;

public class OverloadDemo {
    //方法的重载:Java中方法的重载，就是在同一个类中，有相同的方法名称，但形参不同的方法。
    //方法重载的规则:
    //方法名称必须相同
    //参数列表必须不同（参数个数不同、或参数类型不同、参数排列顺序不同等）。
    //方法的返回类型可以相同也可以不相同。
    //仅仅返回类型不同，不足以称为方法的重载。
    //同一个类中，不允许两个方法的方法名称和参数列表都相同
    //注:方法重载与修饰符和返回值类型无关， 与参数的名称无关，只与参数列表的个数，类型，顺序相关
    //典型的方法重载：println()方法，构造方法
    public static void main(String[] args) {
        //传入的实参为3个整型数据，匹配到第一个max方法
        int max_value1 = max(10,20);
        System.out.println(max_value1);

        //传入的实参为3个整型数据，匹配到第二个max方法，而不是第一个
        int max_value2 = max(10,25,7);
        System.out.println(max_value2);

        //传入的实参为2个浮点数，匹配到第三个max方法
//        int max_value3 = (int)max(10.0,30.0);   //返回值类型为double， 高-->低 : 强制转换
        double max_value3 = max(10.0,30.0);
        System.out.println(max_value3);
    }

    public static int max(int num1,int num2){
        int result = 0;
        if (num1==num2){
            System.out.println("num1==num2");
            return 0;//终止该方法
        }
        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }

        return result;
    }
    //##################注释分割线#################
    public static int max(int num1,int num2,int num3){
        int result = 0;
        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }
        return result > num3 ? result:num3;
    }
    //##################注释分割线#################
    public static double max(double num1,double num2){
        double result = 0.0;
        if (num1==num2){
            System.out.println("num1==num2");
            return 0;//终止该方法
        }
        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }

        return result;
    }

}
