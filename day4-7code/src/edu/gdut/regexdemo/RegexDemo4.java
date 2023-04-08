package edu.gdut.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {
        //正则表达式：爬虫
        /* 有如下文本，请按照要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
                要求:找出里面所有的JavaXX
         */

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //Pattern:正则表达式  Matcher:文本匹配器，作用：按照正则表达式匹配文本
        //获取正则表达式的对象
        Pattern pattern = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器对象
        Matcher matcher = pattern.matcher(str);
        //matcher.find()拿着文本匹配器对象去匹配文本，寻找是否有符合正则表达式的子串
        //find()方法：如果找到了符合正则表达式的子串，就返回true，且在底层会记录子串的起始索引和结束索引+1，否则返回false
        while(matcher.find()){
            //group()方法：会根据底层记录的子串的索引进行字符串的截取，返回截取的子串
            //substring(起始索引,结束索引+1);左闭右开
            System.out.println(matcher.group());
        }
    }
}
