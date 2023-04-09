package edu.gdut.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        /*
         * 需求
         * 要求：按照年龄从小到大排序，如果年龄相同，按照姓名的字母顺序排序
         * 同时，姓名和年龄都相同的元素，只能存储一个
         * */

        //treeSet的两种比较方式：
        //1.默认/自然排序：JavaBean必须实现Comparable接口，重写compareTo方法指定比较规则
        //2.比较器排序：创建TreeSet集合对象时，传递Comparator接口的实现类对象指定比较规则

        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhaoliu", 26);
        Student s5 = new Student("zhaoliu", 26);

        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s1);
        ts.add(s2);

        System.out.println(ts);
        System.out.println("--------");

        /*
         * 将"c","ab","df","qwer"按照字符串的长度从小到大排序，如果长度相同，按照字母顺序排序
         * */
        TreeSet<String> ts2 = new TreeSet<>((o1, o2) -> {
            //按照字符串的长度从小到大排序
            int res = o1.length() - o2.length();
            //如果长度相同，按照字母顺序排序
            res = res == 0 ? o1.compareTo(o2) : res;
            return res;
        });

        ts2.add("c");
        ts2.add("ab");
        ts2.add("df");
        ts2.add("qwer");

        System.out.println(ts2);
        System.out.println("--------");


        TreeSet<Student2> ts3 = new TreeSet<>();
        Student2 s6 = new Student2("zhangsan", 28, 90, 80, 40);
        Student2 s7 = new Student2("lisi", 23, 80, 99, 50);
        Student2 s8 = new Student2("wangwu", 25, 90, 79, 40);
        Student2 s9 = new Student2("zhaoliu", 26, 70, 99, 60);

        ts3.add(s6);
        ts3.add(s7);
        ts3.add(s8);
        ts3.add(s9);

        Iterator<Student2> it = ts3.iterator();
        while (it.hasNext()) {
            Student2 s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");

    }
}
