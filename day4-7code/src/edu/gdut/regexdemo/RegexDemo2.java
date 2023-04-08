package edu.gdut.regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        //预定义字符类(只匹配一个字符)

        //.表示任意字符
        System.out.println("-----------1---------");
        System.out.println("a".matches(".")); // true
        System.out.println("1".matches(".")); // true
        System.out.println("-".matches(".")); // true
        System.out.println(" ".matches(".")); // true
        System.out.println("".matches(".")); // false
        System.out.println("ab".matches(".")); // false

        // \d只能表示任意的一位数字: [0-9]
        System.out.println("-----------2---------");
        System.out.println("1".matches("\\d")); // true
        System.out.println("a".matches("\\d")); // false
        System.out.println("1a".matches("\\d")); // false
        System.out.println("1a".matches("\\d\\d")); // false
        System.out.println("11".matches("\\d\\d")); // true

        // \D只能表示任意的一位非数字: [^0-9]
        System.out.println("-----------3---------");
        System.out.println("1".matches("\\D")); // false
        System.out.println("a".matches("\\D")); // true
        System.out.println("1a".matches("\\D")); // false
        System.out.println("1a".matches("\\D\\D")); // false
        System.out.println("11".matches("\\D\\D")); // false

        // \s只能表示任意的一位空白字符: [\t\n\x0B\f\r]
        System.out.println("-----------4---------");
        System.out.println(" ".matches("\\s")); // true
        System.out.println("a".matches("\\s")); // false
        System.out.println(" a".matches("\\s")); // false
        System.out.println(" a".matches("\\s\\s")); // false
        System.out.println("  ".matches("\\s\\s")); // true

        // \S只能表示任意的一位非空白字符: [^\s]
        System.out.println("-----------5---------");
        System.out.println(" ".matches("\\S")); // false
        System.out.println("a".matches("\\S")); // true
        System.out.println(" a".matches("\\S")); // false
        System.out.println(" a".matches("\\S\\S")); // false
        System.out.println("  ".matches("\\S\\S")); // false
        System.out.println("ab".matches("\\S\\S")); // true

        // \w只能表示任意的一位字母或数字或下划线: [a-zA-Z_0-9]
        System.out.println("-----------6---------");
        System.out.println("a".matches("\\w")); // true
        System.out.println("1".matches("\\w")); // true
        System.out.println("_".matches("\\w")); // true
        System.out.println("a1".matches("\\w")); // false
        System.out.println("a1".matches("\\w\\w")); // true
        System.out.println(" ".matches("\\w")); // false
        System.out.println(".,".matches("\\w\\w")); // false

        // \W只能表示任意的一位非(字母或数字或下划线): [^\w]
        System.out.println("-----------7---------");
        System.out.println("a".matches("\\W")); // false
        System.out.println("1".matches("\\W")); // false
        System.out.println("_".matches("\\W")); // false
        System.out.println("a1".matches("\\W")); // false
        System.out.println("a1".matches("\\W\\W")); // false
        System.out.println(" ".matches("\\W")); // true
        System.out.println(".,".matches("\\W\\W")); // true
    }
}
