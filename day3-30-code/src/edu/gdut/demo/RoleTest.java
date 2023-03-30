package edu.gdut.demo;

public class RoleTest {
    public static void attackProcess(Role r1,Role r2){
        System.out.println("战斗开始！");
        System.out.println(r1.getName() + " VS " + r2.getName());
        System.out.println(r1.getName() + " 血量：" + r1.getBlood() + " 攻击加成：" + r1.getAttackBonus());
        System.out.println(r2.getName() + " 血量：" + r2.getBlood() + " 攻击加成：" + r2.getAttackBonus());
        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0) {
                System.out.println(r2.getName()+"输了！");
                System.out.println(r1.getName()+"的剩余血量是"+r1.getBlood());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0) {
                System.out.println(r1.getName() + "输了！");
                System.out.println(r2.getName()+"的剩余血量是"+r2.getBlood());
                break;
            }
        }
        System.out.println("战斗结束！");
    }
    public static void main(String[] args) {
        Role r1=new Role("路飞",130,40);
        Role r2=new Role("凯多",160,30);
        attackProcess(r1,r2);
    }
}
