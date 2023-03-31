package edu.gdut.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsTest {
    public static void f() throws NullPointerException {
        /*NullPointerException是Java中的一种运行时异常，通常发生在试图访问一个空对象或空引用时。也就是说，当一个对象为null，
        而又试图调用该对象的某个方法或访问它的某个属性时，就会抛出NullPointerException异常。*/
        String str=null;
        int strLength=str.length();
        System.out.println(strLength);
    }

    //我们使用了throw关键字，当除数为0时，我们手动抛出了一个ArithmeticException异常，这个异常会在程序运行时被抛出，然后在后续的异常处理流程中被捕获并处理。
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return dividend / divisor;
    }

    //我们在方法声明中使用了throws关键字，并声明了该方法可能会抛出IOException异常。
    public static String readFile(String path) throws IOException {
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        reader.close();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        /*throw关键字用于在程序中手动抛出异常，而throws关键字用于在方法声明中指定该方法可能抛出的异常类型。
        通常情况下，我们会在方法中使用try-catch语句捕获异常并处理，而使用throws关键字将方法可能抛出的异常类型声明出来，则可以将异常处理的责任交给调用方。*/
        try{
            f();
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException 异常");
        }
        //调用除法函数
        try{
            int result=divide(4,0);
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException 异常");
        }
        //
    }
}
