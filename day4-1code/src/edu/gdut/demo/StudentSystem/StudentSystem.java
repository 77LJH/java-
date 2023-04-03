package edu.gdut.demo.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    //定义常量,用于判断用户输入,并且可以提高代码的可读性,提高代码的可维护性,提高代码的可扩展性
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String FIND_ALL_STUDENT = "4";
    private static final String EXIT = "5";


    public static void startStudentSystem(String[] args) {

        //创建学生管理对象
        ArrayList<Student> studentManager = new ArrayList<Student>();

        loop2:while(true){
            //打印初始界面菜单
            printMenu();

            //获取用户输入字符
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();

            //根据用户输入执行相应操作
            switch (choice) {
                case ADD_STUDENT ->
                    //添加学生，需满足学号唯一
                        addStudent(studentManager);
                case DELETE_STUDENT ->
                    //删除学生，需满足学号存在则删除，否则提示学号不存在
                        deleteStudent(studentManager);
                case UPDATE_STUDENT ->
                    //修改学生，需满足学号存在则修改，否则提示学号不存在
                        updateStudent(studentManager);
                case FIND_ALL_STUDENT ->
                    //查看所有学生，需满足如果没有学生信息则提示学生管理系统没有学生信息，否则打印所有学生信息
                        findAllStudent(studentManager);
                case EXIT -> {
                    //退出
                    System.out.println("谢谢使用！");
                    //System.exit(0);//停止虚拟机运行
                    break loop2;
                }
                default ->
                    //输入错误
                        System.out.println("输入错误，请重新输入！");
            }
        }
    }




    //打印系统界面菜单
    public static void printMenu() {
        System.out.println("-------------欢迎使用学生管理系统------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看所有学生");
        System.out.println("5.退出");
        System.out.println("请输入你的选择：");
    }

    //添加学生
    public static void addStudent(ArrayList<Student> studentManager) {

        //获取学生信息
        Scanner scanner = new Scanner(System.in);
        String id;
        while(true){
            System.out.println("请输入学生学号：");
            id = scanner.next();
            if(checkId(studentManager, id)>=0){
                System.out.println("学号已存在，请重新输入！");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = scanner.next();
        System.out.println("请输入学生年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入学生住址：");
        String address = scanner.next();

        //创建学生对象
        Student student = new Student(name, age, id, address);

        //将学生对象添加到学生管理对象中
        studentManager.add(student);

        System.out.println("添加学生成功！");
    }


    //删除学生
    private static void deleteStudent(ArrayList<Student> studentManager) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        for(int times=0;times<3;times++){//最多输入三次
            String id=sc.next();
            //判断学号是否存在
            int index=checkId(studentManager, id);
            if(index>=0){
                //删除学生
                for(int i=index+1;i<studentManager.size();i++)
                    studentManager.set(i-1, studentManager.get(i));
                System.out.println("删除成功！");
                break;
            }else if(index==-1){
                //打印还剩几次输入机会
                if(2-times>0)
                    System.out.println("学号不存在，请重新输入！还剩"+(2-times)+"次输入机会");
                else
                    System.out.println("学号不存在，输入错误次数过多，退出“删除学生”模式！");
            }else{
                System.out.println("学生管理系统没有学生信息！");
                break;
            }
        }
    }


    //修改学生
    private static void updateStudent(ArrayList<Student> studentManager) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        for(int times=0;times<3;times++){//最多输入三次
            String id=sc.next();
            //判断学号是否存在
            int index=checkId(studentManager, id);
            if(index>=0){
                //修改学生
                System.out.println("请输入修改后的学生姓名：");
                String name=sc.next();
                System.out.println("请输入修改后的学生年龄：");
                int age=sc.nextInt();
                System.out.println("请输入修改后的学生住址：");
                String address=sc.next();
                studentManager.set(index, new Student(name, age, id, address));
                System.out.println("修改成功！");
                break;
            }else if(index==-1){
                //打印还剩几次输入机会
                if(2-times>0)
                    System.out.println("学号不存在，请重新输入！还剩"+(2-times)+"次输入机会");
                else
                    System.out.println("学号不存在，输入错误次数过多，退出“修改学生”模式！");
            }else{
                System.out.println("学生管理系统没有学生信息！");
                break;
            }
        }
    }


    //查看所有学生
    private static void findAllStudent(ArrayList<Student> studentManager) {
        //判断学生管理系统是否有学生信息
        if(studentManager.size()==0){
            System.out.println("学生管理系统没有学生信息！");
        }else{
            System.out.println("学号\t\t姓名\t\t年龄\t\t住址");
            for(Student stu:studentManager){
                System.out.println(stu.getId()+"\t\t"+stu.getName()+"\t\t"+stu.getAge()+"\t\t"+stu.getAddress());
            }
        }
    }


    //先判断是否有学生管理系统是否有学生信息，无学生信息则返回-2，否则检查学生id是否存在,存在则返回下标，否则返回-1
    public static int checkId(ArrayList<Student> studentManager, String id) {
        int index=-1;
        //判断是否有学生管理系统是否有学生信息
        if(studentManager.size()==0){
            return -2;
        }
        //遍历学生管理对象，查找学号是否存在
        for(Student stu:studentManager){
            if(stu.getId().equals(id)){
                index=studentManager.indexOf(stu);
                break;
            }
        }
        return index;
    }
}
