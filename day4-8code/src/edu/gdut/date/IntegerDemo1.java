package edu.gdut.date;

import java.util.Scanner;

public class IntegerDemo1 {
    public static void main(String[] args) {
//        //将字符串转换为整数
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int num = sc.nextInt();
//        System.out.println("输入的整数是：" + num);
//
//        //将整数转换为字符串
//        String str = Integer.toString(num);
//        System.out.println("转换后的字符串是：" + str);
//
//        //输入字符串
//        System.out.println("请输入一个字符串：");
//        String str2 = sc.next();
//        System.out.println("输入的字符串是：" + str2);
        //弊端：
        //当我们使用next,nextInt,nextDouble等方法时，遇到空格，回车，制表符时，就结束输入
        //比如输入：123 456，只会接收到123，456会被忽略
        //约定
        //以后想键盘录入数据，不管上面类型的数据，都使用nextLine方法
        //特点遇到回车才停止
        System.out.println("请输入一个字符串：");
        String str3 = sc.nextLine();
        System.out.println("输入的字符串是：" + str3);

        System.out.println("请输入一个整数：");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("输入的整数是：" + num1);

        System.out.println("请输入一个浮点数：");
        double num2 = Double.parseDouble(sc.nextLine());
        System.out.println("输入的浮点数是：" + num2);

    }
}
