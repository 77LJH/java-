package edu.gdut.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        //添加三个学生数据到数组里里面
        Student student1 = new Student("张三", "001", 18);
        Student student2 = new Student("李四", "002", 19);
        Student student3 = new Student("王五", "003", 20);
        Student student4 = new Student("赵六", "003", 21);
        student1.addStudent(students);
        student2.addStudent(students);
        student3.addStudent(students);
        student4.addStudent(students);

        // 键盘输入学生信息
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生信息");
        //输入学生姓名
        System.out.println("请输入学生姓名");
        String name=sc.next();
        //输入学生学号
        System.out.println("请输入学生学号");
        String id=sc.next();
        //输入学生年龄
        System.out.println("请输入学生年龄");
        int age=sc.nextInt();
        Student student5 = new Student(name, id, age);
        student5.addStudent(students);
        //遍历所有学生信息
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
