package edu.gdut.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) {
         /*
            有如下文本，按要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台


            需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
            需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
            需求3:爬取除了版本号为8，11.17的Java文本，
        */
        String s = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和JAva11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是JAVA17，相信在未来不久JAVA17也会逐渐登上历史舞台";


        //需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
        System.out.println("-----------1---------");
        Pattern pattern = Pattern.compile("((?i)Java)(8|11|17)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group().replaceAll("\\d", ""));
        }
        System.out.println("-----------1---------");
        //?理解为前面的内容是Java
        //=表示Java后面要跟随的内容是8，11，17
        //但是在获取的时候，只要Java，不要后面的版本号
        Pattern pattern0 = Pattern.compile("((?i)Java)(?=8|11|17)");
        Matcher matcher0 = pattern0.matcher(s);
        while (matcher0.find()) {
            System.out.println(matcher0.group());
        }

        //需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
        System.out.println("-----------2---------");
        Pattern pattern2 = Pattern.compile("((?i)Java)(8|11|17)");
        Matcher matcher2 = pattern2.matcher(s);
        StringBuilder sb = new StringBuilder();
        while (matcher2.find()) {
            sb.append(matcher2.group()).append(" ");
        }
        System.out.println(sb.toString());

        //需求3:爬取除了版本号为8，11.17的Java文本
        System.out.println("-----------3---------");
        Pattern pattern3 = Pattern.compile("((?i)Java)(?!8|11|17)");
        Matcher matcher3 = pattern3.matcher(s);
        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }
    }
}
