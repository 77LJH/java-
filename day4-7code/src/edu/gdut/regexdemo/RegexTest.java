package edu.gdut.regexdemo;

public class RegexTest {
    public static void main(String[] args) {
        /*需求
        请编写正则表达式验证用户输入的手机号码是否合法
        1.手机号码必须是11位
        2.手机号码必须以1开头
        3.手机号码必须是数字
        4.手机号码必须是13,15,18开头
        */
        String regex1 = "1[358]\\d{9}";
        //测试用例：
        String phone1 = "13812345678"; // true
        String phone2 = "1381234567"; // false
        String phone3 = "23812345678"; // false
        String phone4 = "1381234567a"; // false

        System.out.println("-----------1---------");
        System.out.println(phone1.matches(regex1));
        System.out.println(phone2.matches(regex1));
        System.out.println(phone3.matches(regex1));
        System.out.println(phone4.matches(regex1));

        /*需求
        请编写正则表达式验证用户输入的邮箱地址是否合法
        1.邮箱地址必须包含@符号
        2.邮箱地址@符号前面的字符必须是字母或数字或下划线
        3.邮箱地址@符号后面的字符必须是字母或数字或下划线
        4.邮箱地址@符号后面的字符必须是字母
         */
        //解读下面的正则表达式
        // \w+ 匹配任意的字母或数字或下划线，至少出现一次
        // [\\w+&&[^_]]{2,6} 匹配任意的字母或数字或下划线，至少出现2次，最多出现6次
        String regex2 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        //测试用例：
        String email1 = "3232323@qq.com"; // true
        String email2 = "zhangsan@itcast.cnn"; // true
        String email3 = "dle@itcast"; // false
        String email4 = "dle@itcast."; // false
        String email5 = "hello@163.com.cn"; // true

        System.out.println("-----------2---------");
        System.out.println(email1.matches(regex2));
        System.out.println(email2.matches(regex2));
        System.out.println(email3.matches(regex2));
        System.out.println(email4.matches(regex2));
        System.out.println(email5.matches(regex2));

        //24小时制时间的正则表达式
//        String regex3 = "(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        String regex3 = "(?:[01]\\d|2[0-3])(:[0-5]\\d){2}";
        //测试用例：
        String time1 = "23:59:59"; // true
        String time2 = "24:59:59"; // false
        String time3 = "23:60:59"; // false
        String time4 = "23:59:60"; // false
        String time5 = "23:59"; // false

        System.out.println("-----------3---------");
        System.out.println(time1.matches(regex3));
        System.out.println(time2.matches(regex3));
        System.out.println(time3.matches(regex3));
        System.out.println(time4.matches(regex3));
        System.out.println(time5.matches(regex3));

        //身份证号码的正则表达式
        //String regex4 = "[1-9]\\d{14}(\\d{2}[0-9xX])?";
        String regex4 = "[1-9]\\d{5}(19|18|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])(\\d{2}[0-9xX])?";
        //               [1-9]、\d{5}(?:18|19|20)\\d{2}(?:0\\d|10|11|12)(?:0[1-9]|[1-2]\d|30|31)\d{3}[\dXx]
        //String regex5 = "\\d{15,17}";
        //测试用例：
        String id1 = "11010119903101123"; // false
        String id2 = "1101012190010112x"; // false
        String id3 = "1101011990014112X"; // false
        String id4 = "11010119900101123"; // true
        String id5 = "11010119900101123xx"; // false

        System.out.println("-----------4---------");
        System.out.println(id1.matches(regex4));
        System.out.println(id2.matches(regex4));
        System.out.println(id3.matches(regex4));
        System.out.println(id4.matches(regex4));
        System.out.println(id5.matches(regex4));

        //忽略大小写的书写方式
        String regex5 = "h(?i)ello";
        String regex6 = "h((?i)el)lo";
        //测试用例：
        String str1 = "hello";
        String str2 = "Hello";
        String str3 = "HELLO";
        String str4 = "hEllo";
        String str5 = "hELlo";

        System.out.println("-----------5---------");
        System.out.println(str1.matches(regex5));
        System.out.println(str2.matches(regex5));
        System.out.println(str3.matches(regex5));
        System.out.println(str4.matches(regex5));
        System.out.println(str5.matches(regex5));

        System.out.println("-----------6---------");
        System.out.println(str1.matches(regex6));
        System.out.println(str2.matches(regex6));
        System.out.println(str3.matches(regex6));
        System.out.println(str4.matches(regex6));
        System.out.println(str5.matches(regex6));

    }
}
