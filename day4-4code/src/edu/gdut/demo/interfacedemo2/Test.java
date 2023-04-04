package edu.gdut.demo.interfacedemo2;

public class Test {
    public static void main(String[] args) {
        PingPongSpoter pps=new PingPongSpoter("张三",20);
        pps.study();
        pps.speakEnglish();
        System.out.println(pps);

        BasketballPlayer bp=new BasketballPlayer("李四",21);
        bp.study();
        System.out.println(bp);

    }
}
