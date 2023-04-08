package edu.gdut.regexdemo;

public class RegexDemo11 {
    public static void main(String[] args) {
        String str = "我要学学编编编编程程程程程程";

        //需求:把重复的内容 替换为 单个的
        //学学                学
        //编编编编            编
        //程程程程程程        程
        //  (.)表示把重复内容的第一个字符看做一组
        //  \\1表示第一字符再次出现
        //  + 至少一次
        //  $1 表示把正则表达式中第一组的内容，再拿出来用
        String s = str.replaceAll("(.)\\1+", "$1");
        System.out.println(s);

        //身份证号码的简易正则表达式
        //非捕获分组:仅仅是把数据括起来
        //特点:不占用组号
        //这里\\1报错原因:(?:)就是非捕获分组，此时是不占用组号的。

        //(?:) (?=) (?!)都是非捕获分组//更多的使用第一个
        //String regex1 ="[1-9]\\d{16}(?:\\d|x|x)\\1";
                String regex2 ="[1-9]\\d{16}(\\d Xx)\\1";
        //^([01]\d|2[0-3]):[0-5]\d:[@-5]\d$

        System.out.println("41080119930228457x".matches(regex2));
    }
}
