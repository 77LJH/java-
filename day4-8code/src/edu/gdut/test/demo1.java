package edu.gdut.test;

import java.util.ArrayList;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        while(true){
            String str=sc.nextLine();
            //先用正则表达式判断输入的是否是合法数字
            if(str.matches("[1-9]\\d+")){
                //将字符串转换为int类型
                int num=Integer.parseInt(str);
                //将数字添加到集合中
                list.add(num);
            }else{
                //如果输入的不是数字，就退出循环
                System.out.println("输入的不是合法数字");
                break;
            }
    }
}
}
