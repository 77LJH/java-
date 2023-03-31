package edu.gdut.demo;

import java.util.StringJoiner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //使用StringBuilder的场景
        //1.字符串拼接
        //2.字符串反转
        //使用stringJoiner的场景
        //1.字符串拼接,可以指定分隔符，开始符，结束符
        //2.字符串分割


        StringBuilder sb = new StringBuilder("alpha---beta");
        sb.append("gamma").append("delta");
        System.out.println("sb:" + sb);
        sb.reverse();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());
        System.out.println("sb.capacity():" + sb.capacity());
        System.out.println(sb.toString());

        //判断一个字符串是否为回文
        String s = "abccba";
        StringBuilder sb1 = new StringBuilder(s);
        sb1.reverse();
        String s1 = sb1.toString();
        System.out.println(s.equals(s1));

        //拼接字符串
        String s2 = "abc";
        String s3 = "def";
        String s4 = s2 + s3;
        System.out.println(s4);
        StringBuilder sb2 = new StringBuilder(s2);
        sb2.append(s3);
        System.out.println(sb2.toString());

        //调用函数把数组如int[] a{1,2,3}转换成字符串[1,2,3]
        int[] a = {1,2,3};
        System.out.println(arrayToString(a));
        System.out.println(arrayToString1(a));

        //字符串相关类的底层原理
        String s5 = "abc";//记录串池的地址值
        String s6 = "ab";
        String s7 = "c";
        String s8 = s6 + s7;
        System.out.println(s5 == s8); //false
        //s5和s8都是引用类型，s5是串池的地址值，s8是堆内存的地址值
        //字符串拼接如果有变量参与，那么就会在堆内存中创建一个新的字符串：
        //JDK8之前：在堆内存中创建一个StringBuilder对象，然后把s6和s7拼接到StringBuilder中，最后调用toString()方法，把StringBuilder转换成String
        //JDK8之后：系统会预估要字符串拼接后的大小，把要拼接的内容都放到一个byte[]数组中，然后调用String的构造器，把byte[]数组转换成String

        String s9 = "abc";
        String s10 = "a"+"b"+"c";//复用常量池中的字符串
        System.out.println(s9 == s10); //true
        //编译成class文件后就会把s10拼接成"abc"，所以s9和s10都是串池的地址值
    }

    //创建一个函数把数组如int[] a{1,2,3}转换成字符串[1,2,3]
    public static String arrayToString(int[] a) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                sb.append(a[i]).append("]");
            } else {
                sb.append(a[i]).append(",");
            }
        }
        return sb.toString();
    }
    //体验stringJoiner
    public static String arrayToString1(int[] a) {
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < a.length; i++) {
            sj.add(a[i]+"");
        }
        return sj.toString();
    }
}
