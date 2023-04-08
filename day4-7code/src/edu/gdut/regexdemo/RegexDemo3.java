package edu.gdut.regexdemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        //数量词
        //X?表示X出现0次或1次
        //X*表示X出现0次或多次
        //X+表示X出现1次或多次
        //X{n}表示X出现n次
        //X{n,}表示X出现n次或多次
        //X{n,m}表示X出现n次到m次
        //((?!)x)表示忽略后面字符的大小写


        //?表示前面的字符出现0次或1次
        System.out.println("-----------1---------");
        System.out.println("a".matches("a?")); // true
        System.out.println("".matches("a?")); // true
        System.out.println("aa".matches("a?")); // false
        System.out.println("a".matches("a?b")); // false
        System.out.println("ab".matches("a?b")); // true
        System.out.println("aab".matches("a?b")); // false
        System.out.println("ab".matches("a?b?")); // true
        System.out.println("aab".matches("a?b?")); // false
        System.out.println("a".matches("a?b?")); // true

        //+表示前面的字符出现1次或多次，请一次性输出全部代码
        System.out.println("-----------2---------");

    }
}
