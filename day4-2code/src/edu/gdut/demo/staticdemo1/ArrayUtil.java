package edu.gdut.demo.staticdemo1;

public class ArrayUtil {
    public ArrayUtil() {
    }

    //以字符串形式返回数组
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i]).append(", ");
        //删除最后一个逗号
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    //求数组平均值
    public static double getAerage(double[] arr){
        double sum=0;
        for(double item: arr)
            sum+=item;
        return sum/arr.length;
    }

    public String toString() {
        return "ArrayUtil{}";
    }

}
