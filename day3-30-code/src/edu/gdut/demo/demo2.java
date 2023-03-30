package edu.gdut.demo;

import java.util.Scanner;



public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println("你输入的整数是：" + num);

        System.out.print("请输入一个浮点数：");
        double numdb = sc.nextDouble();
        System.out.println("你输入的浮点数是：" + numdb);

        System.out.print("请输入一个字符：");
        char c = sc.next().charAt(0);
        System.out.println("你输入的字符是：" + c);

        /*
        根据操作台的信息，可以看到用户成功输入了整数、浮点数和字符。但在输入字符串时，程序没有按预期工作，输出的结果是空字符串。
        这是因为在输入完字符后，按下回车键时，回车键也被作为一个字符输入了，而 Scanner 类的 nextLine() 方法会读取回车键之前的所有字符并返回字符串，
        所以会直接跳过输入字符串的步骤。
        */
        System.out.print("请输入一个字符串：");
        String str = sc.nextLine();
        System.out.println("你输入的字符串是：" + str);

        System.out.println("--------------------");

        /*
        可以使用 next() 方法代替 nextLine() 方法，因为 next() 方法只会读取并返回下一个单词（以非空白字符分隔的字符序列）。
        */
        System.out.print("请输入一个字符串：");
        String str1 = sc.next();
        System.out.println("你输入的字符串是：" + str1);

    }
}
