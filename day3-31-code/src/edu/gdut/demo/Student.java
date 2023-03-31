package edu.gdut.demo;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private int age;

    public Student() {
    }
    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void addStudent(ArrayList<Student> students) {
        System.out.println("添加学生: "+this);
        for (int i = 0; i < students.size(); i++)
            if (students.get(i).getId().equals(id)) {
                System.out.println("学号重复");
                return;
            }
        students.add(this);
        System.out.println("添加成功");

    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
    }
}
