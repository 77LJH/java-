package edu.gdut.ui.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame1 extends JFrame{
    public MyJFrame1() {
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




        JButton jButton = new JButton("别点我");
        //设置按钮的位置和大小
        jButton.setBounds(100, 400, 100, 40);
        jButton.addActionListener(e -> {
            jButton.setLocation((int) (Math.random()*300), (int) (Math.random()*450));
        });
        this.getContentPane().add(jButton);




        JButton jButton2 = new JButton("点我啊");
        //设置按钮的位置和大小
        jButton2.setBounds(300, 400, 100, 40);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("嘿嘿嘿");
            }
        });

        this.getContentPane().add(jButton);
        this.getContentPane().add(jButton2);

        this.setVisible(true);
    }
}
