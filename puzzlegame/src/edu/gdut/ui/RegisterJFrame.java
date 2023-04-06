package edu.gdut.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class RegisterJFrame extends JFrame implements ActionListener {

    //创建一个注册按钮
    JButton registerJButton = new JButton();
    //创建一个重置按钮
    JButton resetJButton = new JButton();

    //创建一个用户名输入框，方便后面获取输入的内容
    JTextField userNameJTextField = new JTextField();
    //创建一个密码输入框
    JPasswordField passwordJPasswordField = new JPasswordField();
    //创建一个二次密码输入框
    JPasswordField passwordJPasswordField2 = new JPasswordField();


    public RegisterJFrame() {
        //在创建注册界面的对象的时候，同时给这个界面设置一些信息

        //直接把注册界面显示出来
        initJFrame();

        //在这个页面中添加内容
        initView();

        //设置可见，建议放在最后
        this.setVisible(true);
    }

    private void initView() {
        //1.添加用户名图片
        ImageIcon usernameImage = new ImageIcon("puzzlegame\\image\\register\\注册用户名.png");
        JLabel usernameJLabel = new JLabel(usernameImage);
        //设置图片的xy位置
        usernameJLabel.setBounds(106, 135, 79, 17);
        //把图片添加到界面上
        this.getContentPane().add(usernameJLabel);

        //2.添加注册用户名输入框
        //设置输入框的xy位置
        userNameJTextField.setBounds(195, 134, 200, 30);
        this.getContentPane().add(userNameJTextField);

        //1.添加注册密码图片
        ImageIcon passwordImage = new ImageIcon("puzzlegame\\image\\register\\注册密码.png");
        JLabel passwordJLabel = new JLabel(passwordImage);
        //设置图片的xy位置
        passwordJLabel.setBounds(120, 195, 64, 16);
        //把图片添加到界面上
        this.getContentPane().add(passwordJLabel);

        //2.添加注册密码输入框
        //设置输入框的xy位置
        passwordJPasswordField.setBounds(195, 195, 200, 30);
        this.getContentPane().add(passwordJPasswordField);

        //1.添加再次输入密码图片
        ImageIcon codeImage = new ImageIcon("puzzlegame\\image\\register\\再次输入密码.png");
        JLabel passwordJLabel2 = new JLabel(codeImage);
        //设置图片的xy位置
        passwordJLabel2.setBounds(90, 256, 96, 17);
        //把图片添加到界面上
        this.getContentPane().add(passwordJLabel2);

        //2.添加再次输入密码输入框
        //设置输入框的xy位置
        passwordJPasswordField2.setBounds(195, 256, 200, 30);
        this.getContentPane().add(passwordJPasswordField2);

        //设置按钮的背景图片
        ImageIcon registerImage = new ImageIcon("puzzlegame\\image\\register\\注册按钮.png");
        registerJButton.setIcon(registerImage);
        //设置按钮的位置和大小
        registerJButton.setBounds(123, 310, 128, 47);
        //去除按钮的背景
        registerJButton.setBorderPainted(false);
        //去除按钮的背景
        registerJButton.setContentAreaFilled(false);
        //把按钮添加到界面上
        this.getContentPane().add(registerJButton);

        //设置按钮的背景图片
        ImageIcon resetImage = new ImageIcon("puzzlegame\\image\\register\\重置按钮.png");
        resetJButton.setIcon(resetImage);
        //设置按钮的位置和大小
        resetJButton.setBounds(256, 310, 128, 47);
        //去除按钮的背景
        resetJButton.setBorderPainted(false);
        //去除按钮的背景
        resetJButton.setContentAreaFilled(false);
        //把按钮添加到界面上
        this.getContentPane().add(resetJButton);

        //添加背景图片。先加载的图片放在上面，后加载的图片放在下面
        ImageIcon background = new ImageIcon("puzzlegame\\image\\register\\background.png");
        JLabel jLabel = new JLabel(background);
        jLabel.setBounds(0,0,470,390);
        this.getContentPane().add(jLabel);
    }

    //在创建注册界面的对象的时候，同时给这个界面设置一些信息
    public void initJFrame(){
        //设置标题
        this.setTitle("拼图游戏 V1.0注册界面");
        //设置大小
        this.setSize(488, 430);
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置关闭按钮，这个是关闭整个程序
        //DO_NOTHING_ON_CLOSE：点击关闭但不做任何操作 0
        //HIDE_ON_CLOSE：点击关闭隐藏界面 1 默认
        //DISPOSE_ON_CLOSE：点击关闭释放资源 2 ，如果你有很多界面，只有当你关闭最后一个界面时才会关闭虚拟机 如果你的界面有很多资源，比如数据库连接，网络连接，文件连接，那么这个选项就很有用
        //EXIT_ON_CLOSE：点击关闭退出程序 3 ，只要关掉一个界面，整个程序就会退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体的布局管理器，取消默认的居中布置，改为绝对布局，只有取消了默认的居中布局，才能设置组件的xy位置
        this.setLayout(null);

        //设置按钮的监听事件
        registerJButton.addActionListener(this);
        resetJButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == registerJButton){
            //获取用户名
            String userName = userNameJTextField.getText();
            //获取密码
            String password = new String(passwordJPasswordField.getPassword());
            //获取二次密码
            String password2 = new String(passwordJPasswordField2.getPassword());
            //判断用户名是否为空
            if(userName.equals("")){
                //弹出提示框：用户名不能为空
                JOptionPane.showMessageDialog(this,"用户名不能为空");
                return;
            }//判断密码是否为空
            else if(password.equals("")){
                //弹出提示框：密码不能为空
                JOptionPane.showMessageDialog(this,"密码不能为空");
                return;
            }//判断二次密码是否为空
            else if(password2.equals("")){
                //弹出提示框：二次密码不能为空
                JOptionPane.showMessageDialog(this,"二次密码不能为空");
                return;
            }//判断两次密码是否一致
            else if(!password.equals(password2)){
                //弹出提示框：两次密码不一致
                JOptionPane.showMessageDialog(this,"两次密码不一致");
                return;
            }//判断用户名是否已经存在
            else if(isExist(userName)){
                //弹出提示框：用户名已经存在
                JOptionPane.showMessageDialog(this,"用户名已经存在");
                return;
            }//注册
            else if(register(userName,password)){
                //弹出提示框：注册成功
                JOptionPane.showMessageDialog(this,"注册成功");
                //关闭当前界面
                this.setVisible(false);
                //注册成功后，跳转到登录界面
                new LoginJFrame();
            }else{
                //弹出提示框：注册失败。注册失败的原因是：写入文件失败，可能是文件不存在，或者文件被占用
                JOptionPane.showMessageDialog(this,"注册失败");
            }
        }else if(source == resetJButton){
            //清除原先输入框里的内容
            userNameJTextField.setText("");
            passwordJPasswordField.setText("");
            passwordJPasswordField2.setText("");
        }
    }

    //在puzzlegame\\userinfo.txt文件中存储用户信息，每一行的格式是：用户名,密码
    //比如：zhangsan,123456
    public static boolean register(String userName,String password){
        //1.创建文件输出流
        try {
            // 打开一个随机访问文件流，按读写方式
            RandomAccessFile randomFile = new RandomAccessFile("puzzlegame\\userinfo.txt", "rw");
            // 文件长度，字节数
            long fileLength = randomFile.length();
            // 将写文件指针移到文件尾。
            randomFile.seek(fileLength);
            randomFile.writeBytes(userName+","+password+"\r");
            randomFile.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //判断用户名是否已经存在
    public static boolean isExist(String userName){
        //每次进入文件，指针都会从头开始
        //1.创建文件输入流
        try {
            //fileReader是字符流，只能读取文本文件，不能读取图片、视频、音频等文件
            FileReader fileReader = new FileReader("puzzlegame\\userinfo.txt");
            //2.读取数据
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            //循环读取每一行，判断用户名是否已经存在，如果存在，返回true，否则返回false，如果读取到文件末尾，返回false，表示用户名不存在
            while((line = bufferedReader.readLine()) != null){
                //循环怎么实现的：文件指针一直往下移动，直到读取到文件末尾，返回null
                //判断用户名是否已经存在
                if(line.split(",")[0].equals(userName)){
                    return true;
                }
            }
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
}

