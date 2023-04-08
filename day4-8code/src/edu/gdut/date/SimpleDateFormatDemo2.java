package edu.gdut.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        //simpleDateFormat的两个使用方法
        //1.将字符串转换为Date对象，调用SimpleDateFormat对象的parse方法
        //2.将Date对象转换为字符串，调用SimpleDateFormat对象的format方法

        String birthday = "1999-10-10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //调用SimpleDateFormat对象的parse方法，将字符串转换为Date对象
        Date date = sdf.parse(birthday);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        //调用SimpleDateFormat对象的format方法，将Date对象转换为字符串
        String str = sdf2.format(date);
        System.out.println(str);
    }
}
