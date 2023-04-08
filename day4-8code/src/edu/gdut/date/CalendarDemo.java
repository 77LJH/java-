package edu.gdut.date;

import java.text.ParseException;
import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) throws ParseException {
        //Calendar类的使用
        //1.创建Calendar对象
        //2.调用Calendar对象的get方法，获取年月日时分秒
        //3.调用Calendar对象的set方法，设置年月日时分秒
        //4.调用Calendar对象的add方法，增加年月日时分秒
        //5.调用Calendar对象的getTime方法，将Calendar对象转换为Date对象
        //6.调用Calendar对象的setTime方法，将Date对象转换为Calendar对象

        //1.创建Calendar对象,它是一个抽象类，所以不能直接创建对象，可以通过getInstance方法获取
        Calendar c = Calendar.getInstance();
        //2.调用Calendar对象的get方法，获取年月日时分秒
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println(year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒");

        //3.调用Calendar对象的set方法，设置年月日时分秒
        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.MONTH, 10);
        c.set(Calendar.DAY_OF_MONTH, 10);
        c.set(Calendar.HOUR_OF_DAY, 10);
        c.set(Calendar.MINUTE, 10);
        c.set(Calendar.SECOND, 10);
        System.out.println(c.get(Calendar.YEAR) + "年" + c.get(Calendar.MONTH) + "月" + c.get(Calendar.DAY_OF_MONTH) + "日" + c.get(Calendar.HOUR_OF_DAY) + "时" + c.get(Calendar.MINUTE) + "分" + c.get(Calendar.SECOND) + "秒");

        //4.调用Calendar对象的add方法，增加年月日时分秒
        c.add(Calendar.YEAR, 2);
        c.add(Calendar.MONTH, 2);
        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR_OF_DAY, 2);
        c.add(Calendar.MINUTE, 2);
        c.add(Calendar.SECOND, 2);
        System.out.println(c.get(Calendar.YEAR) + "年" + c.get(Calendar.MONTH) + "月" + c.get(Calendar.DAY_OF_MONTH) + "日" + c.get(Calendar.HOUR_OF_DAY) + "时" + c.get(Calendar.MINUTE) + "分" + c.get(Calendar.SECOND) + "秒");

    }
}
