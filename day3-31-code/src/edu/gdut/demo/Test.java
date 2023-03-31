package edu.gdut.demo;

public class Test {
    public static void main(String[] args) {
        int i=0;
        String[] greetings=new String[] {"hello world","no,i mean it","goodbye"};
        //打印
        while(i<4){
            System.out.println(greetings[i]);
            i++;
        }
        System.out.println("end");
    }
}
