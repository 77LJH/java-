package edu.gdut.demo;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend girl=new GirlFriend();
        girl.setName("mayi");
        girl.setGender("female");
        girl.setAge(-18);
        System.out.println(girl.getName());
        System.out.println(girl.getGender());
        System.out.println(girl.getAge());

        System.out.println("----------");

        GirlFriend girl1=new GirlFriend("mayihhhh","female",20);
        System.out.println(girl1.getName());
        System.out.println(girl1.getGender());
        System.out.println(girl1.getAge());
    }
}
