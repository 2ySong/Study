package Day_07.polymorphisc_.Exercise03;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 16:22
 * @Description:
 */

//普通员工
public class Staff extends Employee{
    public Staff(String name, double salary) {
        super(name, salary);
    }
    //方法重写
    public double getAnnual() {
        return super.getAnnual();
    }
    //特有方法，工作
    public void work(){
        System.out.println("普通员工"+getName()+"正在工作……");
    }
}
