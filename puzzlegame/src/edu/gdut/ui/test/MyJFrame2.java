package edu.gdut.ui.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    public MyJFrame2() {
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


        //
        JButton jButton = new JButton("鼠标监听机制--按钮");
        jButton.setBounds(100, 100, 100, 100);
        jButton.addMouseListener(this);
        this.getContentPane().add(jButton);

        this.setVisible(true);
}

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标划出");
    }
}
