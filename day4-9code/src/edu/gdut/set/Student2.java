package edu.gdut.set;

public class Student2 implements Comparable<Student2> {
    String name;
    int age;
    int chinese;
    int math;
    int english;

    public Student2() {
    }


    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
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

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", totalScore = " + this.getSum() + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        //比较规则是：
        //1.总分高的排前面
        //2.总分相同，语文成绩高的排前面
        //3.总分和语文成绩都相同，数学成绩高的排前面
        //4.总分和语文成绩和数学成绩都相同，英语成绩高的排前面
        //5.总分和语文成绩和数学成绩和英语成绩都相同，名字字典序靠前的排前面
        //6.总分和语文成绩和数学成绩和英语成绩和名字字典序都相同，年龄小的排前面
        //7.总分和语文成绩和数学成绩和英语成绩和名字字典序和年龄都相同，认为是同一个人，不需要重复添加

        //这里的this指的是当前对象，o指的是要比较的对象
        //如果当前对象排在前面，返回一个正数
        //如果当前对象排在后面，返回一个负数
        //如果当前对象和要比较的对象位置相同，返回0

        int res = this.getSum() - o.getSum();
        res = res == 0 ? this.chinese - o.chinese : res;
        res = res == 0 ? this.math - o.math : res;
        //英语其实不用比较，因为总分和语文成绩和数学成绩都相同，那么英语成绩肯定也相同
        res = res == 0 ? this.english - o.english : res;
        res = res == 0 ? this.name.compareTo(o.name) : res;
        res = res == 0 ? this.age - o.age : res;
        return res;
    }

    public int getSum() {
        return this.chinese + this.math + this.english;
    }
}
