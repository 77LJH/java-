package edu.gdut.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        ;
    }

    private static void extracted() throws ParseException {
        //定义一个字符串表示时间
        String str = "2020年10月10日 10:10:10";
        //定义一个SimpleDateFormat对象，用于格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //调用SimpleDateFormat对象的parse方法，将字符串转换为Date对象
        Date date = sdf.parse(str);
        System.out.println(date);
    }

    private static void method() {
        // 1.利用有参构造SimpleDateFormat对象，格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date(0L);
        String str = sdf.format(date);
        System.out.println(str);

        // 2.利用空参构造SimpleDateFormat对象，格式化日期
        SimpleDateFormat sdf2 = new SimpleDateFormat();
        Date date2 = new Date();
        String str2 = sdf2.format(date2);
        System.out.println(str2);

        //课堂练习，yyyy年MM月dd日 HH时:mm分:ss秒 星期
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH时:mm分:ss秒 E");
        Date date3 = new Date();
        String str3 = sdf3.format(date3);
        System.out.println(str3);
    }
}
