package edu.gdut.demo.StudentSystem;

import edu.gdut.demo.Test1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //为学生管理系统书写一个登录、注册、忘记密码的功能
        //先创造几个用户
        ArrayList<User> users = new ArrayList<User>();

        //创建用户
        users.add(new User("liu","123asd","456781234567890123","13245678901"));
        users.add(new User("zhang","456fgh","678934545601231278","13945376726"));
        users.add(new User("wang","789jkl","786123456901234578","15323424234"));

        loop1:while(true){
            //打印登录菜单
            printLogin();

            //获取用户输入
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();

            //根据用户输入执行相应操作
            switch (choice) {
                case "1" -> {
                    //登录
                    if(login(users))
                        break loop1;
                    //三次登录错误请等待
                    waitTime();
                }
                case "2" ->
                    //注册
                        register(users);

                case "3" -> {
                    //忘记密码
                    if(forgetPassword(users))
                        break loop1;
                    //三次验证错误请等待
                    waitTime();
                }
                case "4" -> {
                    //退出
                    System.out.println();
                    System.exit(0);
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }

        //登录成功后进入学生管理系统
        StudentSystem.startStudentSystem(args);
    }

    //打印初始界面
    private static void printLogin() {
        System.out.println("-------------欢迎来到学生管理系统------------");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.忘记密码");
        System.out.println("4.退出该程序");
        System.out.println("请输入你的选择：");
    }

    //重新刷新的等待时间
    private static void waitTime() {
        int countdown = 6; // 设置倒计时的时间为6秒
        while (countdown >= 0) {
            System.out.println("请等待" + countdown + "秒后重新尝试，系统将自动返回登录界面");
            try {
                Thread.sleep(1000); // 暂停1秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countdown--;
        }
    }

    //登录
    private static boolean login(ArrayList<User> users) {

        //创建循环，让用户有三次机会输入用户名和密码
        for(int times=0;times<3;times++){

            //获取用户输入
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();

            //判断用户输入是否正确
            for (User user : users) {
                //如果用户名和密码都正确，登录成功
                if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                    //验证码输入和检测检测部分
                    checkCode();

                    System.out.println("登录成功！");
                    return true;
                }
            }

            //如果用户名和密码不都正确，登录失败
            if(times==2)
                System.out.println("三次均错误，请检查该用户是否注册！如果忘记密码可选择“忘记密码”进行修改\n");
            else
                System.out.println("账号或密码错误，还剩"+(2-times)+"次机会，请重新输入！");
        }
        return false;
    }


    //验证码输入和检测检测部分
    private static void checkCode() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            //创建验证码
            String code = generateCode();
            //请先输入验证码
            System.out.println("请输入验证码："+code);
            String inputCode = scanner.next();
            //判断验证码是否正确，大小写不敏感
            if(!code.equalsIgnoreCase(inputCode)){
                System.out.println("验证码错误，请重新输入！");
                continue;
            }
            else
                break;
        }
    }

    //生成验证码，要求:长度为6位，由4位字母和2位数字组成
    private static String generateCode() {
        //创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();

        //创建一个随机数对象
        Random random = new Random();

        //创建一个字符串，包含所有的字母
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //创建一个字符串，包含所有的数字
        String num = "0123456789";

        //循环4次，生成4个随机字母
        for(int i=0;i<4;i++){
            //随机生成一个下标
            int index = random.nextInt(str.length());
            //根据下标获取对应的字符
            char ch = str.charAt(index);
            //将字符添加到StringBuilder中
            sb.append(ch);
        }

        //循环2次，生成2个随机数字
        for(int i=0;i<2;i++){
            //随机生成一个下标
            int index = random.nextInt(num.length());
            //根据下标获取对应的字符
            char ch = num.charAt(index);
            //将字符添加到StringBuilder中
            sb.append(ch);
        }

        //引用Test1类中的disorganize方法，将验证码打乱并返回验证码
        return Test1.disorgniaze(sb.toString());
    }

    //注册
    private static void register(ArrayList<User> users) {
        //获取用户输入
        Scanner scanner = new Scanner(System.in);

        //判断用户名是否合规
        String username;
        while(true){
            System.out.println("请输入用户名：");
            username = scanner.next();

            //检验用户名的有效性，返回true表示有效，返回false表示无效：用户名长度必须在3-15位之间，用户名只能由字母、数字组成，不能由纯数字组成
            if(!checkUsername(username))
                continue;

            //判断用户 是否已存在
            if(!checkUsernameExist(users,username))
                break;
            else
                System.out.println("用户名"+username+"已存在！请重新输入：");

        }

        //输入两次密码，一致即可
        String password= generatePassword();

        //输入身份证号码，要求:长度为18位，不能以0开头，前17位必须都是数字，最后一位可以是数字还可以是大写X也可以是小写x
        String idCard;
        do {
            System.out.println("请输入身份证号码：");
            idCard = scanner.next();
            //判断身份证号码是否合规
        } while (!checkIdCard(idCard));


        //输入手机号码，要求:长度为11位，不能以0开头，必须都是数字
        String phone;
        do{
            System.out.println("请输入手机号码：");
            phone = scanner.next();
            //判断手机号码是否合规
        }while(!checkPhone(phone));

        //验证码输入和检测检测部分
        checkCode();
        //将用户信息添加到集合中
        users.add(new User(username,password,idCard,phone));
        System.out.println("注册成功！");

    }

    //检查手机号码是否合规
    private static boolean checkPhone(String phone) {
        if(phone.length()!=11){
            System.out.println("输入的手机号码长度不符合规范，请重新输入！");
            return false;
        }
        if(phone.charAt(0)=='0'){
            System.out.println("手机号码不能以0开头，请重新输入！");
            return false;
        }
        for(int i=0;i<11;i++)
            if(!Character.isDigit(phone.charAt(i))){
                System.out.println("输入的手机号码必须都是数字，请重新输入！");
                return false;
            }
        return true;
    }


    //输入身份证号码，要求:长度为18位，不能以0开头，前17位必须都是数字，最后一位可以是数字还可以是大写X也可以是小写x
    public static boolean checkIdCard(String idCard){
        if(idCard.length()!=18){
            System.out.println("输入的身份证号码长度不符合规范，请重新输入！");
            return false;
        }
        if(idCard.charAt(17)=='0'){
            System.out.println("身份证号码不能以0开头，请重新输入！");
        }
        for(int i=1;i<17;i++)
            if(!Character.isDigit(idCard.charAt(i))){
                System.out.println("输入的身份证号码前17位必须都是数字，请重新输入！");
                return false;
            }
        if(Character.isDigit(idCard.charAt(17)) || idCard.charAt(17)=='x' || idCard.charAt(17)=='X')
            return true;
        else {
            System.out.println("输入的身份证号码最后一位必须是数字或者是大写X或者是小写x，请重新输入！");
            return false;
        }
    }


    //输入两次密码，一致即可
    private static String generatePassword() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入密码：");
            String password = sc.next();
            System.out.println("请再次输入密码：");
            String password2 = sc.next();
            if(!password.equals(password2))
                System.out.println("两次密码不一致，请重新输入！");
            else return password;
        }
    }

    //检验用户名的有效性，返回true表示有效，返回false表示无效：用户名长度必须在3-15位之间，用户名只能由字母、数字组成，不能由纯数字组成
    public static boolean checkUsername(String username){
        //用户名长度必须在3-15位之间
        if(username.length()<3 || username.length()>15){
            System.out.println("用户名长度必须在3-15位之间，请重新输入！");
            return false;
        }

        int flag=1;
        //用户名只能由字母、数字组成，不能由纯数字组成
        for(int i=0;i<username.length();i++){
            if(!Character.isLetterOrDigit(username.charAt(i))){
                System.out.println("用户名只能由字母和数字组成，请重新输入！");
                return false;
            }
            if(Character.isLetter(username.charAt(i)))
                flag=0;
        }
        if(flag==1){
            System.out.println("用户名不能由纯数字组成，请重新输入！");
            return false;
        }
        return true;
    }

    //判断用户名是否存在
    public static boolean checkUsernameExist(ArrayList<User> users,String username){
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    //忘记密码
    private static boolean forgetPassword(ArrayList<User> users) {
        //获取用户输入
        for(int times=0;times<3;times++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入身份证号码：");
            String idCard = scanner.next();
            System.out.println("请输入手机号码：");
            String phone = scanner.next();

            //判断用户输入是否正确
            for (User user : users) {
                //如果用户输入正确则修改密码
                if(user.getUsername().equals(username) && user.getIdCard().equals(idCard) && user.getPhone().equals(phone)){
                    //如果身份证号码和手机号码都正确则修改密码
                    user.setPassword(generatePassword());
                    //验证码输入和检测检测部分
                    checkCode();
                    System.out.println("修改成功！");
                    return true;
                }
            }

            //如果用户名、身份证号码和手机号码不都正确，登录失败
            if(times==2)
                System.out.println("三次均验证失败！\n");
            else
                System.out.println("验证失败，还剩"+(2-times)+"次机会，请重新输入！");
        }
        return false;
    }
}
