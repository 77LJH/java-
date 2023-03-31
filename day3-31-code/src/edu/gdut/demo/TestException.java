package edu.gdut.demo;

public class TestException {
    public static void main(String[] args) {
        int i=0;
        String[] greetings=new String[] {"hello world","no,i mean it","goodbye"};
        //打印
        try{
            while(i<4){
                System.out.println(greetings[i]);
                i++;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
        finally{
            System.out.println("处理完毕");
        }
        System.out.println("end");
    }
}

