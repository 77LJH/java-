package edu.gdut.demo;

public class GirlFriend {
    private String name;
    private String gender;
    private  int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public  String getGender(){
        return gender;
    }
    public void setAge(int age){
        if(age>18 && age<50)
            this.age=age;
        else
            System.out.println("非法参数");
    }
    public int getAge(){
         return age;
    }

    public GirlFriend(String name,String gender,int age){
        // 构造方法交由虚拟机自动调用。
        // 建议任何时候都自己手动加上有参构造和无参构造方法
        this.name=name;
        this.gender=gender;
        if(age>18 && age<50)
            this.age=age;
        else
            System.out.println("非法参数");
    }

    public GirlFriend(){
        // 为什么还要保留上面的set方法呢？因为有时候创建对象时没有初值;当有参构造方法没有时，这个无参构造方法默认生成，且交由虚拟机自动调用
        System.out.println("看看我执行了没有？执行了");
    }
}
