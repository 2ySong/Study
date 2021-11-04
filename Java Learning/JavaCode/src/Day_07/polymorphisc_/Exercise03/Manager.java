package Day_07.polymorphisc_.Exercise03;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 16:26
 * @Description:
 */

//经理类
public class Manager extends Employee{
    private double bonus;//经理奖金

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //方法重写
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
    //特有方法
    public void manage(){
        System.out.println(" | 经理--"+getName()+"--在管理 | ");
    }
}
