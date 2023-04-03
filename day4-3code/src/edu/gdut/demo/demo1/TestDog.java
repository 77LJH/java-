package edu.gdut.demo.demo1;

public class TestDog {
    public static void main(String[] args) {
        Husky husky=new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();

        ChineseDog chineseDog=new ChineseDog();
        chineseDog.eat();
        chineseDog.drink();
        chineseDog.lookHome();

        SharPei sharPei=new SharPei();
        sharPei.eat();
        sharPei.drink();
        sharPei.lookHome();

        System.out.println("=====================================");

        //多态：
        //下面这段话简单而言就是：而一般默认情况下还是父类优先级更高，毕竟是父类类型所以会先去父类里面找。但是如果子类重写了父类的方法，那么子类的优先级就更高了
        //用多态方法创建对象，成员变量是编译时期的，方法是运行时期的，调用成员变量，调用的是父类的成员变量，调用方法，调用的是子类的方法，
        //调用成员变量：编译看左边，运行看左边
        //编译看左边：编译时期，看父类有没有这个成员变量，如果有，编译通过，如果没有，编译失败
        //运行看左边：运行时期，实际运行的是父类的成员变量
        //调用成员方法：编译看左边，运行看右边
        //编译看左边：编译时期，看父类有没有这个成员方法，如果有，编译通过，如果没有，编译失败
        //运行看右边：运行时期，实际运行的是子类的成员方法
        //调用构造方法：编译看左边，运行看左边
        //编译看左边：编译时期，看父类有没有这个构造方法，如果有，编译通过，如果没有，编译失败
        //运行看左边：运行时期，看父类有没有这个构造方法，如果有，运行通过，如果没有，运行失败


        //多态的好处
        //可以把子类对象赋值给父类引用
        //可以把子类对象当做父类对象使用
        //可以提高代码的扩展性
        //可以提高代码的维护性
        //可以提高代码的可读性





        Dog dog=new Husky();
        dog.eat();

        //多态的弊端
        //不能使用子类特有的功能
        //报错的原因：编译看左边，运行看右边，编译时期看父类有没有这个成员方法，如果有，编译通过，如果没有，编译失败
        //dog.breakHome();

        //解决方法
        //向下转型
        //把父类类型转换为子类类型
        //格式：子类类型 变量名 = (子类类型)父类类型的变量名
        //注意：向下转型一定要保证父类类型的变量名是子类类型的对象，否则会报错

//        if(dog instanceof Husky){
//            Husky husky1=(Husky)dog;
//            husky1.breakHome();
//        }
//        else if(dog instanceof ChineseDog){
//            ChineseDog chineseDog1=(ChineseDog)dog;
//            chineseDog1.eat();
//        }
//        else if(dog instanceof SharPei){
//            SharPei sharPei1=(SharPei)dog;
//            sharPei1.eat();
//        }
//        else{
//            System.out.println("不是狗");
//        }

        //新的解决方法
        if(dog instanceof Husky husky1){
            husky1.breakHome();
        }
        else if(dog instanceof ChineseDog chineseDog1){
            chineseDog1.eat();
        }
        else if(dog instanceof SharPei sharPei1){
            sharPei1.eat();
        }
        else{
            System.out.println("不是狗");
        }

    }
}
