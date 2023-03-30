package edu.gdut.demo;

class Teacher1{
    private String name;
    private String gender;
    private int age;
    private double height;
    private boolean isSingle;

    public void info(String name,String gender,int age,double heiht,boolean issingle){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(heiht);
        System.out.println(issingle);
    }
}


class Teacher2 {
    private String name;
    private String gender;
    private int age;
    private double height;
    private boolean isSingle;

    public Teacher2(String name, String gender, int age, double height, boolean isSingle) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.isSingle = isSingle;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", isSingle=" + isSingle +
                '}';
    }
}
public class demo1 {
    public static void main(String[] args) {
        Teacher1 teacher1= new Teacher1();
        teacher1.info("chenziyao","man",23,170,true);
        Teacher2 teacher2=new Teacher2("chenziyao","man",23,170,true);
        System.out.println(teacher2.toString());
    }
}

