package edu.gdut.regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        //正则表达式的作用：用来匹配字符串；在文本中查找匹配的字符串

        //字符类(只匹配一个字符)
        //只能是a  b  c
        System.out.println("-----------1---------");
        System.out.println("a".matches("[abc]")); // true
        System.out.println("b".matches("[abc]")); // true
        System.out.println("c".matches("[abc]")); // true
        System.out.println("d".matches("[abc]")); // false

        System.out.println("ab".matches("[abc]")); // false,一个[]表示一个字符
        System.out.println("ab".matches("[abc][abc]")); // true

        //不能出现a  b  c
        System.out.println("-----------2---------");
        System.out.println("a".matches("[^abc]")); // false
        System.out.println("b".matches("[^abc]")); // false
        System.out.println("c".matches("[^abc]")); // false
        System.out.println("d".matches("[^abc]")); // true

        System.out.println("ab".matches("[^abc]")); // false,一个[]表示一个字符
        System.out.println("ab".matches("[^abc][^abc]")); // false
        System.out.println("zz".matches("[^abc][^abc]")); // true

        //a-z A-Z (包括头尾的字符)
        System.out.println("-----------3---------");
        System.out.println("a".matches("[a-zA-Z]")); // true
        System.out.println("A".matches("[a-zA-Z]")); // true
        System.out.println("z".matches("[a-zA-Z]")); // true
        System.out.println("Z".matches("[a-zA-Z]")); // true
        System.out.println("0".matches("[a-zA-Z]")); // false
        System.out.println("9".matches("[a-zA-Z]")); // false

        System.out.println("ab".matches("[a-zA-Z]")); // false,一个[]表示一个字符
        System.out.println("ab".matches("[a-zA-Z][a-zA-Z]")); // true

        //[a-d[m-p]]表示a-d或m-p
        System.out.println("-----------4---------");
        System.out.println("a".matches("[a-d[m-p]]")); // true
        System.out.println("d".matches("[a-d[m-p]]")); // true
        System.out.println("m".matches("[a-d[m-p]]")); // true
        System.out.println("p".matches("[a-d[m-p]]")); // true
        System.out.println("q".matches("[a-d[m-p]]")); // false

        System.out.println("ab".matches("[a-d[m-p]]")); // false,一个[]表示一个字符
        System.out.println("ab".matches("[a-d[m-p]][a-d[m-p]]")); // true

        //[a-z&&[defA]]表示a-z且defA: d e f
        System.out.println("-----------5---------");
        System.out.println("d".matches("[a-z&&[def]]")); // true
        System.out.println("e".matches("[a-z&&[def]]")); // true
        System.out.println("f".matches("[a-z&&[def]]")); // true
        System.out.println("a".matches("[a-z&&[def]]")); // false
        System.out.println("A".matches("[a-z&&[def]]")); // false

        //[a-z&&[^def]]表示a-z且非def，等同于[ad-z] : a b c g h i j k l m n o p q r s t u v w x y z
        System.out.println("-----------6---------");
        System.out.println("a".matches("[a-z&&[^def]]")); // true
        System.out.println("d".matches("[a-z&&[^def]]")); // false
        System.out.println("e".matches("[a-z&&[^def]]")); // false
        System.out.println("f".matches("[a-z&&[^def]]")); // false
        System.out.println("z".matches("[a-z&&[^def]]")); // true

        //[a-z&&[^m-p]]表示a-z且非(m-p)，等同于[a-lq-z] : a b c d e f g h i j k l q r s t u v w x y z
        System.out.println("-----------7---------");
        System.out.println("a".matches("[a-z&&[^m-p]]")); // true
        System.out.println("m".matches("[a-z&&[^m-p]]")); // false
        System.out.println("n".matches("[a-z&&[^m-p]]")); // false
        System.out.println("o".matches("[a-z&&[^m-p]]")); // false
        System.out.println("p".matches("[a-z&&[^m-p]]")); // false
        System.out.println("z".matches("[a-z&&[^m-p]]")); // true

    }
}
