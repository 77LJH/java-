package edu.gdut.demo.staticdemo1;

public class TestDemo {
    public static void main(String[] args) {

        // 2. 编写一个测试类TestDemo，测试ArrayUtil工具类中的方法
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(ArrayUtil.printArr(arr));
        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(ArrayUtil.getAerage(arr2));
    }

}
