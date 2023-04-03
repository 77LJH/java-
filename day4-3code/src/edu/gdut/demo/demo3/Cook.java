package edu.gdut.demo.demo3;

public class Cook extends Employee{

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师在炒菜");
    }


    public String toString() {
        return "Cook {getId()=" + getId() + ", getName()=" + getName() + ", getSalary()="
                + getSalary() + "}";
    }
}
