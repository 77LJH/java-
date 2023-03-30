package edu.gdut.demo;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] array=new Goods[3];
        Goods g1=new Goods("001","华为P40",5999.0,100);
        Goods g2=new Goods("002","保温杯",227.0,50);
        Goods g3=new Goods("003","枸杞",12.7,70);

        array[0] = new Goods("001","华为P40",5999.0,100);
        array[1] = new Goods("002","保温杯",227.0,50);
        array[2] = new Goods("003","枸杞",12.7,70);

        for (Goods goods : array) {
            System.out.println(goods.getId() + " " + goods.getName() + " " + goods.getPrice() + "元 " + goods.getCount() + "件");
        }

    }
}
