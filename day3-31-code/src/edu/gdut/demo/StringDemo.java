package edu.gdut.demo;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        char[] chs= {'a', 'b', 'c'};
        String s1 = new String(chs);
        System.out.println(s1);

        byte bytes[] = {97, 98, 99};
        String s2 = new String(bytes);
        System.out.println(s2);
        System.out.println("===============");

        //string s="abc" 复用字符串常量池中的对象
        String s3 = "abc";
        String s4= "abc";
        System.out.println(s3==s4);//对于基本数据类型==比较的是数值，对于引用数据类型==比较的是地址值
        System.out.println(s3.equals(s4));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();//这也是通过new创建的对象
        System.out.println(s==s3);
        System.out.println(s==s4);
        System.out.println(s.equals(s3));
        System.out.println(s.equals(s4));
        System.out.println("===============");

        //new的对象是在堆内存，开辟了新的空间
        String s5 = new String("abc");
        String s6="abc";
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));
        System.out.println("===============");

        String s7 = "abc";
        String s8 = "AbC";
        System.out.println(s7.equals(s8));
        System.out.println(s7.equalsIgnoreCase(s8));
        System.out.println("===============");

        // 键盘输入一个字符串，然后依次打印出字符串中的每个字符
        System.out.println("请输入一个字符串：");
        String s9 = sc.next();
        for (int i = 0; i < s9.length(); i++) {
            System.out.println(s9.charAt(i));
        }
        System.out.println("===============");

        //手机号屏蔽
        String s10="15812345678";
        System.out.println(s10.substring(0, 3)+"****"+s10.substring(7, 11));

        //通过身份证读取信息
        String s11="510623199912121234";
        System.out.println("出生年月日： "+s11.substring(6, 10)+"年"+s11.substring(10, 12)+"月"+s11.substring(12, 14)+"日");
        System.out.println("性别： "+(s11.charAt(16)%2==0?"女":"男"));

        //敏感词的替换
        String s12="你是什么品种的sb啊";
        //定义一个敏感库
        String[] str = {"mlgb","sb","傻吊","cnm","mlgb"};
        for (int i = 0; i < str.length; i++) {
            s12 = s12.replace(str[i], "***");
        }
        System.out.println(s12);
        //字串包含
        String s13="你是什么品种的傻逼啊";
        String s14="傻逼";
        System.out.println(s13.contains(s14));
        //字串的拆分
        String s15="你是什么品种的傻逼啊";
        String[] str1 = s15.split("什么");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }


    }


}
