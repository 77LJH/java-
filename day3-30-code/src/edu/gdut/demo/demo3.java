package edu.gdut.demo;


import java.util.Random;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        //从左到右
        System.out.println(1+2+"abc"+2+1);
        Scanner sc=new Scanner(System.in);
        // 因为readByBit是一个非静态的成员函数，需要通过对象来调用。
        int num=sc.nextInt();
        demo3 obj=new demo3();
        obj.readByBit(num);
        int[] b=new int[] {1,2,3,4};
        int[] c={1,2,3,4};
        int[] d=new int[4];
        Random e=new Random();
    }
    public static void readByBit(int num) {
        if (num < 0) {
            System.out.println("-");
            readByBit(-num);
        } else if (num < 10)
            System.out.println(num);
        else {
            readByBit(num / 10);
            System.out.println(num % 10);
        }
    }
}
