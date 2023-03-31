package edu.gdut.demo;

import java.util.Scanner;
import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        while(true){
            System.out.println("请输入一个整数：");
            num = sc.next();
            boolean flag=checkStr(num);
            if(flag){
                break; //输入的字符串符合规则，跳出循环
            }
            else{
                System.out.println("输入的字符串不符合规则，请重新输入！");
            }
        }
        System.out.println(toRoman(num)); //把字符串转换成罗马数字
    }
    public static String toRoman(String s){
        StringJoiner sj = new StringJoiner(" ");
        //罗马数字1-9对应的字符
        String[] chs={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        for(int i=0;i<s.length();i++){
            int num = s.charAt(i)-'0';
            sj.add(chs[num]);
        }
        return sj.toString();
    }
    public static boolean checkStr(String s){
        if(s==null||s.length()==0||s.length()>9){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
}
