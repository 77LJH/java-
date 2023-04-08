package edu.gdut.systemdemo;

public class SystemDemo {
    //System类中的方法都是静态的,所以可以直接通过类名调用,属于工具类
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        //currentTimeMillis()返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差
        //我国的时间是东八区，所以要加8个小时
        System.out.println(System.currentTimeMillis());

        //arraycopy()数组复制
        //格式:arraycopy(源数组,起始索引,目标数组,其实索引,复制几个)
        //细节：
        //1.如果源数组和目标数组都是基本类型，那么就是值传递，二者的类型必须一致
        //2.如果源数组和目标数组都是引用类型，那么就是地址传递，那么子类类型可以赋值给父类类型
        //上面二者有什么区别：如果是值传递，那么源数组和目标数组就是两个不同的数组，如果是地址传递，那么源数组和目标数组就是同一个数组
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src, 0, dest, 0, 3);
        for (int j : dest) {
            System.out.println(j);
        }
        System.out.println(src==dest);


        long end = System.currentTimeMillis();
        System.out.println(end - start);

        //exit()退出JVM
        System.exit(0);
        System.out.println("hello");
    }
}
