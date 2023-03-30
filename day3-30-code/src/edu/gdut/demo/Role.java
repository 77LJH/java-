package edu.gdut.demo;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private int attackBonus;

    public Role() {
    }

    public Role(String name, int blood, int attackBonus) {
        this.name = name;
        this.blood = blood;
        this.attackBonus = attackBonus;
    }


    // A攻击B
    public void attack(Role wounded){
        int attackValue=Random_Attack_Value(attackBonus);
        if(wounded.blood<attackValue)
            wounded.blood=0;
        else
            wounded.blood-=attackValue;
        System.out.println(this.name+"给"+wounded.name+"造成了"+attackValue+"点的伤害    "+wounded.name + "的剩余血量为：" + wounded.blood);
        //System.out.println(wounded.name + "的剩余血量为：" + wounded.blood);
    }


    private int Random_Attack_Value(int attack_Bonus){
        Random rd=new Random();
        int attackValue= rd.nextInt(20+attack_Bonus)+1;
        return attackValue;
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
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     * @return attackBonus
     */
    public int getAttackBonus() {
        return attackBonus;
    }

    /**
     * 设置
     * @param attackBonus
     */
    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + ", attackBonus = " + attackBonus + "}";
    }
}
