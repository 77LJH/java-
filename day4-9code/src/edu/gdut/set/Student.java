package edu.gdut.set;

import java.util.Objects;

public class Student implements Comparable<Student>{
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        //按照年龄从小到大排序，如果年龄相同，按照姓名的字母顺序排序
        //this:当前对象 o:比较的对象 返回值：正数，负数，0
        // 正数：当前对象大，存右边    负数：当前对象小，存左边     0：当前对象和比较的对象相同，已存在
        int num = this.age - o.age;
        num = num == 0 ? this.name.compareTo(o.name) : num;
        return num;
    }
}
