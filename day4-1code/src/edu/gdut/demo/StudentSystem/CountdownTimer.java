package edu.gdut.demo.StudentSystem;

import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {
        int timeInSeconds = 60; // 设置计时器的时间为60秒
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int countdown = timeInSeconds;
            public void run() {
                System.out.println("Time remaining: " + countdown + " seconds");
                countdown--;
                if (countdown < 0) {
                    timer.cancel();
                    System.out.println("Time is up!");
                }
            }
        }, 0, 1000); // 每隔1秒钟更新一次时间
    }
}
