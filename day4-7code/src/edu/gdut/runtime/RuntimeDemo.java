package edu.gdut.runtime;

public class RuntimeDemo {
    public static void main(String[] args) {
        //获取当前系统的运行环境对象
        Runtime r = Runtime.getRuntime();
        //获取JVM能获得的最大内存
        System.out.println(r.maxMemory()/1024/1024/1024+"GB");
        //获取JVM的空闲内存
        System.out.println(r.freeMemory()/1024/1024+"MB");
        //获取JVM已经从系统中获得的总内存
        System.out.println(r.totalMemory()/1024/1024+"MB");
        //获取当前程序的运行时对象的可用处理器个数
        System.out.println(r.availableProcessors());
        //执行一个系统命令
        try {
            r.exec("notepad");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //停止虚拟机
        r.exit(0);
    }
}
