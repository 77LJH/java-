package edu.gdut.ui.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame{
    public MyJFrame3(){
        //设置标题
        this.setTitle("拼图游戏");
        //设置大小
        this.setSize(603, 680);
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置关闭按钮
        //DO_NOTHING_ON_CLOSE：点击关闭但不做任何操作 0
        //HIDE_ON_CLOSE：点击关闭隐藏界面 1 默认
        //DISPOSE_ON_CLOSE：点击关闭释放资源 2 ，如果你有很多界面，只有当你关闭最后一个界面时才会关闭虚拟机 如果你的界面有很多资源，比如数据库连接，网络连接，文件连接，那么这个选项就很有用
        //EXIT_ON_CLOSE：点击关闭退出程序 3 ，只要关掉一个界面，整个程序就会退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体的布局管理器，取消默认的居中布置，改为绝对布局，只有取消了默认的居中布局，才能设置组件的xy位置
        this.setLayout(null);



        //给整个窗体添加键盘监听器
        //调用者：this，本类对象，也就是窗体对象，表示给窗体添加键盘监听器
        //被调用者：new KeyListener()，匿名内部类，表示添加一个键盘监听器
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("键入键时调用");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("按下键不送时调用");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("松开键时调用");
            }
        });

        this.setVisible(true);
    }
}
