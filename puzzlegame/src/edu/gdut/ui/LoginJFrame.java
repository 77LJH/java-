package edu.gdut.ui;

import edu.gdut.ui.Util.CodeUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginJFrame extends JFrame implements ActionListener{

    //创建一个登录按钮
    JButton loginJButton = new JButton();
    //创建一个注册按钮
    JButton registerJButton = new JButton();


    //创建一个用户名输入框
    JTextField usernameJTextField = new JTextField();
    //创建一个密码输入框
    JPasswordField passwordJPasswordField = new JPasswordField();
    //创建一个验证码输入框
    JTextField codeJTextField = new JTextField();
    //创建一个右侧验证码
    JLabel rightCode = new JLabel();

    String codeStr;


    public LoginJFrame() {
        //在创建登录界面的对象的时候，同时给这个界面设置一些信息

        //直接把登录界面显示出来
        initJFrame();

        //在这个页面中添加内容
        initView();

        //设置可见，建议放在最后
        this.setVisible(true);
    }

    //初始化登录界面
    private void initView() {
        //1.添加用户名图片
        ImageIcon usernameImage = new ImageIcon("puzzlegame\\image\\login\\用户名.png");
        JLabel usernameJLabel = new JLabel(usernameImage);
        //设置图片的xy位置
        usernameJLabel.setBounds(116, 135, 47, 17);
        //把图片添加到界面上
        this.getContentPane().add(usernameJLabel);

        //2.添加用户名输入框
        //JTextField usernameJTextField = new JTextField();
        //设置输入框的xy位置
        usernameJTextField.setBounds(195, 134, 200, 30);
        this.getContentPane().add(usernameJTextField);

        //1.添加密码图片
        ImageIcon passwordImage = new ImageIcon("puzzlegame\\image\\login\\密码.png");
        JLabel passwordJLabel = new JLabel(passwordImage);
        //设置图片的xy位置
        passwordJLabel.setBounds(130, 195, 32, 16);
        //把图片添加到界面上
        this.getContentPane().add(passwordJLabel);

        //2.添加密码输入框
        //JPasswordField passwordJPasswordField = new JPasswordField();
        //设置输入框的xy位置
        passwordJPasswordField.setBounds(195, 195, 200, 30);
        this.getContentPane().add(passwordJPasswordField);


        //1.添加验证码图片
        ImageIcon codeImage = new ImageIcon("puzzlegame\\image\\login\\验证码.png");
        JLabel codeJLabel = new JLabel(codeImage);
        //设置图片的xy位置
        codeJLabel.setBounds(133, 256, 50, 30);
        //把图片添加到界面上
        this.getContentPane().add(codeJLabel);

        //2.添加验证码输入框
        //JTextField codeJTextField = new JTextField();
        //设置输入框的xy位置
        codeJTextField.setBounds(195, 256, 100, 30);
        this.getContentPane().add(codeJTextField);

        //3.添加右侧的验证码
        codeStr = CodeUtil.generateCode();
        //设置内容
        rightCode.setText(codeStr);
        //位置与宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面上
        this.getContentPane().add(rightCode);


        //设置按钮的背景图片
        ImageIcon loginImage = new ImageIcon("puzzlegame\\image\\login\\登录按钮.png");
        loginJButton.setIcon(loginImage);
        //设置按钮的位置和大小
        loginJButton.setBounds(123, 310, 128, 47);
        //去除按钮的背景
        loginJButton.setBorderPainted(false);
        //去除按钮的背景
        loginJButton.setContentAreaFilled(false);
        //把按钮添加到界面上
        this.getContentPane().add(loginJButton);

        //设置按钮的背景图片
        ImageIcon registerImage = new ImageIcon("puzzlegame\\image\\register\\注册按钮.png");
        registerJButton.setIcon(registerImage);
        //设置按钮的位置和大小
        registerJButton.setBounds(256, 310, 128, 47);
        //去除按钮的背景
        registerJButton.setBorderPainted(false);
        //去除按钮的背景
        registerJButton.setContentAreaFilled(false);
        //把按钮添加到界面上
        this.getContentPane().add(registerJButton);

        //添加背景图片。先加载的图片放在上面，后加载的图片放在下面
        ImageIcon background = new ImageIcon("puzzlegame\\image\\login\\background.png");
        JLabel jLabel = new JLabel(background);
        jLabel.setBounds(0,0,470,390);
        this.getContentPane().add(jLabel);
    }

    //在创建登录界面的对象的时候，同时给这个界面设置一些信息
    public void initJFrame(){
        //设置标题
        this.setTitle("拼图游戏 V1.0登录界面");
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

        //给按钮添加监听事件
        loginJButton.addActionListener(this);
        registerJButton.addActionListener(this);
        //给右方验证码添加监听事件
        rightCode.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //鼠标点击右侧验证码的时候，重新生成验证码
                codeStr = CodeUtil.generateCode();
                rightCode.setText(codeStr);
            }
        });
    }

    //设置按钮
    //给按钮添加动作监听器
    //jButton：组件对象，比如按钮，文本框，下拉框等，表示你要给哪个组件添加事件
    //e：事件对象，表示你点击了按钮，或者你选择了下拉框的某一项，或者你输入了文本框的内容
    //addActionListener：添加动作监听器，表示你要给按钮添加点击事件(动作监听包含了鼠标左键点击，键盘空格敲击，触摸屏点击等)
    //参数；表示事件被触发之后，要执行的代码
    //e -> {}：表示事件被触发之后，要执行的代码，这个代码是一个匿名内部类，�?��的代码是一个函数式接口，所以可以用lambda表达式来简化
    //创建一个登录按钮

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == loginJButton){
            //获取用户名，密码，验证码
            String userName = usernameJTextField.getText();
            String password = new String(passwordJPasswordField.getPassword());
            String code = codeJTextField.getText();
            if("".equals(userName)){
                //当用户名为空的时候，弹出提示框，并且重置所有输入框和验证码
                JOptionPane.showMessageDialog(this,"用户名不能为空");
                reset();
            }else if("".equals(password)){
                //当密码为空的时候，弹出提示框，并且重置所有输入框和验证码
                JOptionPane.showMessageDialog(this,"密码不能为空");
                reset();
            }else if("".equals(code)){
                //当验证码为空的时候，弹出提示框，并且重置验证码
                JOptionPane.showMessageDialog(this,"验证码不能为空");
                //重新生成验证码
                codeStr = CodeUtil.generateCode();
                rightCode.setText(codeStr);
            }else if(!checkCode(codeStr,code)){
                //当验证码错误的时候，弹出提示框，并且重置验证码输入框和验证码
                JOptionPane.showMessageDialog(this,"验证码错误");
                codeJTextField.setText("");
                //重新生成验证码
                codeStr = CodeUtil.generateCode();
                rightCode.setText(codeStr);
            }else if(!login(userName,password)){
                //当用户名或密码错误的时候，弹出提示框，并且重置所有输入框和验证码
                JOptionPane.showMessageDialog(this,"用户名或密码错误");
                reset();
            }else{//登录成功
                //关闭当前界面
                this.setVisible(false);
                //打开游戏界面
                new GameJFrame();
            }
        }else if(source == registerJButton){
            //关闭当前界面
            this.setVisible(false);
            //打开注册界面
            new RegisterJFrame();
        }
    }

    //清除全部输入框的内容并且重新生成验证码
    private void reset() {
        //清除全部输入框的内容
        usernameJTextField.setText("");
        passwordJPasswordField.setText("");
        codeJTextField.setText("");
        //重新生成验证码
        codeStr = CodeUtil.generateCode();
        rightCode.setText(codeStr);
    }

    //判断用户名和密码是否正确
    private static boolean login(String username,String password) {
        //每次进入文件，指针都会从头开始
        try {
            //fileReader是字符流，只能读取文本文件，不能读取图片、视频、音频等文件
            FileReader fileReader = new FileReader("puzzlegame\\userinfo.txt");
            //2.读取数据
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                //判断用户名和密码是否正确
                if(line.split(",")[0].equals(username) && line.split(",")[1].equals(password)){
                    return true;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    //判断验证码是否正确
    private static boolean checkCode(String codeStr,String code) {
        //判断用户输入的验证码是否正确，忽略大小写
        return codeStr.equalsIgnoreCase(code);
    }

}
