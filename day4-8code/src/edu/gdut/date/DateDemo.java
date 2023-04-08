package edu.gdut.date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        // 1.创建一个Date对象
        Date date = new Date();
        System.out.println(date);

        // 2.创建一个Date对象表示指定时间,单位是毫秒，从1970年1月1日8时0分0秒开始
        Date date2 = new Date(9000L); // 中国在东八区，所以会多8个小时
        System.out.println(date2);

        // 3.setTime()方法，从1970年1月1日0时0分0秒开始，设置毫秒值
        date.setTime(1000L);
        System.out.println(date);

        // 4.获取当前时间的毫秒值，从1970年1月1日0时0分0秒开始
        long time = date.getTime();
        System.out.println(time);
    }
}
