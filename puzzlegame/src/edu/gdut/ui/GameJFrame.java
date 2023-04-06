package edu.gdut.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GameJFrame extends JFrame implements KeyListener ,ActionListener{

    //统计空白方块的位置
    int x=0;
    int y=0;
    int[] data = new int[16];
    //记录步数
    int count=0;

    //可见条目对象是最小的单元，菜单是菜单条目的集合，菜单栏是菜单的集合
    //创建菜单项下面的条目对象：重新游戏，重新登录，关闭游戏，B站号
    JMenuItem restartJMenuItem = new JMenuItem("重新游戏");
    JMenuItem reloginJMenuItem = new JMenuItem("重新登录");
    JMenuItem exitJMenuItem = new JMenuItem("关闭游戏");
    JMenuItem accountJMenuItem = new JMenuItem("公众号");

    //创建《更换图片》菜单项下面的条目对象：美女，动物，运动
    JMenuItem girlJMenuItem = new JMenuItem("美女");
    JMenuItem animalJMenuItem = new JMenuItem("动物");
    JMenuItem sportJMenuItem = new JMenuItem("运动");

    //定义一个变量，记录当前展示图片的路径
    String path = "puzzlegame\\image\\animal\\animal3\\";

    public GameJFrame() {
        //在创建游戏界面的对象的时候，同时给这个界面设置一些信息
        initJFrame();

        //初始化菜单栏
        initJMenuBar();

        //初始化数据打乱图片的布局
        initData();

        //初始化图片
        initImage();

        //设置可见，建议放在最后
        this.setVisible(true);
    }

    //初始化数据打乱图片的布局，得到一个1-16的随机数组，16代表着空白方块，因为根本没有第16张图片，所以JLabel中的图片是空白的
    public void initData(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            arrayList.add(i);
        }
        for(int i = 1; i <= 16; i++){
            //在stringBuilder中随机找一个位置
            int index = (int)(Math.random()*arrayList.size());
            if(arrayList.get(index)==16){
                x=(i-1)%4;
                y=(i-1)/4;
            }
            //把这个位置的字符放到data中
            data[i-1]=arrayList.get(index);
            //在stringBuilder中删除这个位置的字符
            arrayList.remove(index);
        }
    };


    //初始化图片
    public void initImage(){
        //清除原本已出现的所有图片，因为它是先加载的放上面，后加载的放下面，所以要先清除
        this.getContentPane().removeAll();

        //判断是否胜利
        if(isWin()){
            //先加载胜利的图片
            ImageIcon winImage = new ImageIcon("puzzlegame\\image\\win.png");
            JLabel jLabelWin = new JLabel(winImage);
            jLabelWin.setBounds(203,283,197,73);
            this.getContentPane().add(jLabelWin);
        }

        //添加步数
        JLabel jLabelCount = new JLabel("步数："+count);
        jLabelCount.setBounds(50,30,100,30);
        this.getContentPane().add(jLabelCount);

        //添加图片
        for(int i=0;i<16;i++){
            //当图片不存在的时候，JLabel也会加载，但是是一片空白
            //创建一个图片对象
            ImageIcon imageIcon = new ImageIcon(path+ data[i]+".jpg");
            //创建一个标签对象(标签就是一个管理文字和图片的容器)
            JLabel jLabel = new JLabel(imageIcon);
            //指定标签的位置,位置是看切割好的图片的左上角,105是看图片本身大小
            jLabel.setBounds(105*(i%4)+83,105*(i/4)+134,105,105);
            //设置标签的边框
            //raised：凸起的 lowered：凹陷的
            jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
            //把标签添加到窗体上,先获取窗体的内容面板，再把标签添加到内容面板上，JFrame只是一个大的架子，里面还有一个内容面板，它才是来装载所有组件的
            this.getContentPane().add(jLabel);
        }

        //添加背景图片，先加载的图片放在上面，后加载的图片放在下面
        ImageIcon background = new ImageIcon("puzzlegame\\image\\background.png");
        JLabel jLabel = new JLabel(background);
        jLabel.setBounds(40,40,508,560);
        this.getContentPane().add(jLabel);

        //刷新窗体
        this.repaint();
    }

    //初始化菜单栏
    private void initJMenuBar() {
        //初始化菜单
        //创建菜单栏
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单栏上的菜单项的对象：功能，关于我们
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建菜单:更换图片
        JMenu changeJMenu = new JMenu("更换图片");
        changeJMenu.add(girlJMenuItem);
        changeJMenu.add(animalJMenuItem);
        changeJMenu.add(sportJMenuItem);


        //把菜单项下面的条目对象添加到菜单项上
        functionJMenu.add(changeJMenu);
        functionJMenu.add(restartJMenuItem);
        functionJMenu.add(reloginJMenuItem);
        functionJMenu.add(exitJMenuItem);

        aboutJMenu.add(accountJMenuItem);

        //添加监听
        //更换图片:美女，动物，运动
        girlJMenuItem.addActionListener(this);
        animalJMenuItem.addActionListener(this);
        sportJMenuItem.addActionListener(this);
        //重新游戏
        restartJMenuItem.addActionListener(this);
        //重新登录
        reloginJMenuItem.addActionListener(this);
        //关闭游戏
        exitJMenuItem.addActionListener(this);
        //B站号
        accountJMenuItem.addActionListener(this);


        //把菜单添加到菜单栏上
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //把菜单栏添加到窗体上
        this.setJMenuBar(jMenuBar);

    }

    //初始化窗体
    private void initJFrame() {
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

        //给整个窗体添加键盘监听
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松时调用该方法
    @Override
    public void keyPressed(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，此方法就直接结束，不再执行后面的代码
        if(isWin()){
            return;
        }

        int keyCode = e.getKeyCode();

        //按A时打印完整的图片
        if(keyCode == KeyEvent.VK_A){
            System.out.println("按下了A");
            //清除原本已出现的所有图片，因为它是先加载的放上面，后加载的放下面，所以要先清除
            this.getContentPane().removeAll();
            //加载第一张完整的图片
            ImageIcon allImage = new ImageIcon(path+"all.jpg");
            JLabel jLabel = new JLabel(allImage);
            jLabel.setBounds(83,134,420,420);
            this.getContentPane().add(jLabel);
            //加载背景图片
            ImageIcon background = new ImageIcon("puzzlegame\\image\\background.png");
            JLabel jLabel1 = new JLabel(background);
            jLabel1.setBounds(40,40,508,560);
            this.getContentPane().add(jLabel1);
            //刷新窗体
            this.repaint();
        }
    }

    //松开时调用该方法
    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，此方法就直接结束，不再执行后面的代码
        if(isWin()){
            return;
        }


        //获取刚才按下的键
        int keyCode = e.getKeyCode();

        //判断按下的键是上下左右哪个键
        if(keyCode == KeyEvent.VK_UP && y < 3){
            System.out.println("向上移动");
            data[x+y*4]=data[x+(y+1)*4];
            data[x+(y+1)*4]=16;
            count++;
            initImage();
            y++;
        }else if(keyCode == KeyEvent.VK_DOWN && y > 0){
            System.out.println("向下移动");
            data[x+y*4]=data[x+(y-1)*4];
            data[x+(y-1)*4]=16;
            count++;
            initImage();
            //如果按下的是下键，那么y坐标增加105
            y--;
        }else if(keyCode == KeyEvent.VK_LEFT && x < 3){
            System.out.println("向左移动");
            data[x+y*4]=data[x+y*4+1];
            data[x+y*4+1]=16;
            count++;
            initImage();
            //如果按下的是左键，那么x坐标减少105
            x++;
        }else if(keyCode == KeyEvent.VK_RIGHT && x > 0){
            System.out.println("向右移动");
            data[x+y*4]=data[x+y*4-1];
            data[x+y*4-1]=16;
            count++;
            initImage();
            //如果按下的是右键，那么x坐标增加105
            x--;
        } else if (keyCode == KeyEvent.VK_A) {
            //长按A查看完整图片后，回到原先的拼图中,因为长按A时，会把原先的图片清除，所以要重新加载。data数组中的数据不变，所以不用重新初始化
            initImage();
        }else if(keyCode == KeyEvent.VK_W){
            //作弊码，按W直接通关
            //让data数组恢复原先的顺序
            data= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
            initImage();
        }
    }

    //判断是否完成拼图
    public boolean isWin(){
        for (int i = 0; i < data.length; i++) {
            if(data[i] != i+1){
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取事件源
        Object source = e.getSource();

        //判断事件源是哪个按钮
        if(source == restartJMenuItem){
            //重新初始化数据
            initData();
            //重新初始化步数
            count=0;
            //重新初始化图片
            initImage();
        }else if(source == reloginJMenuItem){
            //关闭当前界面
            this.setVisible(false);
            //重新初始化登录界面
            new LoginJFrame();
        }else if(source == exitJMenuItem){
            //退出当前程序
            System.exit(0);
        }else if(source == accountJMenuItem){
            //加载图片
            ImageIcon accountImage = new ImageIcon("puzzlegame\\image\\about.png");
            JLabel jLabelBili = new JLabel(accountImage);
            jLabelBili.setBounds(0,0,258,258);

            //创建一个对话框
            JDialog jDialog = new JDialog();
            //设置对话框的标题
            jDialog.setTitle("公众号");
            //设置对话框的大小
            jDialog.setSize(344,344);
            //设置对话框的内容
            jDialog.getContentPane().add(jLabelBili);
            //设置对话框的位置
            jDialog.setLocationRelativeTo(null);
            //设置对话框总在最前面
            jDialog.setAlwaysOnTop(true);
            //弹窗不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //设置对话框可见
            jDialog.setVisible(true);
        }else if(source == girlJMenuItem){
            //更换图片路径
            path = "puzzlegame\\image\\girl\\girl"+((int)(Math.random()*13)+1)+"\\";
            //重新初始化数据
            initData();
            //重新初始化步数
            count=0;
            initImage();
        }else if(source == animalJMenuItem){
            //更换图片路径
            path = "puzzlegame\\image\\animal\\animal"+((int)(Math.random()*8)+1)+"\\";
            //重新初始化数据
            initData();
            //重新初始化步数
            count=0;
            initImage();
        }else if(source == sportJMenuItem){
            //更换图片路径
            path = "puzzlegame\\image\\sport\\sport"+((int)(Math.random()*10)+1)+"\\";
            //重新初始化数据
            initData();
            //重新初始化步数
            count=0;
            initImage();
        }
    }
}
