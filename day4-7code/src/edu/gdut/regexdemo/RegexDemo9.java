package edu.gdut.regexdemo;

public class RegexDemo9 {
    public static void main(String[] args) {
         /*
            有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1:把字符串中三个姓名之间的字母替换为vs
            要求2:把字符串中的三个姓名切割出来*/

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";

        //细节:
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就用第一个参数去替换。
        // \\w表示匹配字母数字下划线
        System.out.println("-----------1---------");
        String s1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(s1);

        //细节:
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就切割。
        //参数regex表示正则表达式。可以将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。
        System.out.println("-----------2---------");
        String[] s2 = s.split("[\\w&&[^_]]+");
        for(String s3 : s2) {
            System.out.println(s3);
        }
    }
}
