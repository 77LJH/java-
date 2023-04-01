package edu.gdut.demo;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //调整字符串的内容并比较
        String str1 = "abcde";
        String str2 = "eabcd";
        System.out.println(checkStr(str1, str2));

        //键盘输入字符串，打乱里面的内容
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str3 = sc.next();
        System.out.println(disorgniaze(str3));


        //给定两个字符串形式表示的非负整数num1和num2，计算它们的和
        System.out.println("请输入两个字符串形式表示的非负整数：");
        String num1 = sc.next();
        String num2 = sc.next();
        System.out.println("两个字符串形式表示的非负整数的和为："+add(num1, num2));
    }

    //给定两个字符串形式表示的非负整数num1和num2，计算它们的和
    private static String add(String num1, String num2) {
        //判断非法输入
        if(num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0){
            return null;
        }
        //将字符串形式表示的非负整数转换成整数
        int num3 = strToInt(num1);
        int num4 = strToInt(num2);
        //计算两个整数的和
        int sum = num3 + num4;
        //将整数转换成字符串形式表示的非负整数
        return intToStr(sum);
    }
    //把字符串形式表示的非负整数转换成整数
    public static int strToInt(String str){
        if(str == null || str.length() == 0){
            return 0;
        }
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            num = num*10 + str.charAt(i) - '0';
        }
        return num;
    }
    //把整数转换成字符串形式表示的非负整数
    public static String intToStr(int num){
        if(num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            sb.append(num%10);
            num = num/10;
        }
        return sb.reverse().toString();
    }

    //判断字符串str2是否是str1的旋转词
    public static String checkStr(String str1, String str2){
        if(str1 == null || str2 == null || str1.length() != str2.length()){
            return "false";
        }
        for(int i = 0; i < str1.length(); i++){
            if(str2.equals(str1)){
                return i+"-true";
            }
            str1=rotate(str1);
        }
        return "false";
    }
    //对字符串A进行旋转操作，将字符串最左边的字母移动到最右边
    public static String rotate(String A){
        //判断非法输入或者空字符串和长度为1的字符串
        if(A == null || A.length() == 0 || A.length() == 1){
            return A;
        }
        //将字符串A的第一个字符移动到最后
        StringBuilder sb = new StringBuilder();
        sb.append(A.substring(1));
        sb.append(A.charAt(0));
        return sb.toString();
    }

    //打乱字符串里面的内容
    public static String disorgniaze(String str){
        if(str == null || str.length() == 0 || str.length() == 1){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        //随机生成一个下标，将该下标对应的字符添加到sb中，然后将该字符从str中删除
        while(str.length()>0){
            int index = random.nextInt(str.length());
            sb.append(str.charAt(index));
            str = str.substring(0, index) + str.substring(index+1);
        }
        return sb.toString();
    }

    //
}
