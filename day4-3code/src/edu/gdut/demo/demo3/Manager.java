package edu.gdut.demo.demo3;

public class Manager extends Employee {
    //成员变量：奖金
    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    //成员方法：工作，吃饭
    @Override
    public void work() {
        System.out.println("管理员在管理其他人");
    }


    /**
     * 获取
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Manager {bonus=" + bonus + ", getId()=" + getId() + ", getName()=" + getName() + ", getSalary()="
                + getSalary() + "}";
    }

}

