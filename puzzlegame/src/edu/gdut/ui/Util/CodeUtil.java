package edu.gdut.ui.Util;

import edu.gdut.demo.Test1;

import java.util.Random;

public class CodeUtil {
     public static String generateCode() {
        //创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();

        //创建一个随机数对象
        Random random = new Random();

        //创建一个字符串，包含所有的字母
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //创建一个字符串，包含所有的数字
        String num = "0123456789";

        //循环4次，生成4个随机字母
        for(int i=0;i<4;i++){
            //随机生成一个下标
            int index = random.nextInt(str.length());
            //根据下标获取对应的字符
            char ch = str.charAt(index);
            //将字符添加到StringBuilder中
            sb.append(ch);
        }

        //循环2次，生成2个随机数字
        for(int i=0;i<2;i++){
            //随机生成一个下标
            int index = random.nextInt(num.length());
            //根据下标获取对应的字符
            char ch = num.charAt(index);
            //将字符添加到StringBuilder中
            sb.append(ch);
        }

        //引用Test1类中的disorganize方法，将验证码打乱并返回验证码
        return Test1.disorgniaze(sb.toString());
    }

}
