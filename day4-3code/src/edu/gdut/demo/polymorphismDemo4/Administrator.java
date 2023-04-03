package edu.gdut.demo.polymorphismDemo4;

public class Administrator extends Person{

    private String address="武汉";

    @Override
    public void show(){
        System.out.println("Administrator {name="+getName()+", age="+getAge()+"address="+address+"}");
    }
}
