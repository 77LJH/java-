package edu.gdut.mathdemo;

public class MathDemo2 {
    public static void main(String[] args) {
        //统计有多少水仙花数
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            //百位
            int bai = i / 100;
            //十位
            int shi = i / 10 % 10;
            //个位
            int ge = i % 10;
            if (i == Math.pow(bai, 3) + Math.pow(shi, 3) + Math.pow(ge, 3)) {
                System.out.println(i);
                count++;
            }
        }
    }
}
